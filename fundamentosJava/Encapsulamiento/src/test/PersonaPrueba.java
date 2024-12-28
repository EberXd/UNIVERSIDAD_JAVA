package test;
//con * se importan todas las clases de un paquete

import dominio.*;

/**
 *
 * @author eber
 */
public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Eber", 5500, false);
        System.out.println("Persona1 nombre antes del set: " + persona1.getNombre());
        System.out.println("Persona1 sueldo antes del set: " + persona1.getSueldo());
        System.out.println("Persona1 eliminado? antes del set: " + persona1.isEliminado());
        persona1.setNombre("Eber Emanuel");//ahora asi se acceden a los atributos
        persona1.setSueldo(12000);
        persona1.setEliminado(true);
                
        //persona1.nombre="Eber Emanuel"; como el atributo esta privdo
        //ya no se puede mandar informacion asi, solo  con los setters y getters
        //System.out.println("Nombre "+persona1.nombre);
        System.out.println("Persona1 nombre despues del set: " + persona1.getNombre());
        System.out.println("Persona1 sueldo despues del set: " + persona1.getSueldo());
        System.out.println("Persona1 eliminado? despues del set: " + persona1.isEliminado());
        
       
        System.out.println(persona1.toString());
    }

}
