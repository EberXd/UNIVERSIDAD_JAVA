
package test;

//esteimport es el mejor y no se sobrecargaa la memorias
////////////////////////////////////////////////////////////////////
//este import es para archivo por archivo
//que flojera
//import mx.com.globalmentoring.Uteleria;
///////////////////////////////////////////////////////////////////
//asi se importa un metodo estatico diectamnte
//con este import se puede usar el metodo sin referenciar la clase 
//a la que pertenece
//solo se uede hacer con metodos estaticos
//import static mx.com.globalmentoring.Uteleria.imprimir;

public class TestUtileria {
    
    
    public static void main(String[] args) {
        /////utilizar el metodo con la clasee importada////////////////////
        //Uteleria.imprimir("Hola Mundo");
        
        
        ///////Utilizar el metodo con el metodo importado directmente////////
        //imprimir("Hola mundo");
        
        ///////////////////usar el metodo sin ningun import///////////////
        ////////NOMBRE COMPLETAMENTE CALIFICADO
        //ASI SE LE LLAMA
        //no es recomendable por que hace el codigo confuso de leer
        //lo mejor es usar el primero 
        //pero serviria para castrar otros programadores xd
        mx.com.globalmentoring.Uteleria.imprimir("Hola mundo");
        
        
    }
    
    
    
    
}
