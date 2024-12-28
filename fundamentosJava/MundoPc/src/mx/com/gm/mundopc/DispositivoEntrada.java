
package mx.com.gm.mundopc;




public class DispositivoEntrada {
    
    ////////////////////////////////////////
    ////////////ATRIBUTOS//////////////////
    /////////////////////////////////////
    
    private String tipoEntrada;
    private String marca;
    
    ////////////////////////////////////////
    ////////////CONSTRUCTORES//////////////
    /////////////////////////////////////
    
    
    public DispositivoEntrada(String tipoEntrada, String marca){
        
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        
        
    }
    
     ////////////////////////////////////////
    ////////////getters and setters//////////////
    /////////////////////////////////////

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
      ////////////////////////////////////////
    ////////////TO STRING//////////////
    /////////////////////////////////////

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + 
                tipoEntrada + ", marca=" + marca + '}';
    }
    
    
}
