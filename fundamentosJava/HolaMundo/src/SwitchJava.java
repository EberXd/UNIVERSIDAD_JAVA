
/**
 *
 * @author eber
 */
import java.util.Scanner;

public class SwitchJava {
    //en sutch es importante poner el brake
    //por quue si no una ve que  ejecuteuna sentencia 
    //seguira revisando las demas
    //amenos de que asii se ocupe
    //pero eso consumiria mas tiempo de ejecucion

    public static void main(String[] args) {

        //switch es bueno cuando hay mas de 3
        //if else
        //ejercicio convertir numero a texto
        var numero = 4;
        var numText = "";
        
        switch (numero) {//se pasa el argumento
            case 1://antes de los dos puntos se pne la condicon
                numText = "vale 1";//codigo que se ejecuta si es true
                break;//break para que norevise mas

            case 2://segundo caso
                numText = "Vale 2";
                break;
            
            case 3:
                numText = "vale 3";
                break;
            
            case 4:
                numText = "Vale 4";
                break;
            
            default://asi se ttermina y por si no hay coincidencias
                //le aventamos el default
                numText = "Error, caso no encontrado";
            //en el ultimo ya no se agrga break
            //ya no  tendria sentido por que basicamente
            //ya reviso todos los casos
        }
        
        System.out.println("numText = " + numText);

        //ESTACIONES DEL ANO CON SWTCH
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresael numero de mes actual");
        
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "";
        
        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otono";
                break;
            default:
                System.out.println("Mes incorrecto");
                estacion="null";
        }
        System.out.println("estacion = " + estacion);
    }
    
}
