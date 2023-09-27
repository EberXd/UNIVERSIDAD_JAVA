
/**
 *
 * @author eber
 */
public class OperadoresUnarios {
    
    public static void main(String[] args) {
       
        //operador cambio de signo
        var a=3;
        var b= -a;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //asi se cambia un boleano a falso o viceversa
        var c = true;
        var d = !c;
        System.out.println("c = " + c);       
        System.out.println("d = " + d);
        
        //incremento
        //pre incremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;//primero se incrementa la variable y despues se usa el valor
        System.out.println("f = " + f);
        
        //post incrmento
        var g = 5;
        var h = g++;//primero se usa el valor de la variable y despues aumenta
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        var i=2;
        var j =--i;
        System.out.println("i = " + i); //primero se decrementa
        System.out.println("j = " + j);
        
        
        //post decremento
        var k=4;
        var l =k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
        //explicacion de lospost decrementos eh incrementos
        //en video 3 carpeta 4
        
    }
    
    
    
}
