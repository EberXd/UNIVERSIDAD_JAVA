
package mx.com.gm.peliculas.negocio;



public interface ICatalogoPeliculas {
    //definimos una constante
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
    
    
    
    
}
