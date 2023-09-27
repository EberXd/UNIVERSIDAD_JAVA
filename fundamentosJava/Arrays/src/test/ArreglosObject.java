package test;

import domain.Persona;

/**
 *
 * @author eber
 */
public class ArreglosObject {

    public static void main(String[] args) {
        //las variables de tipo array deben de ir en plural
        //en el siguiente  linea de codigo se define n array
        //de tipo object haciendo isntancia a la clase Persona

        Persona personas[] = new Persona[4];

        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Eber");
        personas[2] = new Persona("Amber");
        personas[3] = new Persona("Lupe");
        
        System.out.println("personas 0= " + personas[0]);
        System.out.println("personas 1= " + personas[1]);

        ////////////////////////////////////////////////////
        //para recorrer el array de tpo object es igual que con el de
        //enteros se usael for, con el metodo length eh imprimos cada
        //objeto cn el metodo toStrng
        for (int i = 0; i < personas.length; i++) {

            System.out.println("personas "+i+"= " + personas[i]);

        }
    }

}
