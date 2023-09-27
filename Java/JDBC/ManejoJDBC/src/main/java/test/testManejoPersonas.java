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
       List <Persona>personas =  personaDao.seleccionar();
        
       //ciclo foreach
       //se guarda cada dato en lavariable persona y despues imprimmos esta 
       //variable
        for (Persona persona: personas) {
            System.out.println("persona = " + persona);
            
        }
        
        ///esta funcion es mas novedosa y es un foreach explicito
        //funcion de flecha se le llama
        //ambos hacen lo mismo
        personas.forEach(persona-> {
            System.out.println("persona = " + persona);
        });
    }
}
