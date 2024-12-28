package test;

import domain.*;

public class TestSobreescritura {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Eber", 10000, "TI");
        //System.out.println("Gerente1 = " + gerente1.obtenerDetalles());
        
        imprimir(gerente1);
        ///////////////////////////////////////////////////////////////////////
        ////////////////////////////POLIMORFISMO////////////////////////////////
        ///////////////////////////////////////////////////////////////////////
        //Este concepto es muy importante cuando se trata de la programacion orientada
        //a objetos, paraque se aplique el polimorfismo debemos tener overraiding
        Empleado empleado1 = new Empleado("Juan",5000);
        
        //System.out.println("Empleado = "+empleado1.obtenerDetalles());
        imprimir(empleado1);
        
        
    }
    
    //////////////////////Aqui se aplica el polimosrfismo//////////////////
    //El metodo obtenerDetalles de este metodo se comporta diferente deacuerdo
    //a la cantidad de argumentos enviados al constructor
    //en este caso cuando le mandas el departamento se ejecuta elmetodo de la 
    //clase hija
    //y si no se lo mandas entonces se ejecuta el metodo de la clase padre
    
    
    //para mas simple, el metodo qque ejecuta es dependiendo al tipo de objeto
    //que mandes
    //si mandas objeto tipo gerente se ejecutasu metodo
    //si mandas un objeto tipo empleado se ejecuta empleado
    
    //esto sirve para obtimizar metodos y hacerlos mas genericos
    public static void imprimir(Empleado empleado){
        
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
    }

}
