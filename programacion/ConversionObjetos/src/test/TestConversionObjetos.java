package test;

import domain.*;

public class TestConversionObjetos {
////////////////////////////////////////////////////////////////
    //////////////////////////CONVERSION///////////////////////////
    ///////////////////////////////////////////////////////////
    //UPCASTING CONSISTE EN VOLVER UNA CLASE HIJA EN UNA PADRE
    //DOWNCASTING VOLVER UNA CLASE PADRE EN UNA HIJA
    
    public static void main(String[] args) {
        
        Empleado empleado1;
        
        
        //aqui una variable de tipo padre almaceno un objeto tipo hijo
         empleado1 = new Escritor("Juan", 5000,
         TipoEscritura.CLASICO);
       
        System.out.println("empleado1 = " + empleado1);
        
        //al mandar llamar ete metodo se aplica el polimorfismo
        //ya que como le estamos mandando una referencia de tipo escritor
        //entonces se ejecuta su metodo
        System.out.println(empleado1.obtenerDetalles());
        
        //el sguiente metodo pertenece a la clase hija, y no nos permite acceder
        //debidoa quue el tipo de variale estipo Epleado y ese tipo padre
        //para aver podido acceder,este metodo deberia estar en laclase padre
        //empleado1.getTipoEscritura();
        
  ///////////////////////////////////////////////////////////////////////////////////////      
        //para acceder utilizaremos el downcasting para convertir los tipos
        //convertimos el tipo padre a tipo escritor
        //en pocas palabras conviertes lavariable de tipo padre a tipo hija
        //((Escritor)empleado1).getTipoEscritor();
        
        //otra forma de hcerlo es la siguiete y es mejor
        //aqui almacenamos lal variable tipo empleado en la nueva tipo escritor
        //y aun trae el objeto esccritor
        Escritor escritor1 = (Escritor)empleado1;
        escritor1.getTipoEscritor();
        
       
        
        ////////////////////////////////////////////////////////////////////
        /////////////////////////////UpCasting/////////////////////////////
        //////////////////////////////////////////////////////////////////
        //aca creamos una variable tipo empleado y lealmacenamos la tipo escritor
        //aun traemos el objeto tipo escritor
        //al hacer esto no podeos acceder de nuevoa los metodos de la clase hija
        Empleado empleado3 = escritor1;
        System.out.println("empleado3 = " + empleado3.obtenerDetalles());
        
        //aqui vuelvo a hacer dowcasting para que me quede ams claro
        //y volvemos a acceder almetodo de la clase hija
        ((Escritor)empleado3).getTipoEscritor();
        
        
        ///////////////////////////////////////////////////////////////////////
        ///////////////////////////////CONCLUSION/////////////////////////////
        /////////////////////////////////////////////////////////////////////
        //El downCasting:convertir una variable tipo padre a una hija
        //UP CASTNG: Convertir una variable tipo hija a tipo padre
        //esto con el objetivo de acceder a los diferentes metodos de cada clase
        //
    }
    
    
    
    
    

}
