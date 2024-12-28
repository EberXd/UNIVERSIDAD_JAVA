
package test;

import aritmetica.Aritmetica;
import excepcions.OperacionExcepcion;

/*
1: la clase padre de lasl excepciones es Esxcepcion esa clase hereda de Throwable
pero solo accederemos siempre a Excepcion.

2:Podremos crear nuestras excepciones atravez de esta clase.

3: las excepciones que heredan directamente de la clase Excepcion son errores 
que requieren de  un try chatch

4: las excepciones que heredan de la clase RuntimeException no requieren un try catch
ya que estas fallan en tempo de ejecucion y por ejemplo el ejersicio siguiente
nonos marca error si no ponemos el try catch, pero al ejecutar  falla



*/



public class TestExcepcions {
    
    
    public static void main(String[] args) {
        int a =0;
        
        ////////////////////////ESTE ES UN TRY CATCH COMUN//////////////////
        //Con ayuda de este try catch nuestro sistema puede seguir funcionando
        //solo nos marcael error y se contina ejecutando sin breackearse
        try {
            //aqui mandamos llamar el metodo division que ya esta condicionada
            //al error y esta se encntra dentro de nuestra clase Aritmeticas
            //como es un metodo estatico podriamos importarlo arriba
            //y mandarlo llamar directo, pero me gusta mas asi para ver su clase
            a = Aritmetica.division(10, 0);
        } catch (OperacionExcepcion e){
          
            //los catch se pueden usar empalmados similar a los if
            //para recibir varias excepciones pero es importante quesepas
            //QUE DEBES PONER DE MENOR IMORTANCIA A MAYOR IMPORTANCIA EN CUANTO
            //A LAS VARIABLES DE TIPO EXCEPTION, e este caso la clase Exception
            //es la padre, esta debe estar al final.
            System.out.println("Ocurrio un error tipo OperacionExcepcion");
            
            System.out.println(e.getMessage());
            
            
        
        
        
        }catch (Exception e) {
            System.out.println("Ocurrio un error tipo exception");
            //Aqui se manda a imprimir las excepciones a consola
            //sin esta impresion no se mandan a imprimir las excepcioes
            e.printStackTrace(System.out);
            //con la siguiente linea se puede imprimir solo el mensaje de excepcion
            //unico sin necesidad de mostrar todas la pila de excepciones
            //con getMesage
            System.out.println("Mensaje "+e.getMessage());
            
            
        }
        //lo que se encuentra dentro del bloque de codigo denominado fainally
        //siempre se va a ejecutar al terminar de revisar los try
        //incluso con errores o no
        finally{
            
            System.out.println("Se reviso la division entre cero");
            //tambien nos serviria para cerrar sesiones o conecciones de SQL
            //entre otras cosas
        }
        
        
        System.out.println("a = " + a);
        
        
    }
    
    
    
    
}
