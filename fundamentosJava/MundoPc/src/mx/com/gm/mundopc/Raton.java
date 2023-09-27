package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    ////////////////////////////////////////
    ////////////ATRIBUTOS//////////////////
    //////////////////////////////////////
    private final int idRaton;
    private static int contadorRatones;

    ////////////////////////////////////////
    ////////////Constructor//////////////////
    //////////////////////////////////////
    //cuando heredas de una clase que esta esperando 2 parametros
    //debemos pasarle esos dos argumentos haciendo uso de super y del
    //nuevo9 constructor de nuestra clase
    public Raton(String tipoEntrada, String marca) {

        //primero se inizializan los atributos de la clase padre
        super(tipoEntrada, marca);

        //despues los de la clase actual
        this.idRaton = ++Raton.contadorRatones;
    }

    ////////////////////////////////////////
    ////////////TO STRING//////////////////
    //////////////////////////////////////
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}';

    }

}
