package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    public Persona() {
        System.out.println("Ejeciucion del constructor ");
    }

    /////////////////Bloque de inicializacion no estatico//////////////////////////
    {
        //Estos tipos de bloque de inicializacion se ejecutan 
        //Inluso antes que el constructor de la clase
        //Pero despues de un bloque estatico

        System.out.println("Ejejcucion del bloque no estatiico");

        //Aqui yta podemos inicializar los atributos no estaticos
        //aqui ya podemso inicilaizar el de idPersona
        this.idPersona = Persona.contadorPersonas++;
        
        //En la linea anterior le volvimos a poner ++
        //Ya que cuando creas el primer objeto
        //Se ejeecuta el bloque de inicializacion estatica
        
        //Pero no se ejecuta cuando creas otro objeto,
        //Entonces en nuestro codigo solo se ejecutaria una vez
        //El bloque estatico y si lo dejamos asi el contador personas
        //no se incrementaria y se quedaria en 1
    }
//////////////////////////////////////////////////////////////////////////////////////////
//Este codigo es llamado bloque de inicializacion estatico
//El bloque se ejecuta antes del constructor y tambien
//se ejecuta antes que los bloques no estaticos

    static {

        System.out.println("Ejecucion del bloque estatico");

        ++Persona.contadorPersonas;

        //idPersona=10;
        //L linea anterior marca error ya que como sabemos
        //los atributos no estaticos no pueden ser utilizados
        //En contexto estatico
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    
    
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

    
    
}
