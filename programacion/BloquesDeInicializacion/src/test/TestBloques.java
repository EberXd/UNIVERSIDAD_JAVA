package test;

import domain.Persona;
//Estos bloques no son an comunes en el mundo del 
//Desarrollo por eso son tan desconocidos
//Pero podrian ser pregunta en alguna certificacion
//y es importante saber de ellos por si los llegamos a ver
//En algun codigo, normalmente los podemoss llegar a ver
//Antes del construtor



public class TestBloques {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        //Al parecer en cuanto creas un objeto de una clase
        //se ejecuta el constructor vacio
        //Y los bloques de inicializacion en automatico
        
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona();
        
        System.out.println("persona2 = " + persona2);
    }

    
}
