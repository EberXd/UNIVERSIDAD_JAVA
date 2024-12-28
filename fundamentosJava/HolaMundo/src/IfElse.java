
/**
 *
 * @author eber
 */

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        var condicion = true;

        if (condicion) {

            System.out.println("Condicion verdadera");

        } else {

            System.out.println("condicion falsa");
        }

        ///ejercicio convertir un numero a texto
        var numero = 4;

        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "uno";
        } else if (numero == 2) {
            numeroTexto = "dos";
        } else if (numero == 3) {
            numeroTexto = "tres";
        } else if (numero == 4) {
            numeroTexto = "cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);

        ///////CALCULAR ESTACION DEL ANO DEPENDIENDO EL MES//////////
        Scanner consola =new Scanner(System.in);
        
        System.out.println("Ingresael numero de mes actual");

        var mes =Integer.parseInt(consola.nextLine());
        
        var estacion = "";

        if (mes == 1 || mes == 2 || mes == 12) {

            estacion = "Invierno";

        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";

        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "verano";

        } else if (mes == 9 || mes == 10 || mes == 11) {

            estacion = "otono";

        } else {
            System.out.println("Mes invalido");
        }
        System.out.println("estacion = " + estacion);
    }

}
