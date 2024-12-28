
/**
 *
 * @author eber
 */
public class OperadoresDeAsignacion {

    public static void main(String[] args) {

        int a = 3, b = 2;
        //this is a asignation operation
        int c = a + 5 - b;
        System.out.println("c= " + c);
        System.out.println("a= " + a);
        //la siguiente expresion es igual a
        //a=a+1;
        //se incrementa en 1 a
        a += 1;
        System.out.println("a + 1 = " + a);
        a += 10;
        System.out.println("a + 10 = " + a);

        a -= 5;// = a=a - 5
        System.out.println("a - 5 = " + a);

        a *= 5;
        System.out.println("a * 5 = " + a);

        a /= 5;
        System.out.println("a / 5 = " + a);

        a %= 3;
        System.out.println("a residuo entre 3 = " + a);
    }

}
