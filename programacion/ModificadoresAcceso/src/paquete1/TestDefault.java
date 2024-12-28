
package paquete1;

/**
 *
 * @author eber
 */

//default es una palabra reserada de java 
//experiencia propia
public class TestDefault {
    
    
    public static void main(String[] args) {
        
        ClasePorDefault variable =new ClasePorDefault();
        
        variable.atributoDefault="Modificacion atributo default";
        System.out.println("Atributo default = " + variable.atributoDefault);
        
        variable.metodoDefault();
        
        ///////////////////////////////PARA ACCEDER A LO PRIVADO//////////////
        variable.setAtributoPrivado("Modificacion atributo privado");
        System.out.println("Atributo privado= "+variable.getAtributoPrivado());
    }
    
    
    
}
