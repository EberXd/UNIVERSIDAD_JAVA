
package pasoporvalor;

import Clases.Persona;
/**
 *
 * @author eber
 */
public class PasoPorReferencia {
    
    public static void main(String[] args) {
        //variable tipo object
        Persona persona1 = new Persona();
        
        persona1.nombre="Juan";
        System.out.println("persona1 = " + persona1.nombre);
        cambiaValor(persona1);
        System.out.println("persona1 cambio = " + persona1.nombre);

    }
    
    public static Persona cambiaValor(Persona persona){
        persona.nombre="Karla";
        
        //cuando se trabaja con objetos los cambios son instantaneos 
        //debido a que en ambos  metodos se hace referencia al mismo objeto
        //no como en el otro ejercicio
        
        //el retur debe ser la ultima linea de codigo de un metodo
        //por queya ahi se finaliza
        //y si pones mas codigo despues de eso ya no se ejecuta
        return persona;
    }
    
}
