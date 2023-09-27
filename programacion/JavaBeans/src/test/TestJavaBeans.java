package test;

import domain.Persona;

/**
 *
 * @author eber
 */
public class TestJavaBeans {

    public static void main(String[] args) {
        //Cuando se trabaja con java beans es comun no saber cuantos atributos tiene la clse
        //entonces por esa razon dejamos un constructor vacio, para poder generar
        //un objeto sin argumentos
        Persona persona = new Persona();

        //////Si requerimos cambiar los valores de lso atributosde la claseBean debemos
        //hacer el uso correctode los setters
        persona.setNombre("Eber");
        persona.setApellido("Hernandez");

        //Aqui accedemos al metodo tostring para que nos imprimalos valores
        System.out.println("persona = " + persona);

        // con los metodos get podemos acceder de uno por uno
        System.out.println("Nombre = " + persona.getNombre());
        System.out.println("Apellido = " + persona.getApellido());

    }
        ///El uso que tine Seriializable, nos permite mandar los obbjetos por la red
        //Esto se traduce a que se convierten losobjetos a 0 y 1, osea en bytes
        //despes serecibe en el otro servidor y lo convierte al objeto original
        //eso lo hara en automatico el servior de aplicaciones java que seutilice
        //Pero si esnecesario que se agrege el implements en el javaBean
}
