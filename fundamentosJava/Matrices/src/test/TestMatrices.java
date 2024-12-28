
package test;

import domain.Persona;

/**
 *
 * @author eber
 */
public class TestMatrices {
    
    
    public static void main(String[] args) {
        
        //y asi definimos una matris
        //el primer numero entre corchetes indica la fila o renglon
        //elsegundo indica el numero de columnas
        //en si almacena 6 datos
        
        int edades [][] = new int[3][2];
        
        //asi se modifican los valores dento del arreglo
        
        
        edades[0][0]=5;
        edades[0][1]=23;
        edades[1][0]=21;
        edades[1][1]=15;
        edades[2][0]=10;
        edades[2][1]=12;
        
        //asi se accede a los valores
        
        System.out.println("edades 0-0 ="+edades[0][0]);    
        System.out.println("edades 0-1 ="+edades[0][1]);    
        System.out.println("edades 1-0 ="+edades[1][0]);    
        System.out.println("edades 1-1 ="+edades[1][1]);    
        System.out.println("edades 2-0 ="+edades[2][0]);    
        System.out.println("edades 2-1 ="+edades[2][1]);  
        
        /// para correr una matriz se requiere un ciclo ford anidado
        //de la siguiente forma
        int suma=0;
        for (int renglon = 0; renglon < edades.length; renglon++) {
            
            for (int columnas = 0; columnas < edades[columnas].length; columnas++) {
                
                System.out.println("edades "+renglon+" - "+columnas+" "+edades[
                        renglon][columnas]);
               
                
                suma = suma + edades[renglon][columnas];
                
                
                
            }
            
            
        }
        System.out.println("suma = " + suma);
        
        ///la manera comun y facil es efinir las matrices como el primer ejemplo
        //pero tambiense puede usar la syntaxis  simplificada
        
        String campeones[][] = {{"Garen", "mundo"},{"talon", "ekko"}
        ,{"WUKONG","Ekko"}};
        
        imprimir(campeones);
        //////////creando una amtriz de tiposobjetos/////////////
        /////////////////utilizando las matrices
        
        Persona personas[][]=new Persona[2][3];
        
        personas[0][0]=new Persona("Eber");
        personas[0][1]=new Persona("Ale");
        personas[0][2]=new Persona("Prieta");
        personas[1][0]=new Persona("Prieto");
        personas[1][1]=new Persona("Amber");
        personas[1][2]=new Persona("Refus");
        
        imprimir(personas);
        
        
    }
    
    public static void imprimir(Object matriz[][]){
        
         
        for (int fil = 0; fil < matriz.length; fil++) {
            
            for (int column = 0; column < matriz[fil].length; column++) {
                
                System.out.println("Datos "+fil+"- "+column+" "
                +matriz[fil][column]);
                
            }
            
        }
        
        
    }
    
    
}
