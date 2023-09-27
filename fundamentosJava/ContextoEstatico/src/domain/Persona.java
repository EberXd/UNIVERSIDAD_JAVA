package domain;

/**
 *
 * @author eber
 */
public class Persona {

    /////////////////////////////////////////
    //////////////ATRIBUTOS DE LA CLASE//////
    ////////////////////////////////////////
    private int idPersona;
    private String nombre;
    //si no hacemos estatica esta variable no podria contar
    //los objetos que se crean,ya que si fuuera una variable normal
    //se resetearia cada que se creara un nuevo objetoo
    private static int contadorPersonas;

    /////////////////////////////////////////
    //////////////CONSTRUCTOR//////
    ////////////////////////////////////////
    public Persona(String nombre) {

        this.nombre = nombre;

        //de esta forma se accede a atributos estaticos
        //y se referencian para buena practica en vez de usar this
        Persona.contadorPersonas++;
        //se asigna el nuevo valor a la variable id persona
        //paradiferenciarlas
        this.idPersona = Persona.contadorPersonas;
    }

    /////////////////////////////////////////
    //////////////GETTERS//////
    ////////////////////////////////////////
    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    /////////////////////////////////////////
    //////////////SETTERS///////////////////
    ////////////////////////////////////////
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

        /////////////////////////////////////////
    //////////////METODO TO STRING///////////////////
    ////////////////////////////////////////
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    

}
