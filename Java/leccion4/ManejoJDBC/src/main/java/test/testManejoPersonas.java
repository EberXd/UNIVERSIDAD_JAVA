
package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eber
 */
public class testManejoPersonas {

    public static void main(String[] args) {

        //objeto de nuestra clase conexion
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();

            //con este cambio en la clase de conexion evitamos que nuestras sentencias
            //se apliquen en automatico, ahora requerimos nosotros confirmar los cambios
            if (conexion.getAutoCommit()) {

                conexion.setAutoCommit(false);
            }

            //objeto del java bean
            PersonaDAO personaDAO = new PersonaDAO(conexion);

            //para el update
            Persona cambioPersona = new Persona();

            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Rosa Daniela");
            cambioPersona.setApellido("Castro");
            cambioPersona.setEmail("aaaaaaaaaaa");
            cambioPersona.setTelefono("464834629");

            //se realiza el update
            personaDAO.actualizar(cambioPersona);

            ///////////////////////////////////////////////////////
            ////////////PARA EL INSERT
            ///////////////////////////////////////////////////
            Persona nuevaPersona = new Persona("Eber", "Martinez", "eberemanuel88", "1783885");

            personaDAO.insertar(nuevaPersona);
            
            //aqui con este metodo se ejecutan los cambios
            conexion.commit();
                System.out.println("Se ejecuto el commit correctamente");
        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
            System.out.println("Entrarmos al rollback");
            try {
                //en caso de un error nos muestra el mensaje de arriba y se borran los 
                //cambios en  la BD
                //como en el apellido vamos a mandar 55 caracteres se ejecutara el rollback
                //ya que no recibe mas de 45 en el string
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}
