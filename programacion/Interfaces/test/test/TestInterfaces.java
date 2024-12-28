
package test;

import accesodatos.*;





public class TestInterfaces {
   
    
    public static void main(String[] args) {
        
        //aqui el tipo de variable la definimos tipo IAccesoDatos
        //para lograr que nuestro codigo sea mas generico por que de eso se trata
        //la programacion orientada a objetos
        
        //podemos hacer eso por que esta implementada la clase IAccesoDatos en
        //ImplementecionMySql
       IAccesoDatos datos = new ImplementecionMySql(); 
       //elmetdo se definio en la clase IAccesoDatos
       //pero como a referencia es de tipo ImplementecionMySql
       //entonces se ejecuta el metodo de ImplementecionMySql
       //estamos aplicando el concepto de polimorfismo
       datos.listar();
                
        //////haciendo uso del metodo de abajo/////
        delete(datos);
       //en una misma variable padre se pueden guarar instncias de las clases hijas
        datos = new ImplementacionOracle();
        
        datos.listar();
        
        //////haciendo uso del metodo de abajo/////
        delete(datos);
    }
    
    //este metodo recibe una variable tipo IAccesoDatos
    //y con esto podemos acceder a los diversos metodos
    //pero en ese en especfico accederemos al de eliminar
    public static void delete(IAccesoDatos datos){
        
        
        datos.delete();
    }
    
    
    
}
