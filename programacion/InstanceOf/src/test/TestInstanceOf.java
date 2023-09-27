package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan",5000);
        Gerente gerente1 = new Gerente("Eber", 10000, "TI");
       
        determinarTipo(gerente1);
         
       
        
    }
    
    ////////////////////////////////////////////////////////////////
    //////////////////////////INSTANCEOF///////////////////////////
    ///////////////////////////////////////////////////////////
    //nos permite elegir el tipo de objeto sobre ejecucion
    
    
    public static void determinarTipo(Empleado empleado){
        //se pregunta si la variable empleado es de tipo gerente
        //cuando se uusa instance of debes comenzar por las clases menos genericas
        //hasta las genericas
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            //en esta linea convertimos el tipo de objeto,
            //lo convertimosde emleado a gerente
            //para poder usar sus propios metodos, por que sin la conversion
            //no podemosusarlos apesar de que el tipo gerente se ste usando
            //debemos tener cuidado con estas conversiones, ya que si no podemos
            //causar errores de ejecucion
            Gerente gerente1 = (Gerente)empleado;
            System.out.println("gerente2 = " + gerente1.getDepartamento());
        }else if(empleado instanceof Empleado){
            System.out.println("Es tipo empleado");
            System.out.println("empleado = " + empleado.getNombre());
            
        }else if(empleado instanceof Object){
            System.out.println("Es tipo object");
            
            System.out.println("empleado = " + empleado.toString());
        }
        
    }

}
