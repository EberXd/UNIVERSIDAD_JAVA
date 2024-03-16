package domain;

//RECUERDA QUE ESTAS CLASES SE LES LLAMA DE ENTIDAD POR QUE UNA DE ESTAS
//REPRESENTA UNA TABLA EN NNUESTRA BASE DE DATOS
public class PersonaDTO {

    ///////////////////////////////////////////////////////////////
    ////////////////////////ATRIBUTOS/////////////////////////////
    /////////////////////////////////////////////////////////////
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    ///////////////////////////////////////////////////////////////
    ////////////////////////CONSTRUCTORES/////////////////////////////
    ///////////////////////////////////////////////////////////// 
    //aqui se aprecia la sobre carga de constructor, por que hay mas de 1
    public PersonaDTO() {
        
    }
    //constructor para eliminaar
    public PersonaDTO(int idPersona) {
        this.idPersona = idPersona;
    }

    //constructor para agregar
    public PersonaDTO(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    //constructor para editar
    public PersonaDTO(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    //////////////////////////////////////////////////////////////
    ////////////////////////GETTERS AND SETTERS/////////////////////////////
    ///////////////////////////////////////////////////////////// 
    //recuerda que los setters son para acceder a losatributos y modificarlos
    //los getters para obtenersus valores de los atributos
    //el sufijo this.variable = indica que es un atributo de la clase
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //////////////////////////////////////////////////////////////
    ////////////////////////TOSTRING/////////////////////////////
    ///////////////////////////////////////////////////////////// 
    //RECUERDAQUESIRVE PARA IMPRIIR EL ESTADO DE NUESTRO OBJETO EN CUALQUIER
    //MOMENTO

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    //RECUERDA QUE ESTA CLASE ES UN JAVA BEAN POR LA PRESENTE ESTRUCTURA EH IMPORTANCIA
    //DE LA MISMA
}
