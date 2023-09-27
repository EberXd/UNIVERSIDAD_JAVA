
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    
    public static void main(String[] args) {
        /////////////////////PRIMERA ORDEN///////////////////
        
        Producto producto1= new Producto("Iphone 12",11500);
        Producto producto2= new Producto("Apple whatch",12000);
        
        Orden orden1= new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        
            /////////////////////SEGUNDA ORDEN///////////////////
    
                
        Producto producto3= new Producto("Case Nike",350);
        Producto producto4= new Producto("Extencion y protector",300);
        
        Orden orden2= new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.mostrarOrden();
        
        
        
    }
    
    
    
    
    
}
