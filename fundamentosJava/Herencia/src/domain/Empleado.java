package domain;

/**
 *
 * @author eber
 */
//extends es para heredar
public class Empleado extends Persona {

    public static void setContadorEmpleado(int aContadorEmpleado) {
        contadorEmpleado = aContadorEmpleado;
    }

    //////////////////////////////////////////////////
    /////////////////////ATRIBUTOS//////////////////
    ////////////////////////////////////////////////
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //////////////////////////////////////////////////
    /////////////////////constructor//////////////////
    ////////////////////////////////////////////////
    public Empleado(){
        
        this.idEmpleado=++Empleado.contadorEmpleado;

        
        
    }
    
    
    
    
    public Empleado(String nombre,double sueldo) {
        //de esta forma se inicializa un constructor
        //de la clase padre
        //aqui estamos mandando llamar el constructor con un 
        //solo atributo
        
        //super(nombre);
        
        //aqui mandmos a llamar al constructor vacio
        //para incrementar la variable idContador
        //la diferencia es que no podemos usar super
        //cuando llamamos con this a un constructor
        //pero podemos acceder al atributo directamente
        this();
        //aqui accedemos al atributo nombre de la clase padre
        //directo con this.
        this.nombre=nombre;
        this.sueldo = sueldo;
        
    }

    //////////////////////////////////////////////////
    /////////////////////getters//////////////////
    ////////////////////////////////////////////////
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    //////////////////////////////////////////////////
    /////////////////////setters//////////////////
    ////////////////////////////////////////////////
    


    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //////////////////////////////////////////////////
    /////////////////////toString//////////////////
    ////////////////////////////////////////////////

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", toString clase padre=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    

}
