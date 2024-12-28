
package operaciones;

/**
 *
 * @author eber
 */
public class PruebaOperaciones {
    
    public static void main(String[] args) {
       
        Aritmetica aritmetica1 = new Aritmetica();
        //las variables locales son variables dentro 
        //de un metodo, estas se eliminan despues de 
        //ejecutarse en el mismo
        //var no puede usarse  como atributo ni como argumento
        //de un metodo, solo dentro de los metodos
        var i=10;
        var j = 15; 
        miMetodo();
        
        aritmetica1.a=14;
        aritmetica1.b=10;
        
        //usando un metodo void
        aritmetica1.sumar();
        
        //aqui almacenamos el valor del metodo
        //suam  con retorno hacendo uso del objeto
        //despues se imprime y ya/
        //se usa un metodo que tiene return
        int resultado =aritmetica1.sumarConRetorno();
        
        System.out.println("resultado con retorno = " + resultado);
        
        //se usa un metodo que regresa y recibe argumentos
        resultado = aritmetica1.sumarConArgumentos(8, 2);
        System.out.println("resultado usando argumentos = " + resultado);
        
        
        ///mandando llamar al constructor con argumentos
        Aritmetica aritmetica2 = new Aritmetica(10,8);
        System.out.println("aritmetica2 a= " + aritmetica2.a);
        System.out.println("aritmetica2 b= " + aritmetica2.b);

    }
    
        
    public static void  miMetodo(){
        //i=10 la variable se queda en el otro metodo
        //las locales solo son del mismo metodo
        System.out.println("Otro metodo");
        
    }
    
    
    
    
}
