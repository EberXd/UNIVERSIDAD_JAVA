
package mx.com.gm.ventas;




public class Producto {
    
    ////////////////////////////////////////
    ////////////ATRIBUTOS//////////////////
    //////////////////////////////////////
    
    
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
     ////////////////////////////////////////
    ////////////CONSTRUCTORES///////////////
    //////////////////////////////////////
    
    private Producto(){
        
        this.idProducto = ++Producto.contadorProductos;
        
        
    }
    
    
    public Producto(String nombre, double precio){
        
        this();//aqui mandamos llamar al constructor vacio 
        //con eso se inizializa el id producto y el contaodr
        
        //despues les asignamos a los atributos los valores
        //de los argumentos del constructor
        
        this.nombre = nombre;
        this.precio = precio;
        
        
    }
    
     ////////////////////////////////////////
    ////////////GETTERS AND SETTERS////////
    //////////////////////////////////////
    public int getIdproducto(){
        return this.idProducto;
        
        
    }
    
  
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre 
                + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
}
