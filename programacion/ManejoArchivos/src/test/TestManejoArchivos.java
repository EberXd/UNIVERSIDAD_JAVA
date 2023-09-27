package test;

import static manejoarchivos.ManejoArchivos.*;

/**
 *
 * @author eber
 */
public class TestManejoArchivos {

    public static void main(String[] args) {
        //Guardamos el string con el nombre de nuestro archivo
        String nombreArchivo = "miPrimerArchivo.txt";
        //la diagonal invertida es como el ../ de PHP, regresamosde carpeta
        //para depositarlo en otro lado
        String nombreArchivo2 = "\\miPrimerArchivo.txt";

        ///////////////////////////////////////////////////////////////////////////////////////
        //llamamos el metodo statico y le pasamos el string
        //crearArchivo(nombreArchivo);
        ///////////////////////////////////////////////////////////////////////////////////////
        //mandamos llamar elmetodo de escribiren nuestro nuevo archivo
        //este etodo sobre ecribe el de abajo no
        escribirArchivo(nombreArchivo, "hola desde PrintWriter");
        ///////////////////////////////////////////////////////////////////////////////////////
        //nuestro metodo para editar y no para sobre escribir
        anexarArchivo(nombreArchivo, "Adios desde FileWriter");
        anexarArchivo(nombreArchivo, "La programacion seranuestra salvacion");
/////////////////////////////////////////////////////////////////////////////////////////
//metodo leer archivo
        leerArchivo(nombreArchivo);

    }

}
