
package test;

import operaciones.Operaciones;

/**
 *
 * @author eber
 */
public class TestOperaciones {
    
    
    public static void main(String[] args) {
        
        
        var resultado = Operaciones.sumar(10, 8);
        
        System.out.println("resultado = " + resultado);
        
        //usamos otra variable por que la primera quedo
        //tipo int y en este metodo retorna un doble
        var resultado2 = Operaciones.sumar(14.5, 16.7);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3= Operaciones.sumar(10, 5L);
        
        System.out.println("resultado3 = " + resultado3);
        
    }
    
    
    
}
