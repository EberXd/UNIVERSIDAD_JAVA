package domain;

import java.util.Objects;

public class Empleado {

    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        
        this.nombre=nombre;
        this.sueldo=sueldo;

    }

    public String obtenerDetalles() {
        
        return "Nombre: "+this.nombre + ", sueldo: "+this.sueldo;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
//////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////EQUALS AND HASHCODE/////////////////////
////////////////////////////////////////////////////////////////////////////////////
    
    ///hashCode lo que hace es generarun nmero entero unico para cada objeto,
    ///y esto con elproposito de poder comprar los numeros
    //COMO BUENA PRACTICA SE DEBE IMPLEMENTAR AMBOS METODOS, CON LOS MISMOS ATRIBUTOS
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }
    
    /////////////////////////////////////////////////////////////////////////
    //////////////////////////////  EQUALS///////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
    //Este metodo lo que compara es directamente el contenido de los objetos a comparar
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    

}
