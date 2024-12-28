package test;

import Enumeracion.Dias;
import Enumeracion.Continentes;


public class TestEnumeracion {



    public static void main(String[] args) {
        
        System.out.println("Dia 1: "+Dias.LUNES);
        indicarDiaDeLaSemana(Dias.LUNES);
        //Asi accedemso al elemento
        System.out.println("Continente #4 " + Continentes.AMERICA);
        //Asi accedemos a los atributos del elemento
        System.out.println("Numero de paises en America " + Continentes.AMERICA.getPaises());
        //Con loss get se aaccede a los atributos de los elementtos
        System.out.println("Numero de habitantes en america "+Continentes.AMERICA.getHabitantes());
    
    }

    private static void indicarDiaDeLaSemana(Dias dias){
        
        
        switch (dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
                
            case MARTES:
                System.out.println("Segundo dia de la semana");
                 
            
        }
        
        
        
    }
    
}
