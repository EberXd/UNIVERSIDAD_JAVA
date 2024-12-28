

/**
 *
 * @author eber
 */
public class PrioridadDeOperadores {
    
    public static void main(String[] args) {
        
        var x=5;
        var y=10;
     
        var z = ++x + y--;
        
        System.out.println("z = " + z);
        
        var resultado=4 + 5 * 6 / 3;//las expreciones se ejecutan de
        //izquierda a derecha, se le da prioriad a la multiplicacion y divicion
        //pero lo que se ejecuta incluso antes son lo de parentesis y corchetes
        
        System.out.println("resultado = " + resultado);//14 es el resultado
        
        resultado = (4+5) * 6 / 3;
        
        System.out.println("resultado = " + resultado);//resultado 18
        
    }
    
    
    
    
}
