
package domain;

/**
 *
 * @author eber
 */
public class Persona {
    
    ////////////////////ATRIBUTOS//////////////
    private String nombre;

    
    //////////////////CONSTRUCTOR//////////////
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    
    ////////////////////GETTERSANDSETTERS//////////
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /////////////////////TOSTRING/////////////////

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre = ").append(nombre);
        sb.append(", direccion de memoria = ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
