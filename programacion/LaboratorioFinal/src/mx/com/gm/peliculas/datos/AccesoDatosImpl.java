package mx.com.gm.peliculas.datos;

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

        //este metodo exist de la clase file nos permite verificar si ya existe
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

        //Se rertoerna la lista de objetos tipo peliculas
        //asi como indica la interface 
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
//ugalde pasa el toString, lo modifia para que solo mande el nombre de la pelicula
//pero creo con el get nombre es suficiente
//no se si vaya a tener error de permisos por si acaso nos regresamos aqui y lo corregimos
//Video 6 LabFinal min 2:21
            salida.println(pelicula.getNombre());
            //se cierra fljo
            salida.close();
            System.out.println("Se edito el archivo: " + pelicula.getNombre());
        } catch (IOException ex) {
            //en este caso propagamos el error a la clase de Escritura ya que los
            //errores anteriores eran de tipo lectura
            throw new EscrituraDatosEx("Surgio un error en escribir peliculas"
                    + ex.getMessage());

        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        //Se abre el archivo o se crea
        var archivo = new File(nombreRecurso);

        String resultado = null;

        try {
            //Aqui creamos un objeto tipo bufferedreader para vollver a acceder 
            //a las lineas y poder leerlas 
            //le pasamos al buffered un objeto tipo File reader que este a su ves
            //exige un objetoi tipo file, el cual definimos en la primera linea
            //de nuestro metodo
            var entrada = new BufferedReader(new FileReader(archivo));
            //variable para almacenar lo leido
            String linea = null;
            //almacenamos lo leido
            linea = entrada.readLine();

            //Esta variable nos servira como contador en el while
            int indice = 1;
            //Si el while es diferente de nullo significa que tiene informacion
            //con esto se activa el ciclo y comenzamosd a leer el archivo

            while (linea != null) {

                //si la variable buscar no esta vacia y ademas
                //la variable coincide con la linea leida
                //se ejecuta el codigo del IF
                //con ignore case no solo compara las variables,
                //si no que tambien ignora la diferencia entre mayusculas y minisculas
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {

                    resultado = "Pelicula " + linea + "Encontrada en el indice" + indice;

                    //agregamos un brake para que el ciclo while termine
                    //despues de encontrar lo que se busco
                    break;
                }
                //si no se ejecuto el if entonces volvemos a revisar la siguiente linea
                //para que el ciclo siga ejecutandoce
                linea = entrada.readLine();
                //se incrementa el indice 
                indice++;

            }
            //se cierra el flujo
            entrada.close();

        } catch (FileNotFoundException ex) {

            //manda la excepcion a consola
            ex.printStackTrace();
            //Asi se propaga una exception 
            //el metdo getMessage te saca 
            //el mensaje que manda por default
            throw new LecturaDatosEx("Surgio un error en buscar peliculas"
                    + ex.getMessage());

        } catch (IOException ex) {

            //manda la excepcion a consola
            ex.printStackTrace();
            //Asi se propaga una exception 
            //el metdo getMessage te saca 
            //el mensaje que manda por default
            throw new LecturaDatosEx("Surgio un error en buscar peliculas"
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
        } catch (IOException ex) {

            ex.printStackTrace();

            throw new AccesoDatosEx("Surgio un error en crear archivo"
                    + ex.getMessage());

        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {

        var archivo = new File(nombreArchivo);
        
        //Con el if se valida que exista el archivo a borrar
        if (archivo.exists()) {
               //este metodo de la clase file es la que elimina el archivo
            archivo.delete();
            System.out.println("Se ha borrado el archivo correctamente");

        }else{
            
            System.out.println("El archivo no existe");
            
        }

    }

}
