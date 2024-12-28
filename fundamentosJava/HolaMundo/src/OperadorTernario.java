
/**
 *
 * @author eber
 */
public class OperadorTernario {
    
    public static void main(String[] args) {
        
        //el operador ternario me resulta como un if
        //muyelegante porcierto
        //lo pondremos muucho en practica
        //los dos : son los resultados del if y el else
        //y loque esta antes del signo es la condicional
        //su uso se recomienda solo para expreciones sencillas
        var resultado= (3>2) ? "Verdadero":"falso";
        
        System.out.println("resultado = " + resultado);
        
        //comprobamos si es par o impar usando el operador ternario
        var numero=9;
        var rsultado =(numero % 2 ==0) ? "Es numero par" : "es numero impar";
        System.out.println(resultado);
        
    }
    
    
}
