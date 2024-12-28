
package test;

import domain.Empleado;


public class TestClaseObject {
   ///////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////CLASE OBJECT///////////////////////////////
   //Esta clase es la clase padre de todas las clases, esta nos permite acceder
    //adiversos metodos predefinidos:
    //toString(); imprime en consola los atributos de la clase
    //hascode(); genera un numero unico para cada objeto y eso permite comparar los numeros
    //equals(); compara el contenido de los objetos 
    //
    public static void main(String[] args) {
        //al poner new se genera un nuevo objeto y por lo tanto un nueva referencia
        //de memoria RAM
        Empleado empleado1 = new Empleado("Juan", 5000);
        
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        ////////////////////////////////////////////////////////////////////////
        //Aqui se compara solamente las referencias en memoria de los objetos
        
        if (empleado1 == empleado2) {
            
            System.out.println("Tiene la misma referencia en memoria");
            
        }else{
            
            
            System.out.println("Tiene diferente referencia en memoria");
            
        }
        //Aqui vamos a emplear el metodo equals
        
        if (empleado1.equals(empleado2)){
            
            System.out.println("Son iguales en contenido");
            
        }else{
            
            
            System.out.println("Son diferentes en contenido");
            
        }
        
        //Aqui vamos a comparar los numeros de hascode
        if (empleado1.hashCode() == empleado2.hashCode()) {
            
            System.out.println("Los objetos tienen el mismo numero ash");
            System.out.println("empleado2 = " + empleado2.hashCode());
        }else{
            
            System.out.println("Los objetos tienen diferente numero hash");
            System.out.println("empleado1 = " + empleado1.hashCode());
            System.out.println("empleado2 = " + empleado2.hashCode());
        }
        
        
    }
    
    
}
