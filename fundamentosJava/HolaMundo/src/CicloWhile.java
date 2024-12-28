
/**
 *
 * @author eber
 */
public class CicloWhile {

    public static void main(String[] args) {

        //para este ciclo si la condicion es
        //verdadera se ejecuta el codigo
        //pero vuelve a revisar la sentencia
        var i = 0;

        while (i < 3) {

            System.out.println("Hola While " + i);
            i++;//esto haceque la variable se incremente
            //en uno cada que se ejecuta el ciclo y asi
            //ponerle fin cuando llega a 3

        }

        //////////////ciclo do while//////////
        //aqui primero se ejecuta el  codigo 
        //y despues revisa la condicion 
        //si la condicion es verdadera se vuelve
        //a repetir si es falsa termina
        var j = 0;

        do {//se ejecuta el codigo

            System.out.println("asi es con do while " + j);

            j++;

        } while (j < 3);//se revisa la condicion

    }

}
