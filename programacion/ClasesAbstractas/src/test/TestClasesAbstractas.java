
package test;

import domain.*;


public class TestClasesAbstractas {
    
    
    public static void main(String[] args) {
        ///////DE UNA CLASEABSTRACTA NO PUEDES CREAR OBJETOS/////////////
        //EJEMPLO:
        //FiguraGeometrica figura1 = new FiguraGeometrica();
        
        //aqui usamos uocasting, asignamos una referencia tipo hijo a un tipo padre
        FiguraGeometrica figura = new  Rectngulo("Rectangulo");
        //el metodo se encuentra en comun en ambas clases
        //aqui se estaria aplicando el concepto de polimorfismo
        //basicamente para usar un metodo de una clase abstracta se debe
        //aplicar polimoorfismo
        
        figura.dibujar();
        
        
        
    }
    
}
