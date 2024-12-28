package test;

public class TestAutoBoxingUnboxing {

    //Clases envolventes de tipos primitivos
    //int - Integer
    //long - Long
    //float - Float
    //double - Double
    // boolen Boolean
    //byte - Byte
    //char - Character
    //short - Shortss
    public static void main(String[] args) {

        int entero = 10;
        Integer enteroObject = 10;

        System.out.println("entero = " + entero);

        System.out.println("enteroObject = " + enteroObject.toString());
        
        
        
        //////////////////////////////////////////////////////////////////
        ///////////////////////////AUTOBOXING////////////////////////////
        ////////////////////////////////////////////////////////////////
        
        //cuando se usa la clase envolvente tienes acceso a diversos metodos
        //solo con poner el .
        //No es recomenable usarlos cuando se realiaran muchas operaciones
        //Pero su utilidad es muy extensa

        System.out.println("enteroObject tipo Double = "
                + enteroObject.doubleValue());
        
        
        //////////////////////////////////////////////////////////////////
        ///////////////////////////UNBOXING//////////////////////////////
        ////////////////////////////////////////////////////////////////
        //Aqui se extrae el valor del tipo object y lo transforma a int 
        //normal
        int unboxing = enteroObject;
        
        System.out.println("unboxing = " + unboxing);
        
    }

}
