/*
ES IMPORTANTE MENCIONAR QUE ME FALTO VER LA CLASE 5 DE ESTA LECCION
EN ESA CLASE SE IBA A TOMAR EL TEMA DE LAS EXCEPCIONES QUE HEREDAN
DE RuntimeException, A LO QUE MENCIONO EL PROFE, ESTA CLASE NO ES TAN COMPLICADA
COMO ESTA QUE REALIAMOS, AUN ASIPARA TENER CONOCIMIENTOS DE ESTA
Y RETOMAR ELVIDEO CUANDO SE PUEDA

            "La diciplina es la unica que te pondra donde quieres".

 */
package excepcions;



//para que el compilador nos detecte como una clase de excepcion debemos hacer
//que herde de una clase de excepciones: Exception, RuntimeException, SQLException,
//NullPointerException

//esto nos sirvepara crear nuestras propas excepciones, ya que habra ocaciones
//en las cuales requeriremos nuestras propias excepciones especificas
public class OperacionExcepcion extends Exception{
    
    //para inicializar correctamente la clase padre, tenemos que mandarle
    //un texto  con la exxcepcion atrvez de super
    public OperacionExcepcion(String mensaje){
        super(mensaje);
        
        
        
    }
    
    
    
    
    
    
    
}
