package test;

import domain.Cliente;
import domain.Empleado;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author eber
 */
public class TestHerencia {

    public static void main(String[] args) {
        //solo se pueden crear objetos dentro del psvm

        //cuando se trabaja con herencia con un solo objeto 
        //puedes acceder a todas las clases
        Empleado empleado1 = new Empleado("Eber", 0);
        System.out.println("empleado1 = " + empleado1);

        /////asi se se obtiene la fecha delsistema
        Date fechaActual = new Date();
        //asi se le da formato a la fecha que se obtiene del sistema

        //SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        //String fechaConFormato=sdf.format(fechaActual);
        //lo deje en comentario por que all convertirlo regresa un tipo
        //strig y nosotros para nuestro constructor ocupamos un tipo date
        //entonces pasareel tipo date normal
        Cliente cliente1 = new Cliente("Eber", 'M', 24,
                "Acueducto", fechaActual, true);
        System.out.println("cliente1 = " + cliente1);
        Cliente cliente2 = new Cliente("Ale", 'F', 26,
                "IRAMUCO", fechaActual, false);
        System.out.println("cliente2 = " + cliente2);
    }

}
