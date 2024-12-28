
import java.util.Scanner;


/**
 *
 * @author eber
 */
public class LeerConsola {
    public static void main(String[] args) {
        System.out.println("INGRESA USUARIO");
        
        Scanner consola =new Scanner(System.in);
        
        var usuario= consola.nextLine();
        
        System.out.println("INGRESA TU ULTIMO GRADO");
        
        var titulo= consola.nextLine();
        
        System.out.println("Tu usuario:"+usuario);
        
        System.out.println("Tu grado es:"+titulo);
        
    } 
}
