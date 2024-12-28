//en jav se pueden tener varias clases
//perosolo una d estas deeb ser tipo publica
package palabrathis;

/**
 *
 * @author eber
 */
public class PalabraThis {
    
    public static void main(String[] args) {
        //mandamos llamar primero este constructor por eso se ejecuta primero
        //todo lo de dentro de este
        Persona persona1= new Persona("Juan", "Perez");
        
        //y al final se imprime el objeto por lo mecionado arriba
        System.out.println("persona1 = " + persona1);
    }
    
   
    
}


 class Persona{
        
        String nombre;//atributos que no tienen public o private
        String apellido;//son atributos de tipo default o packetage
        //esos se pueden usar por todo el paquete donde se ubiquen
        
        
        Persona(String nombre, String apelido){
            this.nombre=nombre;
            this.apellido=apellido;
            System.out.println("Objeto persona usando this= " + this);
            //Imprimir imprimir = new Imprimir(); esto es igual a la siguiente
            new Imprimir().imprimir(this);
            
        }
        
    }


class Imprimir{
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir= "+persona);
        System.out.println("Impresion de this="+this);
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
