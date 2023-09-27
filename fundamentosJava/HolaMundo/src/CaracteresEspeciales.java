
/**
 *
 * @author eber
 */
public class CaracteresEspeciales {

    public static void main(String[] args) {
        var nombre = "Karla";

        // imprime como si hubieras dado enter
        System.out.println("Nueva linea: \n" + nombre);

        //como si hubieras dado tab
        System.out.println("Tabulador: \t" + nombre);

        //ralmente no le enuentro mucha utilidad
        //basicamente borra espacios o letras hacia atras
        // desde donde lo coloques \b
        System.out.println("Retroceso: \b" + nombre);
        
        //para imprimr entrecomillas simples
        System.out.println("Comilla simple: \'" + nombre+"\'");

        //para imprimr entrecomillas dobles
        System.out.println("Comilla simple: \"" + nombre+"\"");    

        
        
    }
}
