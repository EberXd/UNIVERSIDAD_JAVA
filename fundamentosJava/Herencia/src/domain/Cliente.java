package domain;

import java.util.Date;

/**
 *
 * @author eber
 */
public class Cliente extends Persona {

    //////////////////////////////////////////////////
    /////////////////////ATRIBUTOS//////////////////
    ////////////////////////////////////////////////  
    private int idCliente;
    private static int contarCliente;
    private Date fechaRegistro;
    private boolean vip;

    //////////////////////////////////////////////////
    /////////////////////CONSTRUCTOR//////////////////
    ////////////////////////////////////////////////  
    public Cliente(String nombre, char genero, int edad, String direccion,
            Date fechaRegistro, boolean vip) {
        //estamos llando el constructor completo de persona
        ///obviamente con super
        super(nombre, genero, edad, direccion);

        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        //se aumenta lavariable idCliente
        this.idCliente = ++Cliente.contarCliente;

        //////////////////////////////////////////////////
        /////////////////////getters//////////////////
        //////////////////////////////////////////////// 
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    //////////////////////////////////////////////////
    /////////////////////setters//////////////////
    //////////////////////////////////////////////// 
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    //////////////////////////////////////////////////
    /////////////////////to string//////////////////
    //////////////////////////////////////////////// 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", datos de clase padre=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
