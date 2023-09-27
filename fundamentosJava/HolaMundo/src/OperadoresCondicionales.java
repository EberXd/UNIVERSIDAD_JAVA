
/**
 *
 * @author eber
 */
public class OperadoresCondicionales {

    public static void main(String[] args) {

        //operadores condicioales and y or
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;

        //aqui seria como poner limites
        //o se puede interpretar como doble condicional
        //este es el operador and ya lohabias usado antes
        var resultado = a >= 0 && a <= 10;
        
        if (resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("fuera de rango");
        }
        
        //operador or, con esteoperdorcon que una de
        //las dos condicones sea cierta
        //se ejecuta
        var vacaciones = false;
        var descanso = true;
        
        if (descanso || vacaciones) {
            
            System.out.println("si puede asistir");
            
        }else{
            
            
            System.out.println("no pede asistir");
            
        }
            
            
            
        
    }
    
}
