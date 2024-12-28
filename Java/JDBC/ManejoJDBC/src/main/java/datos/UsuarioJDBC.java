//ESTA CLASE ES UNA DAO(DATA ACCESS OBJECT)
//SE LE CONOCE ASI POR QUE AQI SE PROGRAAN LAS INSTANCIAS NECESARIAS
//PARA SU CORRESPONDIENTE CLASE DE TIPO ENTIDAD
package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioJDBC {

    //ugalde escribe cada columna pero ambas sentncias obtienen lo mismo
    //define lassentencias como variables constantes como buena practica
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET username = ?, password = ? WHERE idnew_table = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE idnew_table = ?";

    ///////////////////////////METODO LISTAR////////////////////////////////////
    //recuerda que list es una clase  de la api coleccions
    //bascamentee son arrays mas sofisticados
    //este metodo ns almacenara todos los objetos tipo usuarios y retorna
    //una list con los datos
    public List<Usuario> seleccionar() {
        //variables del metodo
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            //en la variable conn almacenamos nuestra conexion a la BD
            conn = getConnection();
            //stm es una cariable detipo preparedstatement la definimos sarriba
            //con con mandamos llamar nuestra conexion y el preparedstatment
            //despues le mandamos la sentencia
            stmt = conn.prepareStatement(SQL_SELECT);
            //se ejecuta la sentenia
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idnew_table = rs.getInt("idnew_table");
                String username = rs.getString("username");
                String password = rs.getString("password");
               

                //hibernate regresa objetos de java completos similar a este codigo
                //para que entendamos de que va masomenos hibarnate
                //como nota usuariol es imortante recordar que hibarnate es un
                //framework de desarrollo, estos frameworks soncreados para facilitar
                //el dearrollo
                usuario = new Usuario(idnew_table, username, password);

                //se agrega el objeto de tipo usuario que se creo
                //a la lista
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);

        } finally {
            //aqui dentro de finally vamos a cerrar las conexiones
            //recuerda que este bloque se ejecuta siempre alfinal de un metodo try catch
            //los metodos losdefinimos en la clase Conexion

            try {
                //cerramos las conecciones de manera inversa a como se abrieron

                close(rs);

                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return usuarios;
    }

    /////////////////////////////////////METODO INSERTAR///////////////////////
    public int insertar(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //establecemos coneccion
            conn = getConnection();
            //prepare statement con la respectiva sentencia
            stmt = conn.prepareStatement(SQL_INSERT);
            //se ejecuta el query, pero usamos set string por que se pasan textos
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            //executeUpdate de la clase PreparedStatement, este metodo es diferente
            //al anterior de select, por  que en este caso la base de datos se modifica
            //este metodo sin pedos te ejecuta delete, updatee insert
            //para select el de arriba esta chido nomas
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);

            }

        }
        //se retorna la vaariable con el int
        return registros;
    }

    /////////////////////////////////////METODO UPDATE///////////////////////
    public int actualizar(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //establecemos coneccion
            conn = getConnection();
            //prepare statement con la respectiva sentencia
            stmt = conn.prepareStatement(SQL_UPDATE);
            //se ejecuta el query, pero usamos set string por que se pasan textos
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdnew_table());
            //en estecaso par ejecutar la sentncia amndamos llamar el metodo
            //executeUpdate de la clase PreparedStatement, este metodo es diferente
            //al anterior de select, por  que en este caso la base de datos se modifica
            //este metodo sin pedos te ejecuta delete, updatee insert
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);

            }

        }
        //se retorna la vaariable con el int
        return registros;
    }

    /////////////////////////////////////METODO DELETE///////////////////////
    public int delete(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //establecemos coneccion
            conn = getConnection();
            //prepare statement con la respectiva sentencia
            stmt = conn.prepareStatement(SQL_DELETE);
            //se ejecuta el query, pero usamos setiNT por que se pasan ENTEROS
            stmt.setInt(1, usuario.getIdnew_table());

            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);

            }

        }
        //se retorna la vaariable con el int
        return registros;
    }

}
