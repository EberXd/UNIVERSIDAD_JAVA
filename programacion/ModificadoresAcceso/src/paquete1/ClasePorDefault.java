package paquete1;

/**
 *
 * @author eber
 */
class ClasePorDefault {
    //////////////////////////MODIFICADOR DEFAULT///////////////////////

//para defnir alguna clase,atributo, constructor o metodo como defult o package
//simplemente se deja sin modificador de acceso
//los que tienen este modificdor de acceso no se puedn usar fuera del paquete
//donde se encentran
     String atributoDefault = "Valor atributo default";

    ClasePorDefault() {
        this("Argumento");
        this.metodoPrivado();
        System.out.println("Constructor default");
    }

    void metodoDefault() {
        
        System.out.println("Metodo default");

    }

    //////////////////////////MODIFICADOR PRIVATE///////////////////////
    ///////////////////////////////////////////////////////////////////
    //LAS CLASES NO SE PUEDEN DEFINIR COMO PRIVADAS
    //los aributos privados no se pueden mdificr directamente
    //desde ninguna otra clase
    private String atributoPrivado = "Valor atributo privado";

    //un constructor privado solo se puede usar dentro
    //de la misma clase
    
    ///nisiquiera una clase hija puede acceder, ni con super
    private ClasePorDefault(String privado) {

        System.out.println("Constructor privado");

    }
    //No se puede acceder a un todo privao desdeotra clase exerterna
    //quia on el constructor
    private void metodoPrivado() {

        System.out.println("Metodo privado");

    }

  
    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    
    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
        
        
    }
    
    ////////////////////////////////CONCLUSION PRIVATE////////////////////
    //Es el modificador mas seguro y restrictivo,ni con herencia se puede acceder
    //solo con encapsulamiento para los atributos
   //y para los metodos y coonstructores haciendo uso de un constructor
    //con otro modifcadorde acceso diferente
    
}
