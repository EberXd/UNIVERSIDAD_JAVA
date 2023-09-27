package domain;

public class Escritor extends Empleado {

    final TipoEscritura tipoEscritor;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritor) {

        super(nombre, sueldo);
        this.tipoEscritor = tipoEscritor;

    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Tipo Escritura: "
        
        + tipoEscritor.getDescripcion();

    }

    @Override
    public String toString() {
        return super.toString()+" "+"Escritor{" + "tipoEscritor=" + tipoEscritor + '}';
    }
    
    

    public TipoEscritura getTipoEscritor() {
        return this.tipoEscritor;
    }
    
    

}
