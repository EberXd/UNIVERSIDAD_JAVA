/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

/**
 *
 * @author eber
 */
public class testManejoPersonas {

    public static void main(String[] args) {

        //cramos nuevo objeto de la clase PersonaDAO
        PersonaDAO personaDao = new PersonaDAO();

        //mandamos lamr el metodo seleccionarde nuestra clase PersonaDAO
        //este metodo retorna una lista
        //asi que creamos una variable tipo lista para almacenar e return
        List<Persona> personas = personaDao.seleccionar();

        //ciclo foreach
        //se guarda cada dato en lavariable persona y despues imprimmos esta 
        //variable
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);

        }

        ///esta funcion es mas novedosa y es un foreach explicito
        //funcion de flecha se le llama
        //ambos hacen lo mismo
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

        //////////////////////////////INSERTAR///////////////////////////////
        //se crea un objeto de la clase persona, este objeto lo haceos con el constructor completo
        //para insetar todos los datos
        Persona personaAgregar = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "4171064348");
        //mandamos  el objeto a nuestro metodo insertar de la clase personaDAO

        personaDao.insertar(personaAgregar);

        //LISTAMOS AGAIN
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);

        }

        //////////////////////////////////UPDATE////////////////////////////////
        //SE CREA EL OBJETO DE TIPO PERSONA CON TODOS LOS DATOS NECESARIOS PAARA ACTUALIZAAR
        Persona personaActualizar = new Persona(4, "Daniela", "Alejandre", "rosadaniela@gmail.com", "417178");

        //DESPUES INVOCAMOS EL METODO AZTUALIZAR ATRAVEZ DE NUESTRO OBJETO personaDAO
        personaDao.actualizar(personaActualizar);

        //LISTAMOS AGAIN
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);

        }
        
        ///////////////////////////////DELETE/////////////////////////////////////
        Persona personaEliminar = new Persona(4);
        
        personaDao.delete(personaEliminar);
    }
}
