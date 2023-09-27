
package test;

/**
 *
 * @author eber
 */
public class TestArreglos {
    
    public static void main(String[] args) {
        
        
        ///////////////asi se define un array//////////////////////
        //del lado izquiero se define la variable
        //y del lado derecho se instancia un objeto array
        int edades [] = new int [3];
        System.out.println("edades = " + edades);
        
        
        /////asi se accede a cada elemento del arreglo/////////////
        edades[0] = 10;
        System.out.println("edades = " + edades[0]);
        
        edades[1] = 24;
        System.out.println("edades = " + edades[1]);
        
        edades[2] = 4;
        System.out.println("edades = " + edades[2]);
        
        /////////////////////////////////////////////////
        ////////////////OJOOOOOO////////////////////////
        ///////////////////////////////////////////////
        //EN LA SIGUIENTE LINEA DE CODIGO
        //NO MARCA ERROR AL COMPILAR
        //PERO SI AL MOMENTO DE EJECUCION
        
        //edades [3]=12;
        
        /////////////////////////////////////////
        
        ////en el siguiente bloquede codigo recorremos el array
        //e imprimimos cada uno de sus valores con ayuda de un ciclo for
        
        ////////////////length nos trae e valor total de items en el areglo
        for(int i =0; i<edades.length; i++){
            
            System.out.println("edades elemento "+i+": "+edades[i]);
            
            
        }
        ///////////para entender mas el length////////////////
        System.out.println("CANTIDAD DE ITEMS "+edades.length);
        
        ///////////////////ARREGLOSDE SYNTAXIS RESUMIDA//////////
        //de esta forma tambien se puedend efinir arreglos
        //en una mismalnease puede definr la cantidad y el cotenido
        //Como en el siguiete ejemplo
        
        String campeones[] = {"Wukong","Ekko","rammus"};
        
        for (int i = 0; i < campeones.length; i++) {
            
            System.out.println("Mejores campeones 2023: "+i+campeones[i]); 
            
        }
    }
    
}
