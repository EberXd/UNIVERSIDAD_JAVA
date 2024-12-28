
package aritmetica;

import excepcions.OperacionExcepcion;




public class Aritmetica {
    
    //cundo un metodo tenga throw debera indicar el  metodo la palabra
    //throws para indicar alcompilador que el metodo podria mmandar errores
    //y tambien debemos indicar nuestra clase  de erroress
    public static int division(int a, int b) throws OperacionExcepcion{
        
        if (b == 0) {
            
            //en esta linea indicamos el mensaje de excepcion lo mandamos
            //con throw + new + un objeto de  nuestraclase yel string
            throw new OperacionExcepcion("Division entre 0 no sea wey papu");
            
        }else if(a==0){
            
            throw new OperacionExcepcion("Division entre 0 no sea wey papu");
            
        }
        
        return a/b;
        
    }
    
    
    
    
    
}
