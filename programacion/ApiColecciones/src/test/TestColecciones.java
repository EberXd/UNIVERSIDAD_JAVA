package test;
//el API collections consiste en un conjunto de clases abstractas y la collecton es
//una clase interface.
//despues de terminar la leccion aprendi que las collecions son simples arrays especiales 
//con caracteristicas y funcionalidad diferente cada una




//Aqui se encuentra esa clase en util

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColecciones {

    public static void main(String[] args) {
        //estoes similar a un array  y nos permite agrgar
        //varios objetos a la lista
        //la diferencia es que el array pude r ceciendo dinamicamente
        //y no es necesario definir desde un principio cuantos elementos tendra
        List miLista = new ArrayList();
        //Podemos gregarcualquier valor
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add(10.5);
        //en el array tipo lista se pueden repetir valores
        miLista.add("viernes");
        //para iterar la lista se hace con for each
        //creamos ua variable tipo object y guardamos los datos en ella 
        for (Object elemento : miLista) {

            System.out.println("elemento = " + elemento);

        }

        ////apartir de java 8 se implemento otra funcion para recorrer este tipo
        //de listas y esla siguiente:
        //se le conce como landan o funcion flecha
        //hacen exactamente lo mismo ambas formas
        miLista.forEach(elemento -> {

            System.out.println("elemento = " + elemento);

        });

        //haciendo uso del metodo
        imprimir(miLista);

///////////////////VAMOS A TRABAJAR CON LA INTERFACE SET///////////////////////////
        ///ESTA INTERFACE es identica a la de arriba, la diferencia es que no se recuperan
        //los datos en el orden qe se agregan, taths all
        Set miSet = new HashSet();

        //un bue ejemplo de la utilizacionn dela herencia es este metodo add
        //este metodo add() se encunetra definido en Collection, y se hereda en 
        ///list y set y ambas interfaces pueden usarlo
        miSet.add(1);
        miSet.add(2);
        miSet.add(3);
        miSet.add(4);
        miSet.add(5);
        //en Set no se pueden duplicar valores o los ignorara
        miSet.add(5);
        //en este caso el set mantiee el orden pero nosiempre es asi, es aleatorio
        //es recomendable usarlo cuando no se ocupa mantener el orden, por que eso
        //lo hace mas rapido
        imprimir(miSet);

/////////////////////////VAMOS A TRABAJAR CON LA CLASE MAP///////////////////////////
        Map miMapa = new HashMap();
        //esta clase no hereda de Collection, herda de Map,
        //por lo tanto esta no usa add para agregar un bjeto ocupa put()
        //tambien admite cualquier tipo de valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Ugalde");
        
        //Aqui al duplicar una key en los tipo map
        //lo que ocurre es que se actualiza el valor en la key
        //tomando asi el ultimo valor de la key que se agrego
        miMapa.put("valor3", "Hernandez");
        
        
        
        //como se lograapreciar requerimos de la key para acceder al valor deseado
        //////////////////Aqui volvemos lavariabe tipo object a String para poder 
        //almacenar la cadena
        String recuperar= (String) miMapa.get("valor1");
        
        System.out.println("recuperar = " + recuperar);
        //miMapa.keySet(), nos trae todas las llaves y las podemos recorrer
        //con el foreach, los set no garantizan el orden como el anterior
        imprimir(miMapa.keySet());
        //para recuperar todos los valores se requiere del metodo values();
        imprimir(miMapa.values());
    }

    ///////////////////ESTE METODO VA A YUDARNOS CON LAS IMPRESIONES///////////
    //DE LAS LISTAS
    ////////////////////////////Se define una variable tipo collection
    //por que esta clase es la mas generica de las 3 y ns permite
    //recibir datos de lis y set tamnb, haciendo usoo del concepto de
    //polimorfismo
    public static void imprimir(Collection coleccion) {

        for (Object elemento : coleccion) {

            System.out.println("elemento = " + elemento);

        }

    }

}
