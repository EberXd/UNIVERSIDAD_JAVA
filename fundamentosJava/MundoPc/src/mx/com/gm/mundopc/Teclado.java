package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

    ////////////////////////////////////////
    ////////////ATRIBUTOS//////////////////
    //////////////////////////////////////
    private final int idTeclado;
    private static int contadorTeclados;

    ////////////////////////////////////////
    ////////////Constructor//////////////////
    //////////////////////////////////////
    
    //cuando heredas de una clase que esta esperando 2 parametros
    //debemos pasarle esos dos argumentos haciendo uso de super y del
    //nuevo9 constructor de nuestra clase
    public Teclado(String tipoEntrada, String marca) {

        //primero se inizializan los atributos de la clase padre
        super(tipoEntrada, marca);

        //despues los de la clase actual
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    ////////////////////////////////////////
    ////////////TO STRING//////////////////
    //////////////////////////////////////
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() + '}';

    }

}
