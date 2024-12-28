
package mx.com.gm.peliculas.domain;

//etas clases son las mas importantes del proyecto
//son las javaBean
//tambien seles conoce como clases de entidad
//por que esta clase representa una tablade base de datos
//y su cantidad de atributos esla misma quede columnas en esa tabla

public class Pelicula {
    
    //////////////////////ATRIBUTOS/////////////////////////
    private String nombre;
    
    //////////////////////Constructores/////////////////////////
    public  Pelicula(){
        
    }
    
    public  Pelicula(String nombre){
        this.nombre = nombre;
        
        
    }
    
    
    //////////////////////getters and setters/////////////////////////

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   //////////////////////ToString/////////////////////////

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + '}';
    }

}
