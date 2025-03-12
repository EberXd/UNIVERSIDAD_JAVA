import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;


    public Forma(){
        inicializarForma();
        //este metodo se agrega desde el jframe solom es necesario agregar el actionlistender
        //solo das clic derecho y lo agregas en la caja de texto, entonces cada que se modifica
        //esta caja de texto se ejecuta la accion definida
//        campoTexto.addActionListener(e -> {
//            System.out.println("Se ejecuto action listener");
//            replicarTexto();
//        });
//


        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
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

    private void replicarTexto(){
        this.replicadorLabel.setText(this.campoTexto.getText());

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
