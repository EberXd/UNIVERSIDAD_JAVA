package Clases;//esta debe ser siempre
//la primer linea de las classes
//hace referencia al paquete dondese encuentra nuestraclase

/**
 *
 * @author eber
 */
public class Persona {//las clases deben ser publicas
    //para aceder desde otros paquetes
    //atribuutos de la clase
    //estos atributos pueden usarse por ttodos
    //los metodos denuestra clase

    //requerimos ponerle public para
    //acceder desde otra clase
    //no es buena practica, es mejor con
    //encapsulamiento
    public String nombre;
    public String apellido;

    //asi se define un metodo en java
    //pero este metodo n retorna nada
    //solo recibe datos
    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apelido: " + apellido);

    }

   

}
