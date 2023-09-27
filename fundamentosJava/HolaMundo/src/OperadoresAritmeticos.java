
/**
 *
 * @author eber
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        //con var no se pueden definir varias variables
        //como el ejemlo siguiente
        //var a=3, b=5;
        double a=2, b=5;
        var resultado=a+b;
        System.out.println("SUMA= "+resultado);
        
        
        resultado=a-b;
        System.out.println("Resta= "+resultado);

         resultado=a*b;
        System.out.println("Multiplicacion= "+resultado);
        
        resultado=a/b;
        System.out.println("Division= "+resultado);
        
        //reciduo o modulo
        resultado=a%b;
        System.out.println("Reciduo= "+resultado);
        
        //este algoritmo es para saber si un numero es par o impar
        if (a%2==0) {
            
            System.out.println("Si es numero par");
            
        }else{
            
            System.out.println("Numero impar");
            
            
        }
        
    }
    
}
