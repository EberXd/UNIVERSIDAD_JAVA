
public class ConcatenacionDeCadenas {
    public static void main (String args[]){
    
    var usuario= "yo";
    var titulo= " ingeniero";
    var concatenacion = usuario+titulo;
    
    System.out.println("union ="+concatenacion);
        
    var num1 = 13;
    var num2 = 12;
    
    System.out.println(num1+num2);
    //java al mostrar un resultado lo hace de hizuierda a derecha
    System.out.println(num1+num2+usuario);
    // en estecaso ya no hace la suma por que detecto que solo era texto
    //por la primer variable
    System.out.println(usuario+num1+num2);
    //en este caso por a separacion con parentesis si la hace
    System.out.println(usuario+(num1+num2));

    }
    
    
    
}
