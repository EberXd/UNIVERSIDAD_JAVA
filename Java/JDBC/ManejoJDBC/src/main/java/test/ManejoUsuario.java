package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class ManejoUsuario {

    public static void main(String[] args) {

        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();

        //Ejecutando el listado de usuarios
        List<Usuario> usuarios = usuarioJDBC.seleccionar();
        for (Usuario usuario : usuarios) {

            System.out.println("Usuarios" + usuario);

        }

        ////////////////////////////////////////////
        ///////////////La ejecucion de insertar/////////
        //////////////////////////////////////////////
        Usuario usuario = new Usuario("Angel", "Josafat");

        usuarioJDBC.insertar(usuario);
        
        
         ////////////////////////////////////////////
        ///////////////MODIFICAR/////////
        //////////////////////////////////////////////
        Usuario Usuario = new Usuario(4,"Daven","Emanuel");
        usuarioJDBC.actualizar(Usuario);
        
        ////////////////////////////////////////////
        ///////////////DELETE/////////
        //////////////////////////////////////////////
        
        usuarioJDBC.delete(new Usuario(5));
        

    }

}
