
package pasoporvalor;

/**
 *
 * @author eber
 */
public class PasoPorValor {
    
    public static void main(String[] args) {
      
        int x = 10;
        System.out.println("x = " + x);
        
        //solamente se pasa una copiadelavariable
        //por el alcance de variables  
        //esto es lo que se analiza en esta clase
        cambioValor(x);
        
    }
    
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1); 
        
        
    }
    
    
    
    
    
}
