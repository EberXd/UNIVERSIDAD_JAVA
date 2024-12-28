
import java.util.Scanner;



/**
 *
 * @author eber
 */
public class ConversionDeDatos {
    
    
    public static void main(String[] args) {
        
        //convertir un tipo string a int
        
        var edad ="24";
        var edadNueva = Integer.parseInt(edad);
        
        System.out.println("Edad "+ (edadNueva+21));
        
        //////////////convertir string a double//////////////
        var valorPi = "3.1416";
        var valorPiConvert = Double.parseDouble(valorPi);
        
        System.out.println("Pi "+ (valorPiConvert));
        
        //////////////convertir desde scanner//////////////////
        
        var consola = new Scanner(System.in);
        
        System.out.println("ingresa tu edad");
        var edadConsola=Integer.parseInt(consola.nextLine());
        
        if (edadConsola>=18) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        
        //////////////////CONVERTIR INT A STRING///////////////
        
        //el metodo value of puede convertir desde cualquer
        //tipo de dato a string
        var edadTexto=String.valueOf(edadNueva);
        
        //con .chartArt te saca un valor que definas como indice
        //en el siguiente ejemplo el indiceque ndique fue 0
        //ns trae la H de la dena
        //para mas detalles revisa el video 8 carpeta3
        //con esa funciontmbien convierteen chart debidoa que
        //solo jalas un dato
        var caracter="hola".charAt(0);
        
        System.out.println(caracter);
        //asi seria desde consola
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(2);
        System.out.println(caracter);
    }
    
    
}
