
package test;

import domain.Empleado;
import domain.Persona;

/**
 *
 * @author eber
 */
public class TestFinal {
    
    public static void main(String[] args) {
        
        final int miVariable=10;
        System.out.println("miVariable = " + miVariable);
        
        //las variables tipo final no permiten ser modificadas
        //en cuant a su valor
        //la siguiente linea marca error.
        //miVariable=20;
        
        
        
        /////////////////////////////////////
        //En la siguiente linea se intenta modificar el valor 
        //de la variable constante definida en persona
        //dicha linea marca error por que es final la variable
        //y seria el mismocaso como arriba.
        
        
        //Persona.MI_CONSTANTE =5;
        System.out.println("Mi consante; "+Persona.MI_CONSTANTE);
        
        ///Para los objetos no nos perite cambiar la clase o el objeto en si
        //cuando son tipo final
        //pero si puedes cambiar valores con los metodos
        //en el siguiente ejemplo se define un objeto de la clase persona
        //tomando el onstructor vacio
        //despues se intenta crear una nueva istancia pero marca error
        //y al fial se accede al atributo nombre y se manda imprimir con
        //el metodo toString
        //en conclusion son un poco mas dinamicos los objetos final que lo demas
        //revisado
        
        final Persona persona1 = new Persona();
        //persona1= new Persona();
        
        persona1.setNombre("Wukon");
        System.out.println("persona1 = " + persona1);
        
    }
    
    
    
    
}
