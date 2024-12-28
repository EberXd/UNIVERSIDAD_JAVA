
package mx.com.gm.mundopc;




public class Computadora {
    
    
    ////////////////////////////////////////
    ////////////ATRIBUTOS//////////////////
    //////////////////////////////////////
    
    private final int idCompuutadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    
    private static int contadorComputadoras;
    
    
    ////////////////////////////////////////
    ////////////Constructor//////////////////
    //////////////////////////////////////
    private Computadora(){
        
        this.idCompuutadora=++Computadora.contadorComputadoras;
       
        
        
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado,
    Raton raton){
        
        this();
        this.nombre=nombre;
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
        
    
        ////////////////////////////////////////
    ////////////GETTERS AND SETTERS//////////////////
    //////////////////////////////////////
        
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    ////////////////////////////////////////
    ////////////METODO TO STRING//////////////////
    //////////////////////////////////////
    
    @Override
    public String toString() {
        return "Computadora{" + "idCompuutadora=" + idCompuutadora + ", nombre="
                + nombre + ", monitor=" + monitor + ", teclado=" + teclado + 
                ", raton=" + raton + '}';
    }
    
    
    
    
}
