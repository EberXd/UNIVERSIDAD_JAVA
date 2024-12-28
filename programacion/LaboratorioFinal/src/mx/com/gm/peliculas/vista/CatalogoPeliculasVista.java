
package mx.com.gm.peliculas.vista;

//sta va aser la clase que muestra los menos al usuario

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.negocio.ICatalogoPeliculas;

//en el MVC esta clase perteneceria a la vista
public class CatalogoPeliculasVista {
    
    public static void main(String[] args) {
        
        //almacenaremos los numeros para salir delwhile
        //o elegir opciones
        var opcion = -1;
        //un objeto escanerpara leer de la consola
        var scanner = new Scanner(System.in);
        //////////////////////////////////////////////////////////////////////////
        //objeto de la clase padre de CatalogoPeliculasImpl
        //coon este objeto podremos acceder a todos los metodos de esta
        //se aplica el concepto de bajo acoplamientoy baja coesion
        
        //bajo acoplamiento:se utlizan la menor cantidad de relaciones entre las clases
        //por ejemplo: vista no se relaciona con modelo
        
        //alta coehcion: significaque cada clase realiza sus tareas correspondientes
        //y no mas que eso.
        
        //todos los frameworks de java utiliza estos conceptos
        ICatalogoPeliculas catalogo= new CatalogoPeliculasImpl();
        ///////////////////////////////////////////////////////////////////////
        
        //solaamene si la variable opcion es igual a 0 se cerrara nuestro ciclo
        while(opcion != 0){
            System.out.println("Eligue una opcion: \n"
                +"1. Iniciar catalogo peliculas. \n"
                +"2. Agregar pelicula. \n"
                + "3. Listar peliculas. \n"
                + "4. Buscar pelicula.   \n"
                + "0. Salir.");
            
            //next line es el metodo que mejor trae datos desde scanner
            //nos permite leer con ma facilidad
            //lo mao s que requiere de converson
            //en este caso utilizamos el parseint para convertir los datos
            opcion =Integer.parseInt( scanner.nextLine());
            
            //usaremos aqui un switch para podermadar llamar las diferentesopciones
            //que puede elegir el usuario
            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    var nombre = scanner.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case  3:
                    catalogo.listarPeliculas();
                    break;
                    
                case 4:
                    System.out.println("Introduce el nombre de la pelicula");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion no encotrada");
                    break;
                    
                    //debido aque no propagamos la excepciones en esta clase
                    //no fue requerido usar ningun try catch
            }
            
            
            
            
        }
        
        
    }
    
    
    
}
