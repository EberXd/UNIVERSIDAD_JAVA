
package mundopc;

import mx.com.gm.mundopc.*;


public class MundoPc {
    
    
    public static void main(String[] args) {
        
            Monitor monitorHP = new Monitor("HP",13);
            Teclado tecladoHP = new Teclado("Normal", "Apple");
            Raton raton1 = new Raton("Normal", "Rezer");
            Computadora computadoraGto = new Computadora("GTO",
                    monitorHP,tecladoHP
            ,raton1);
            
           
                    
            Monitor monitorGamer = new Monitor("Gamer",44);
            Teclado tecladoGamer = new Teclado("Bluethoth", "Apple");
            Raton raton2 = new Raton("Normal", "Rezer");
            Computadora computadoraGamer = new Computadora("GamerPC",
                    monitorGamer,tecladoGamer
            ,raton2);
            
            
            Orden orden1 = new Orden();
            orden1.agregarComputadora(computadoraGamer);
            orden1.agregarComputadora(computadoraGto);
            orden1.mostrarOrden();
            
            
    }
    
    
    
    
    
    
}
