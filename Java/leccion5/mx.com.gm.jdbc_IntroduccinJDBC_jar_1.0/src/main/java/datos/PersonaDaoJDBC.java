//ESTA CLASE ES UNA DAO(DATA ACCESS OBJECT)
//SE LE CONOCE ASI POR QUE AQI SE PROGRAAN LAS INSTANCIAS NECESARIAS
//PARA SU CORRESPONDIENTE CLASE DE TIPO ENTIDAD
package datos;

import static datos.Conexion.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

/**
 *
 * @author eber
 */
public class PersonaDaoJDBC implements IPersonaDAO {
////////////////////////////////////////////////////////////////////////////
    /////////////////Agregamos esta variable para comenzar a utilizar transacciones
    //las transacciones en si deben permitir evitar cerrar la conexion, de esta forma 
    //podemos desahacer cambios que allamos realizado en la BD

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE idPersona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idPersona = ?";

    /////////CONSTRUCTOR VACIO
    public PersonaDaoJDBC() {

    }

    /////////CONSTRUCTOR QUE RECIBE LA VARIABLE PARA CERRAR O DEJAR ABIERTA
    // LA CONEXION, CON UN IF SI RECIBE LA SIGUIENTE VARIABLE PODEMOS DEJAR
    //LA CONEXION ABIERTA Y SI NO PUES SE CIERRA
    public PersonaDaoJDBC(Connection conexionTransaccional) {

        this.conexionTransaccional = conexionTransaccional;

    }

///////////////////////////METODO LISTAR////////////////////////////////////
    //recuerda que list es una clase  de la api coleccions
    //bascamentee son arrays mas sofisticados
    //este metodo ns almacenara todos los objetos tipo personas y retorna
    //una list con los datos
    @Override
    public List<PersonaDTO> seleccionar() {
        //variables del metodo
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonaDTO persona = null;
        List<PersonaDTO> personas = new ArrayList<>();

        try {

            //en este operador ternario si la variable viene vacia se obtiene una nueva conexion
            //si trae ya una conexion pues no se obtiene ninguna nueva
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            //stm es una cariable detipo preparedstatement la definimos sarriba
            //con con mandamos llamar nuestra conexion y el preparedstatment
            //despues le mandamos la sentencia
            stmt = conn.prepareStatement(SQL_SELECT);
            //se ejecuta la sentenia
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idPersona = rs.getInt("idpersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                //hibernate regresa objetos de java completos similar a este codigo
                //para que entendamos de que va masomenos hibarnate
                //como nota personal es imortante recordar que hibarnate es un
                //framework de desarrollo, estos frameworks soncreados para facilitar
                //el dearrollo
                persona = new PersonaDTO(idPersona, nombre, apellido, email, telefono);

                //se agrega el objeto de tipo persona que se creo
                //a la lista
                personas.add(persona);
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

                //esto es parte de usar las transacciones
                //si nuestra conexion era nulña en el constructor significa que 
                //se abrio una nueva aqui y necesitamos cerrarla
                if (this.conexionTransaccional == null) {
                    close(conn);

                }

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return personas;
    }

    /////////////////////////////////////METODO INSERTAR///////////////////////
    public int insertar(PersonaDTO persona) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //en este operador ternario si la variable viene vacia se obtiene una nueva conexion
            //si trae ya una conexion pues no se obtiene ninguna nueva
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();

            //prepare statement con la respectiva sentencia
            stmt = conn.prepareStatement(SQL_INSERT);
            //se ejecuta el query, pero usamos set string por que se pasan textos
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            //en estecaso par ejecutar la sentncia amndamos llamar el metodo
            //executeUpdate de la clase PreparedStatement, este metodo es diferente
            //al anterior de select, por  que en este caso la base de datos se modifica
            //este metodo sin pedos te ejecuta delete, updatee insert
            //para select el de arriba esta chido nomas
            registros = stmt.executeUpdate();

        } finally {
            try {
                close(stmt);
                //esto es parte de usar las transacciones
                //si nuestra conexion era nulña en el constructor significa que 
                //se abrio una nueva aqui y necesitamos cerrarla
                if (this.conexionTransaccional == null) {
                    close(conn);

                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);

            }

        }
        //se retorna la vaariable con el int
        return registros;
    }

    /////////////////////////////////////METODO UPDATE///////////////////////
    public int actualizar(PersonaDTO persona) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //en este operador ternario si la variable viene vacia se obtiene una nueva conexion
            //si trae ya una conexion pues no se obtiene ninguna nueva
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();

            //prepare statement con la respectiva sentencia
            stmt = conn.prepareStatement(SQL_UPDATE);
            //se ejecuta el query, pero usamos set string por que se pasan textos
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            //en estecaso par ejecutar la sentncia amndamos llamar el metodo
            //executeUpdate de la clase PreparedStatement, este metodo es diferente
            //al anterior de select, por  que en este caso la base de datos se modifica
            //este metodo sin pedos te ejecuta delete, updatee insert
            registros = stmt.executeUpdate();

        } finally {

            try {
                close(stmt);
                //esto es parte de usar las transacciones
                //si nuestra conexion era nulña en el constructor significa que 
                //se abrio una nueva aqui y necesitamos cerrarla
                if (this.conexionTransaccional == null) {
                    close(conn);

                }

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);

            }

        }
        //se retorna la vaariable con el int
        return registros;
    }

    /////////////////////////////////////METODO DELETE///////////////////////
    public int delete(PersonaDTO persona) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //en este operador ternario si la variable viene vacia se obtiene una nueva conexion
            //si trae ya una conexion pues no se obtiene ninguna nueva
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();

            //prepare statement con la respectiva sentencia
            stmt = conn.prepareStatement(SQL_DELETE);
            //se ejecuta el query, pero usamos setiNT por que se pasan ENTEROS
            stmt.setInt(1, persona.getIdPersona());

            registros = stmt.executeUpdate();
            ////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////
            //////////////////////////BORRAMOS LOS CATCH DE TODA LA CLASE PARA
            //PODER PROCESAR LAS EXCEPCIONES EN LA SIGUIENTE CLASE Y PODER USAR 
            //ROLLBACK   "PROPAGAMOS LA EXCEPCION" "throws SQLException"
        } finally {
            try {
                close(stmt);
                //esto es parte de usar las transacciones
                //si nuestra conexion era nulña en el constructor significa que 
                //se abrio una nueva aqui y necesitamos cerrarla
                if (this.conexionTransaccional == null) {
                    close(conn);

                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);

            }

        }
        //se retorna la vaariable con el int
        return registros;
    }

}
