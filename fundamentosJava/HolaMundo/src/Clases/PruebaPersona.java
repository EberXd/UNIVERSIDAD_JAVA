
package Clases;

/**
 *
 * @author eber
 */
public class PruebaPersona {
    
    //psvm + tab y nos crea elmetodo main
    //este etodo debe estar separado de as demas clases
    //es con e que corre el programa
    public static void main(String[] args) {
        
        //estos son los mentadoss objetos 
        //de una clase
        //parami era como referenciar aota clase y usar su metodos
        //ue es practicamente lo mismos
        //en otras palabras nuestra variable person1 representa la clase Persona
        //e esta clase
        Persona persona1 = new Persona();
        //aqui accedemos al metodo atravez de la clase
        //referenciada y le mandamos un string
        persona1.nombre = "Eber";
        persona1.apellido = "Hernandez";
        persona1.desplegarInformacion();//ejecutamos el metodo
        
        
        Persona persona2 = new Persona();
        
        persona2.desplegarInformacion();
        persona2.nombre="Lupe";
        persona2.apellido="Valencia";
        persona2.desplegarInformacion();

    }
    
}
