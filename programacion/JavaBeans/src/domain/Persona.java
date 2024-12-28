
package domain;

import java.io.Serializable;
import java.util.Objects;

/**
 
 * UN JAVA BEAN ES UNA CLASE CON CARACTERISTICAS ESPECIFICAS ESTO CON EL PROPOSITO
 * DE QUE SEA UN CODIGO ESTANDAR YUYILIZABLE POR DIVERSAS TECNOLOGIAS COMO JAVA EMPRESARIAL
 * O ALGUN SERVIDOR, LAS CARACTERISITCAS SON LAS SIGUIENTES
 * 
 * 1: DEBE IMPLEMENTAR DE LA CLASE Serializable
 * 2: DEBEN SER PRIVADOS TODOS LOS ATRIBUTOS DE LA CLASE
 * 3: DEBE TENER UN CONSTRUCTOR VACIO Y ESTE DEBBE SER PUBLICO
 * 4: DEBE TENER TODOS LOS METODOS GET Y SET DE LOS ATRIBUTOS, Y DEBEN SER PUBLICOS
 * 5: DE MANERA OPCIONAL SE PUEDEN AGRGAR LOS METODOS toString(), equals(), hasCode()
 *      ESTO YA NO ES REQUERIDO PERO ANTES LO ERA
 */
/////////////////debes imlementar SeSerializable
public class Persona implements Serializable{
    
    ///////////////////////ATRIBUTOS PRIVADOS///////////////////////////
    //  Definimos privados los atributos
    private String nombre;
    private String apellido;
    
    
    ///////////////////////////////CONSTRUCTOR VACIO//////////////////
    public  Persona(){
         
        
    }
    
    ///////////////////////ESTE CONSTRUCTOR ES PARA INICIAIZAR VARIABLES///////////////////////////
    public Persona(String nombre, String apellido){
        
        this.nombre = nombre;
        this.apellido = apellido;  
        
    }
    
    ///////////////////////GETTERS AND SETTERS///////////////////////////

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    ///////////////////////TO STRING///////////////////////////
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
///////////////////////HASH CODE AND  EQUALS///////////////////////////
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }
    
    
    
    
}
