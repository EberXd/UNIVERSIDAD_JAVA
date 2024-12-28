package test;

public class TestArgumentosVariables {
    //Los argumentos variables es cuando vamos a pasar 
    //Un argumento a un metodo
    
    //A como lo entendi es simplemente un arreglo que va en un metodo
    //la dferencia es que este arreglo no requiere que se definan
    //la cantidad de valores, en si es indefino, acepta todos loa que mandes


    public static void main(String[] args) {

        imprimirNum(3, 4, 5);

        imprimirNum(1, 2);
        
        variosParametros("Eber", 1,2,3
        ,4,5,6,7,8,9);

    }

    //Cuando despues de definir el tipo y despues 
    //3 puntos suspensivos se determina que se van a recibir
    //argumentos variables
    //basicamente es un array sin definir cuantos valores
    //va a recibir
    private static void imprimirNum(int... numeros) {

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Elementos" + numeros[i]);

        }

    }
    
//cuando hay varios argumentos en un metodo donde vas a incluir
    //argumentos variables, lo mejor es que dejes al fnal el argumento variable
    //por que si no marca error, como en el siguiente ejemplo
    
    private static void variosParametros(String nombre, int... numeros) {
        
        System.out.println("Nombre: "+ nombre);
        
        imprimirNum(numeros);
        
        
        
    }

}


