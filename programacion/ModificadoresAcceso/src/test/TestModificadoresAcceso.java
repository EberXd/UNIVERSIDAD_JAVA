
package test;

import paquete1.Clase1;
import paquete2.ClaseHiija;

/**
 *
 * @author eber
 */


public class TestModificadoresAcceso {
    
    
    public static void main(String[] args) {
        //accederemos a la classe 1 que se encuenetra en otro paquete
        
        Clase1 clase1 = new Clase1("Publico");
        
        System.out.println("clase1 = " + clase1.atributoPublico);
        
        clase1.metodoPublico();
        
        
        
        ///////////////////////////PROTECTED//////////////////////////////////
        //en este caso para acceder a los datos protected desde este main
        //le asignamos una clase hija a la clase1
        //despues en su constructor mandamos a llamar todo y modificamos atributos
        //al final mandamos llamar la clase hja
        ClaseHiija claseHija = new ClaseHiija();
        System.out.println("claseHija = " + claseHija);
        
    }
    
    
    
}
