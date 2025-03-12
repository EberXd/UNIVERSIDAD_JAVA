import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

 //constructor vacio, recuerda que estos constructores no regresan ningun dato
 //basicamente son especificos para inicizlizar una clase o un metodo en su defecto

 public LoginForm(){
     inicializarForma();
     enviarBoton.addActionListener(e -> validar());
 }


 private void inicializarForma(){

     setContentPane(panelPrincipal);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(600,400);
     setLocationRelativeTo(null);//centramos la ventana

 }

 //el siguiente metodo se ejecuta en la funcion lamda dentro del constructor
 private void validar(){
     //leer valores
     var usuario = this.usuarioTexto.getText();
     var password = new String(this.passwordTexto.getPassword());

    if("root".equals(usuario) && "admin".equals(password)){

    mostrarMensaje("Datos correctos, BIENVENIDO!!!");

    }else {

        mostrarMensaje("ERROR, Verifica tu usuario y contraseña");


    }

 }
    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);

    }

    public static void main(String[] args) {

     FlatDarculaLaf.setup();//cambiamos a modo dark con el anterior metodo
     LoginForm loginForm = new LoginForm();
     loginForm.setVisible(true);



    }



}
