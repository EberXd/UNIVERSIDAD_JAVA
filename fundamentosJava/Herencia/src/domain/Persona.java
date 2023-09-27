
package domain;

/**
 *
 * @author eber
 */
public class Persona {
        //////////////////////////////////////////////////
    /////////////////////ATRIBUTOS//////////////////
    ////////////////////////////////////////////////
    
    //las clases hijas no pueden acceder a 
    //atributos privados para que puedan hacerlo 
    //debe ser con protected
    
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
        //////////////////////////////////////////////////
    /////////////////////CONSTRUCTORES//////////////////
    ////////////////////////////////////////////////
    public Persona(){
        
     
        
    }
    
    public Persona(String nombre){
        this.nombre=nombre;   
        
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

        //////////////////////////////////////////////////
    /////////////////////SETTERS//////////////////
    ////////////////////////////////////////////////
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

        //////////////////////////////////////////////////
    /////////////////////GETTERS//////////////////
    ////////////////////////////////////////////////
    
    public String getNombre() {
        return this.nombre;
    }
    

    public char getGenero() {
        return this.genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

  
        //////////////////////////////////////////////////
    /////////////////////TOSTRING//////////////////
    ////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre 
                + ", genero=" + genero 
                + ", edad=" + edad 
                + ", direccion=" + direccion 
                + '}';
    }
    
    
    
    
    
}
