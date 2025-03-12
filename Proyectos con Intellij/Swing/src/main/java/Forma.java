import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JTextField campoTexto;


    public Forma(){
        inicializarForma();

    }

    private void inicializarForma(){
        //aqui inicializamos el JFrame
        setContentPane(panelPrincipal);
        //Cuando terminas de utilizar el jframe con este metodo se cierra
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //se define el tamaño de la ventana
        //el primer numero es el ancho el segundo el largo
        setSize(600,400);
        //metodo para centrar la ventana
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();//con este metodo se pone en modo dark la pantalla
        //para utilizar esta libreria se definio en el pom en las dependencias
        Forma forma = new Forma();
        forma.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
