
package test;

import domain.Persona;

/**
 *
 * @author eber
 */
public class PersonaPrueba {
    
    private int contador;
  
    //este metodo es estatico por que 
    //cuando se ejecutase manda llamar referenciado a nuestra
    //clase
    public static void main(String[] args) {
        
        
        
        Persona persona1 =new Persona("Eber Emanuel");
        
        //como generamos nuestro metodo tostring
        //ya no se imprime la direccion de memoria 
        //si no que se imprime el metodo toString al imprimir el
        //objeto
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 =new Persona("AMBER");
        System.out.println("persona2 = " + persona2);
        
        //toddo metodo que vayamos a llammar debe ser estatico
        //dentro de un metodo estatico
        
        imprimir(persona1);
        
        //en la siguiente linea queda demostrado que el contexto
        //estatito no pudeacceder al  contecto dinamico
        
        //marca error
        //this.contador=10;
        PersonaPrueba prueba = new PersonaPrueba();
        prueba.getContador();
    }
    
    
    //el orden de los modificadores no importa
    //public, static pueden escribirse en cualquier orden
    static public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
        
        
        
    }
    
    //el siguiente metodo no estatico lo vamos a definir para
    //demostrar comoal no ser estatico si podemosacceder a lo dinamico
    // y tambien podemos acceder a lo estatico
    public int getContador(){
        
        //aqui accedemos al contexto estatico
        PersonaPrueba.imprimir(new Persona ("Lupe"));
        
        
        
        return this.contador;
    }
    
    
}
