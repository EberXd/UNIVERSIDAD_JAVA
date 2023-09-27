
package test;

import genericos.ClaseGenerica;


public class TestGenerics {
    
    
    public static void main(String[] args) {
        
        
        //asi definimos un objeto de una clase con atributo generico
        //hay que poner atencion en que no se puede definir el atributo con
        //tipos primitivos: Int, Double, Etc
        //se debeusar la clase completa           le mandamos un 15 al metodo
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        
        objetoInt.obtenerTipo();
        
        //las ventajas de tener este atributo generico nos da la oportunidad
        //de crear varios objetos diferentes por ejemplo ahora lo haremos String
        
        ClaseGenerica<String> genericString = new ClaseGenerica("Hi generics");
        
        genericString.obtenerTipo();
        //se pede acceder al valor con un get como cualquier atributo normal
        System.out.println("genericString = " + genericString.getObjeto());
    }
}
