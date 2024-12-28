
package mx.com.gm.mundopc;


public class Monitor {


    private final int idMonitor;
    private String marca;
    private Double tamanio;
    private static int contadorMonitores;
    
    
    private Monitor(){
        this.idMonitor=++Monitor.contadorMonitores;
        
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.marca=marca;
        this.tamanio=tamanio;
           
    }
    
    public int getIdMonitor(){
        
        return this.idMonitor;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + 
        ", tamanio=" + tamanio + '}';
    }
    
    
    
    
}
