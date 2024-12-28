
package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;



public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
    //En este atributo lo definimos del tipo interfaceAccesoDatos
    //como ese atributo es del tipo de Interface mas generica
    //se puede acceder 
    private final IAccesoDatos datos;

        //constructor vacio
    
    //Spriing lo que usa es la inyeccion de dependencias todo el tiempo
    
    
    public CatalogoPeliculasImpl() {
        

    //aqui lo que hacemos es crear un objeto tipo acceso datosImpl.
    //que viene siendo nuestra clase del modelo, y podemos acceder
    //a los metodos de crear, eliminar, listar, editar,
    //y lo almacenamos en nuestra clase mas generica de esas dos.
    //Segun la explicacion de Ugalde esto lo hace muy seguido Spring
        this.datos = new AccesoDatosImpl();
    }
    
    
    //METODOS IMPLL
    @Override
    public void agregarPelicula(String nombrePelicula) {
        
        //aqui convertimos el string de nuestro metodo a un tipo 
        //pelicula
        Pelicula pelicula = new Pelicula(nombrePelicula);
        
        boolean anexar = false;

        try {
            //aqui hacemos el uso del metodo anexar que se encuentra en la implementacion
            //si le das clic te manda a la interface, pero se encuentra en la implementacion
            
            anexar = datos.existe(NOMBRE_RECURSO);
            
            //ya que sabemos si existe o no el archivo mandamos llamar el metodo escribir
            //le pasamos los valores que este requiere y listo, ya es mas sencillo
            //trabajar con los metodos del controlador
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            //podemos seguir propagando el error a las demas clases que hagan uso de esta
            //por ejemplo en este caso se nos obligo a usar el try catch debido
            //a que la clase donde se implemento el metodo propago el error y por eso
            //nos obliga a reportarlo enesta
            //pero como esta clase ya no se usara solo mandaremos una impresion
            //sin propagar nada
            
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
            
    }

    @Override
    public void listarPeliculas() {
        
        try {
            //Con el objeto datos podemos acceder a todos los metodos del 
            //Modelo ya que este es un objeto que referencia a su Interface
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            
            //para iterar la collections que retorna el metodo listar 
            //utilizaremos un foreach, recuerda que iterar es el nombre tecnico
            //Yo lo conozco como recorrer el array o collections
            for(var pelicula: peliculas){
                
                //El foreach se encargara de imprimir todas las peliculas
                //del TXTs
                System.out.println("pelicula = "+pelicula);
                
            }
            
            
        } catch (AccesoDatosEx ex) {
            //en este caso tampoco la vamos a seguir propagando solo
            //mandaremos a consola el error con eso es suficiente
            System.out.println("Error al acceder a los datos");
            ex.printStackTrace(System.out);
            
        }
        
    }

    
    
    @Override
    public void buscarPelicula(String buscar) {
        //en esta variable vamos a almacenar lo que extraiga el metodo
        String resultado=null;
        
        //se envuelve en try el uso del metodo buscar ya que lo propagamos
        //la exception
        try {
            //accedemos al metodo con el metodo buscar
            resultado= this.datos.buscar(NOMBRE_RECURSO, buscar);
            //con esto imprimmosl que nos regresa el metodo anterior
            System.out.println("resultado = " + resultado);
            
            
            
        } catch (LecturaDatosEx ex) {
            
            //No lo propragamso again el error con imprimir en consola es sufici
            //en si solo propagamos el errro en la capa de modelo en este caso
            //recuerda que propagar hace referencia a obligar el envolver
            //el uso del metodo en un try o declarar el errro arriba
            System.out.println("Error de acceso datos");
            
            ex.printStackTrace(System.out);
            
        
        }
        
        
        
        
        
    }

    @Override
    public void iniciarCatalogoPeliculas() {
       
        //Se requiere encerrar en try again 
        try {
            
            
            if (this.datos.existe(NOMBRE_RECURSO)) {
                //realmente no entiendo mucho el suso de este metodo
                //si exite el archivo lo vamos a borraar y despues a crear
                //para inicializarlo pero aun no entiendo
                datos.borrar(NOMBRE_RECURSO);
                
                datos.crear(NOMBRE_RECURSO);
                
                
            }else{
                //en caso de que no exista lo vamos a tener que crear
                datos.crear(NOMBRE_RECURSO);
                
            }
            //utilizamos la exception mas generica debido a que tenemos varios metodos
            //asi de esta forma no se generan errores ni tenemosq ue especificar uno por uno
            
        } catch (AccesoDatosEx ex) {
            
            System.out.println("Error al iniciar catalogo de peliculas");
            
            ex.printStackTrace(System.out);
            
        }
        
    }
   
        
        
        
   
    
}
