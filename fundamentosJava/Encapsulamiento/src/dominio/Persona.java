
package dominio;

/**
 *
 * @author eber
 */
public class Persona {
    /////////////////////////////////////
    /////////////ATRIBUTOS//////////////
    
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    
     /////////////////////////////////////
    /////////////CONSTUCTOR///////////////
    public Persona(String nombre, double sueldo, boolean eliminado){
        
       this.nombre=nombre;
       this.sueldo=sueldo;
       this.eliminado=eliminado;
       
       
        
        
    }
    
     /////////////////////////////////////
    /////////////GETTERS//////// /////////
    public String getNombre(){
        return this.nombre;
        
    }  
   public double getSueldo(){
       return this.sueldo;
       
       
   }
   //para los tipos boolean debe ser asi el get con is
   public boolean isEliminado(){
       return this.eliminado;    
   }
   
     /////////////////////////////////////
    /////////////SETTERS/ ////////////////
   public void setNombre(String nombre){
       this.nombre=nombre;
       
   }
   
   public void setSueldo(double sueldo){
       this.sueldo=sueldo;
       
   }
   //el set para boleanoses igual
   public void setEliminado(boolean eliminado){
       this.eliminado=eliminado;
       
   }
   
   //metodo to string permite imrpimir los valore de cada aributo
   //permite imprimir todos los valores
   public String toString(){
       
       
       return "Persona, Nombre:"+this.nombre+"Sueldo: "+this.sueldo+"Eliminado: "
               + this.eliminado;
       
       
   }
    
}
