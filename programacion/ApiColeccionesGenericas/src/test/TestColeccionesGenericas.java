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

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        
        
        //al final se cierra el objeto con la notacion de diamante
        //daimond notacion <>
        //con esto se especifica que recibe la lista y evitamos errores
        List<String> miLista = new ArrayList<>();
   
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //marca error por que ya definimos la lista tipo String
        //miLista.add(10.5);
       
        //asi podemos acceder a una lista para obtener un valor especifico
        //muy similar al array
        //cave mencionar que esto es posible por que convertimos a tipo string
        //osea a un tipo especifico de lo contrario marcaria error el metodo get
        String elemento = miLista.get(0);
        System.out.println("elemento = " + elemento);
        

        //haciendo uso del metodo
        imprimir(miLista);

///////////////////VAMOS A TRABAJAR CON LA INTERFACE SET///////////////////////////
        ///ESTA INTERFACE es identica a la de arriba, la diferencia es que no se recuperan
        //los datos en el orden qe se agregan, taths all
        Set <Integer>miSet = new HashSet<>();

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
        //en este caso el set mantiee el orden pero no siempre es asi, es aleatorio
        //es recomendable usarlo cuando no se ocupa mantener el orden, por que eso
        //lo hace mas rapido
        
        imprimirSet(miSet);

/////////////////////////VAMOS A TRABAJAR CON LA CLASE MAP///////////////////////////
        //Para definir el generic map, la clase map se requiere escribir de la
        //siguiente forma, primero map despues < despues tipo de dato, tipo de dato
        //> nombre variable = new HashMap<>();


        Map<String, String> miMapa = new HashMap<>();
        //esta clase no hereda de Collection, herda de Map,
        //por lo tanto esta no usa add para agregar un bjeto ocupa put()
        //tambien admite cualquier tipo de valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Ugalde");
        
        //como se lograapreciar requerimos de la key para acceder al valor deseado
        //////////////////Aqui volvemos lavariabe tipo object a String para poder 
        //almacenar la cadena
        String recuperar= (String) miMapa.get("valor1");
        
        System.out.println("recuperar = " + recuperar);
        //miMapa.keySet(), nos trae todas las llaves y las podemos recorrer
        //con el foreach, los map no garantizan el orden como el anterior
        imprimir(miMapa.keySet());
        //para recuperar todos los valores se requiere del metodo values();
        imprimir(miMapa.values());
    }

    ///////////////////ESTE METODO VA A YUDARNOS CON LAS IMPRESIONES///////////
    //DE LAS LISTAS
   
    
    
    ///////////////////////////////////////////////////////////////////////
    //tambien el metodo como la lista podemos definirlo como solo string
    //para validar tipos de datosdesdecompilacion
    //Se antepone antes del nombre de la variable y despues del tipo 
    public static void imprimir(Collection<String> coleccion) {

            //aqui en el ciclo for podemos cambiar el tipo
            //en vez de que sea object puede ser otro tipo
            //String, integer, double ETC
        for (String elemento : coleccion) {

            System.out.println("elemento = " + elemento);

        }

    }

    ///////////////////////////////////////////////////////////////////////
    //Hice este metodo para imprimir las listas tipo int
    public static void imprimirSet(Collection<Integer> coleccion) {
        //aqui podemos observar como es tipo object nuestra variable del for
        for (Object elemento : coleccion) {

            System.out.println("elemento = " + elemento);

        }

    }
}
