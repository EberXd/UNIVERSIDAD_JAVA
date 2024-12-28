
/**
 *
 * @author eber
 */
public class OperadoresIgualdad {

    public static void main(String[] args) {

        var a = 3;
        var b = 2;

        //operadores d asignacion y eh igualdad
        //operador de igualdad
        var c = a == b;
        System.out.println("c = " + c);

        //operador de diferencian 
        var d = a != b;

        System.out.println("d = " + d);

        //comparacion de cadenas
        var cadena = "Hola";
        var cadena2 = "";
        var e = cadena == cadena2;//compara referencias de objetos
        System.out.println("e = " + e);

        //para comparar realmente el contenido de 2 cadenas
        //se requiere el metodo .equals
        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);

        ///Operadores relacionales
        //sirvenn para saer si un valor es mayor o menor
        //se pregunta si 3 es mayor o igual que 2
        var g = a >= b;
        System.out.println("g = " + g);
        
        //preguntar que si es par o impar
        if (a % 2  ==0) {
           System.out.println("la variable es par"); 
            
        }else{
            
            System.out.println("la variable es impar");
            
        }
        
        var edad =24;
        var adulto=18;
        
        if (edad >= adulto) {
            
            System.out.println("Ya eres adulto");
            
        } else {
            System.out.println("Eres un nino");
        }

    }

}
