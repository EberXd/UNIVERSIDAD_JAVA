
package operaciones;

/**
 *
 * @author eber
 */
public class Aritmetica {
    ////////////////////////////////
    //////////ATRIBUTOS/////////////
    ///////////////////////////////
    
    int a;
    int b;
     ////////////////////////////////
    //////////CONSTRUCTOR/////////////
    ///////////////////////////////
    //el metodo constructor se llama igual
    //que la clase principal
    //este metodo puede ir vacio o no
    //en  este caso se dejo en blanco pero basicamente
    //este metodo es el que permite crear objetos
    //desde otras clases y  permite referenciar 
    //la misma.
    //este es un constructor vacio
    public Aritmetica(){
        System.out.println("Constructor vacio en ejecucion");
        
    }
    
    //sobrecarga de constructores: es tener mas de 1 constructor
    public Aritmetica(int a, int b){
        //con this java diferencia entre el atributo de la classe
        //y los argumentos del metodo
       this.a= a;
       this.b= b;
        
    }
    
  
    //////////////////////////////////
    ////////////METODOS///////////////
    /////////////////////////////////
    //argumentos es lo quue recibe un metodo
    //en este caso el metodo lleva void (vacio en ingles)
    //por que no recibe ni retorna argumentos
    public void sumar(){
        
        int resultado = a+b;
        System.out.println("resultado void= " + resultado);
          
    }
    
    //en este caso el metodo va a regresar un entero
    //por eso en vez de void es un int
    public int sumarConRetorno(){
        
       int resultado = this.a + this.b; 
       //con el return se regresa el  valor int
       //del metodo
       //cualquier otra clase puede tomar este dato
       
       return resultado;
        
    }
    //lo que recibe el metodo se le llaman argumentos
    public int sumarConArgumentos(int  arg1, int arg2){
        //se puede utilizar directamente  el atributo de la clase
        //o tambien el operador this.b, this.a
        //this solo se puede usar dentro de lamisma clase
        //es una buena practica para darnos cuenta que el metodo
        //o el atributo pertenece a la misma clase donde esta encionado
        
        a=arg1;
        this.b=arg2;
        
        //return a+b; aqui seria creando nueva logica
        
        return this.sumarConRetorno();//aqu reutilizamos el codigo
        //el metodo reutilizado sin problemas puede realizar
        //la operacion
        
        
        
    }
    
    public void miMetodo(){
        //i=10 la variable se queda en el otro metodo
        //las locales solo son del mismo
        System.out.println("Otro metodo");
        
    }
    
    
}
