
package paquete2;

import paquete1.Clase1;




public class ClaseHiija extends Clase1{
    

public ClaseHiija(){
    
    super();
    
    this.atributoProtected= "Modificacion atributo protected";
    
    System.out.println("Atibuto protegido = " + atributoProtected);
    this.metodoProtected();
    
}


    
    
}
