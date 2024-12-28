package manejoarchivos;
//io significa input output 
//la clase quue utilizaremos esta en esa carpeta

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author eber
 */
public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        //creamos un objeto tipo fail en memoria
        File archivo = new File(nombreArchivo);

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

    //Este metodo en si sobre escribe la informaion que se le pasa
    //osea que si lo volvemos a sar se borra lo anterior
    public static void escribirArchivo(String nombreArchivo, String contenido) {

        //creamos un objeto tipo fail en memoria
        File archivo = new File(nombreArchivo);

        try {
            //basicamente este objeto crea y abre el archivo
            PrintWriter salida = new PrintWriter(archivo);

            //despues de haber abierto nuestro archivo escribimosdentro del mismo
            salida.println(contenido);

            //se cierra el archivo
            salida.close();
            System.out.println("Se  escribio en el archivo");
        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

        }

    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {

        //creamos un objeto tipo fail en memoria
        File archivo = new File(nombreArchivo);

        try {
            //aqui agregamos el PrintWriter y el FileWriter juntos para editar
            //Nos pide el archivo y el appenend que seria un true, si le mandamos fals 
            //sobreescribiria denuevo
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));

            //despues de haber abierto nuestro archivo escribimosdentro del mismo
            salida.println(contenido);

            //se cierra el archivo
            salida.close();
            System.out.println("Se edito el archivo");
        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

            //se agrego esta excepcion para el nuevo objeto
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void leerArchivo(String nombreArchivo) {

        var archivo = new File(nombreArchivo);
        try {
            //esta clase permite leer los archivos, y el file reader ermite abrirlo
            //por eso seencierran
            var entrada = new BufferedReader(new FileReader(archivo));
            //con este metodo aacedemosa las lineas
            var lectura = entrada.readLine();
            //se repetira el ciclo hasta que no alla una linea vacia
            while (lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            //siempre hay que recordar cerrar el archivo
            entrada.close();
            //los catch neceaarios por si hay errores
        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);

        }

    }
}
