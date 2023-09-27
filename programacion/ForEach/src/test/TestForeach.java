package test;

import domain.Persona;




public class TestForeach {

    public static void main(String[] args) {
        
        //El foreach es un for mejorado      
        
        int edades[]= {5,6,7,8,9};
        
        //Asi recorremos un arreglo con el for
        for (int i = 0; i < edades.length; i++) {
            
        }
        
        //Pero con foreach es mucho mas sencillo
        //y es espcialmente para estos casos que se usa
        //para recorrer arrays
        
        
        //la syntaxis es definir dentro del for
        //una variable del mismo tipo que el arreglo
        //Despes : y despues el nombre del arreglo
        //asi se recorreria el arreglo 
        for(int edad: edades){
            
            System.out.println("Edad "+edad);
            
            
        }
        
        //La diferencia es que en este caso no tenemos
        //El indice I entonces no podemos imprimir en que
        //vuelta va el ciclo, cuando se requiera ese dato
        //Seria mejor recorrer el array con el otro metodo
            
            
        Persona personas[]= {new Persona ("Juan"), new Persona
        ("Eber"), new Persona ("Angel") };
         
        
        for(Persona persona: personas){
            
            System.out.println("persona = " + persona);
            
            
        }
        
    }




    
}
