
package mx.com.gm.ventas;




public class Orden {
    
    
    ////////////////////////////////////////
    ////////////ATRIBUTOS//////////////////
    //////////////////////////////////////
    
    private int idOrden;
    private Producto productos[];
    private static int contatadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
     ////////////////////////////////////////
    ////////////CONSTRUCTORES//////////////////
    //////////////////////////////////////
    public Orden(){
        
        this.idOrden = ++Orden.contatadorOrdenes;
        
        this.productos = new Producto[MAX_PRODUCTOS];
    }
    
   
    ////////////////////////////////////////
    ////////////METODOS//////////////////
    //////////////////////////////////////
    public void agregarProducto(Producto producto ){
        
        if(this.contadorProductos<Orden.MAX_PRODUCTOS){
            
            productos[this.contadorProductos++] = producto;
            
        }else{
            
            System.out.println("Se ha superado el maximo "
                    + "de productos");
        }
        
        
    }
    
    public double calcularTotal(){
        
        double total = 0;
        
        //El for recorre hasta la cantidad de productos
        //agregados
        for (int i = 0; i < this.contadorProductos; i++) {
            
            //se crea una variable tipo producto
            //esta variable se le da el valor del array 
            //el valor del array va ir cambiando por el
            Producto producto = this.productos[i];
            
            //aqui obtenemos el valor del precio del producto recorrido
            // y se va sumando el valor en cada vuelta del for
            total += producto.getPrecio();//total = total + producto.getPrecio
            
        }
        
        //el metodo al final regresa el valor total sumado
        
        return total;
    }
    
    ////El siguiente metodo muestra todo los datos de la orden
    
    public void mostrarOrden(){
        //la primemra linea es simpre solo se imprime el id
        System.out.println("ID Orden: " + this.idOrden);
        //en esta linea se imprime el total con ayuda del metodo
        //de arriba
        System.out.println("Total: "+ this.calcularTotal());
        
        //en esta linea se imprimen todos los objetos de tipo
        //producto con ayuda del toString y el array
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            
            System.out.println(this.productos[i]);
            
        }
        
        
        
    }
    
    
}
