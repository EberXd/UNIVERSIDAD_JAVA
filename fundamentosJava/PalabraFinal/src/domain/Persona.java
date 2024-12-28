
package domain;

/**
 *
 * @author eber
 */

//las clases con el atributo final
//como esta no ppermiten que se realicen clases hijas de esta
//como me habria gustado ser tipo final yo... xd
public final class Persona {
    
    //los atributos tipo final static
    //se les  llaman constantes en java
    //para mandarlo llamar se ocupa mencionarla clase como con 
    //todolo static y su vaalor no se  podra modificar por  el final
    //por eso es una constante
    //COMO BUENA PRACTICA ESTAS CONSTANTES SE DEFINEN
    //EN MAYUSCULAS Y SE SEPARA CON GUIN BAJO
    public final static int MI_CONSTANTE=24;
    
    private String nombre;
    
    
    ///////////////////////setters and getters///////////
    
     public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    //tambien los metodos con final
    //no sepueden sobre escribir, esto para que las
    //clases hijas no puedan modificar el comportamiento
    //del mismo
    
    public final void imprimir(){
        
        System.out.println("Hola mundo");
        
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    

   
    
}
