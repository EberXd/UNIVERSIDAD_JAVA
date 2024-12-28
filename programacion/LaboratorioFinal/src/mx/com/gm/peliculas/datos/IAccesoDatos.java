
package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;


public interface IAccesoDatos {
    
    //en este metodo le agregamos throws por que indic que puede arrojar 
    //una excepcion entonces por esa razon se le agrega el throws
    //y lo redirigimos a nuestra clase de excepciones
    //a este se leasigno la clase de excepciones mas generica por que es un metodo
    //generico y a los otros metodos no
   boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    //retorna un tipo collections
    //le asignamos laclase detipo de error de lectura ya que sera 
    //u metodode lectura de datos
    List<Pelicula> listar(String nombre)throws LecturaDatosEx;
    
    //ahora mandamos la exception a la clase de escribir
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) 
    throws EscrituraDatosEx;
    
    //podria lanzar error tipo lectura
    String buscar(String nombreRecurso, String buscar)throws LecturaDatosEx;
    
    
    void crear(String nombreRecurso) throws AccesoDatosEx;
    
    void borrar(String nombreArchivo) throws AccesoDatosEx;
    
    
    
}
