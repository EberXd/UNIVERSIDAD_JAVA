package paquete1;
/////////////////////////////PUBLIC/////////////////////////////////////
//cuando una clase es publica
//se puede utilizar desde nuestro mismo paquete
//o desde  otro paquete en nuestro proyecto

/////////////////////////////PROTCTED/////////////////////////////////
//Las clases no se pueden definir de tipo protected
public class Clase1 {

    //cuando un atributo o constuctor es publico puedes acceder desde otr clase
    //modificarlo y extraerlo diectamente, etc, desde el mismo paquete
    //u otro
    public String atributoPublico = "Valor atributo publico";

    public Clase1(String arg) {
        System.out.println("Constructor publico");
    }

    //Los metodos publicos vienen siendo el mismo caso 
    public void metodoPublico() {

        System.out.println("Metodo publico");

    }
    /////////////////////////////PROTCTED/////////////////////////////////
    //permite acceder desde las clases padres eh hijas y se puede incluso modificar
    //los protected no se pueden acceder desde otras clases fuera del mismo
    //package solousando herencia

    protected String atributoProtected = "Valor atributo PROTECTED";
    
    //constructoes de tipo protected solo se pueden acceder desde
    //clases hijas haciendo uso desuper
    protected Clase1() {

        System.out.println("Constructor protected");

    }

    //Los metodos protected vienen siendo el mismo caso 
    protected void metodoProtected() {

        System.out.println("Metodo protectd");

    }

}
