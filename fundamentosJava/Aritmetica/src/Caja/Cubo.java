
package Caja;

/**
 *
 * @author eber
 */
public class Cubo {
    
  //////////////////////////////////////
  /////  ATRIBUTOS DE LA CLASE/////////
  /////////////////////////////////////
    
   
  int ancho;
  int alto;
  int profundo;
  
  //////////////////////////////////////
  /////  CONSTRUCTOR VACIO/////////
  /////////////////////////////////////
  
    public Cubo(){
        
        
        
        
    }
    
    //////////////////////////////////////
  /////  CONSTRUCTOR CON ARGUMENTOS/////////
  /////////////////////////////////////
    public Cubo(int ancho,int alto,int profundo){
       this.ancho=ancho;
       this.alto=alto;
       this.profundo=profundo;
        
        
        
    }
    
      //////////////////////////////////////
               /////METODOS/////////
  /////////////////////////////////////
    
    public int calcularVolumen(){
        
        int resultado = this.alto * this.ancho * this.profundo;
        
        return resultado;
        
    }
    
}
