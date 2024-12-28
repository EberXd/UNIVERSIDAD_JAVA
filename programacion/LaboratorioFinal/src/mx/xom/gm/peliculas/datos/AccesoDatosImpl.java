package mx.xom.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {

    //imlementar todos los metodos de la interface, se le conococe como cumplir
    //el contrato de la interface
    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        //creamos un objeto tipo fail en memoria
        File archivo = new File(nombreRecurso);

        //este metodo exist de la clase file nos permite verificar s ya existe
        //el archivo, y regresa como respuesta un boolean
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        //se crea un objeto tipo file
        var archivo = new File(nombre);
        //se crea u objeto tipo arraylist
        //que almacenara datos detipo pelicula
        List<Pelicula> peliculas = new ArrayList();

        try {
            //leemos cada linea del archivo con ayuda deBufferedReader y FileReader
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));

            String linea = null;
            //usamos el metodo de bufferReader

            linea = entrada.readLine();

            while (linea != null) {
                //con el while recorremos todas las lineas
                //y creamos un objeto de pelicula por cada linea

                Pelicula pelicula = new Pelicula(linea);
                //agregamos a nuestra lista de peliculas
                //cada objeto diferente de peliculas
                peliculas.add(pelicula);

                //se aggrega al final la revision de la linea
                //para asi poder repetir elciclo con ayuda del while
                linea = entrada.readLine();
            }
            //cerramos el flujo
            entrada.close();

        } catch (FileNotFoundException ex) {

            //manda la excepcion a consola
            ex.printStackTrace();
            //Asi se propaga una exception 
            //el metdo getMessage te saca 
            //el mensaje que manda por default
            throw new LecturaDatosEx("Surgio un error en listar peliculas"
                    + ex.getMessage());
        } catch (IOException ex) {
            throw new LecturaDatosEx("Surgio un error en listar peliculas"
                    + ex.getMessage());
        }

        return peliculas;

    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        //file para acceder al archivo
        var archivo = new File(nombreRecurso);

        try {
            //nuevo objeto para acceder a los metodos escribir
            //les pasamos el nombre del archivo y el texto
            //el boolean que pasamos debe ser true para que edite y no sobre escriba
            //el objeto
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            //con to string pasamos el nombre de la pelicula
/////////////////////////////////////////////////////////////////////////////////
//ugalde pasa el to Stringy lo modifica para que solo mande el nombre de la pelicula
//pero creo con el get nombre es suficiente
            salida.println(pelicula.getNombre());
            //se cierra fljo
            salida.close();
            System.out.println("Se agrego al archivo: " + pelicula.getNombre());
        } catch (IOException ex) {

            throw new EscrituraDatosEx("Surgio un error en escribir peliculas"
                    + ex.getMessage());

        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String resultado = null;
        try {

            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();

            var indice = 1;

            while (linea != null) {
                //equalsIgnoreCase nos sirve para ignrr diferencias
                //entre minusculas o mayusculas
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + " encontrada en el indice  " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }

        } catch (FileNotFoundException ex) {

            throw new LecturaDatosEx("Surgio un error en buscar pelicula"
                    + ex.getMessage());

        } catch (IOException ex) {
            throw new LecturaDatosEx("Surgio un error en buscar pelicula"
                    + ex.getMessage());
        }

        return resultado;

    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        //creamos un objeto tipo fail en memoria
        File archivo = new File(nombreRecurso);

        try {
            //Te solicita una variable tipo file
            //tambbien para usar el objeto tipo PrintWriter,  requerimos
            //de envolver en un try catch por que puede mandar una excepcion al
            //crear el archivo
            PrintWriter salida = new PrintWriter(archivo);
            //se cierra el archivo
            salida.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
