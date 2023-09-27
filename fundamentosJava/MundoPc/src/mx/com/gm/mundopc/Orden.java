
package mx.com.gm.mundopc;


public class Orden {
    
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrden;
    private static final int MAX_COMPUTADORAS=10;
    private int contadorComputadoras;
    
    
    public Orden(){
        this.idOrden=++Orden.contadorOrden;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];  
        
    }
    
    
    public void agregarComputadora(Computadora computadora){
        
        if (this.contadorComputadoras< Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++]=computadora;
            
            
        }else{
            
            System.out.println("No se pueden agregar mas computadoras");
            
        }
        
        
    }
    
    
    public void mostrarOrden(){
    
        System.out.println("# Orden:" + this.idOrden);
        System.out.println("Computadoras en la orden: "+idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            
            System.out.println(this.computadoras[i]);
            
        }
    }
    
    
    
}
