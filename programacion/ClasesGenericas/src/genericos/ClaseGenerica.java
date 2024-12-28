
package genericos;




//asi se define una clase tipo generica
//uno de los atributos de esta clase quedan genericos y su tipo
//se vva a definir hasta que utilicemos la clase
public class ClaseGenerica <T>{
    
    //este viene ssiendo el atributo generico
    private T objeto;
    
    
    //aca definimos el constructo eh inicializamos el atriibuto
    public ClaseGenerica(T objeto){
        
        
        this.objeto  = objeto;
        
    }
    
    public void obtenerTipo(){
        //Con los metodos .getClass().getSimpleName(); logramos obtener el tipo de atributo
        //que se definio
        System.out.println("El tipo T es: "+ this.objeto.getClass().getSimpleName());
        
        
    }

    
    public T getObjeto() {
        return this.objeto;
    }
    
}
