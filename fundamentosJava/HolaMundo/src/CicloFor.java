
/**
 *
 * @author eber
 */
public class CicloFor {

    public static void main(String[] args) {
        //esta es la estructura del ciclo ford
        // es como el while pero mas elegante
        //todo se define entre los punto y coma
        //en el primer espacio se define la variable
        //en el segundo espacio la condicion
        //y en el tercero el incremento o decemento de la variable
        //algo a considerar esque la variable del for no se puede
        //usar fuera del ciclo y se destruye al finalizar el mismo
        for (var i = 0; i < 3; i++) {

            System.out.println("Asi se hace con for " + i);

        }

        //para usar la palabra reserbada break//////
        for (var i = 0; i < 99; i++) {

            if (i % 2 == 0) {
                System.out.println("Asi se hace con for y if " + i);
                break;//aqui con brake una vez que encontro un nmero
                //par rompe elciclo y se termina
                //es bueno para ejemlos como este
                //sin el break imprime todos hasta el 98
            }

        }

        //////////////CON LA PALARA CONTINUE//////////////
        inicio:
        for (var i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                continue inicio;//OJO AQUI con la etiqueta
                //CON CONTINUE SE REVISA LA CONDICION E NUEVO
                //IGNORANDO EL RESTO DEL CODIGO
                //CO ESTE IF CUANDO SE ENCUENTRA UN NUMEROPAR
                //OMITE  EL CODIGO DE ABAJO Y SE REGRESA A LA CONDICION
                //POR CONSECUENCIA IMPRIME TODOS LOS IMPARES DEL 1 ALL 100
            }
            System.out.println("Numeros IMPARES = " + i);

        }

        ////////////////ETIQUETAS EN JAVA////////////////
//          ES IMPORTANTE DESTACAR QUE ESTAS ETIQUETAS
//          NO SON RECOMENDABLES APLICARLAS EN LO PROFECIONAL
//          NO ES UNA BENA PRACTICA ADEMAS DE QUE ALTERALA LOGICA
//          DE NUESTROS PROGRAMAS.
           //MAS DETALLES VIDEO 5 CARPETA 6 
    }

}
