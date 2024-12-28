//ESTA CLASE ES UNA DAO(DATA ACCESS OBJECT)
//SE LE CONOCE ASI POR QUE AQI SE PROGRAAN LAS INSTANCIAS NECESARIAS
//PARA SU CORRESPONDIENTE CLASE DE TIPO ENTIDAD
package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;


 
public class PersonaDAO {

    //ugalde escribe cada columna pero ambas sentncias obtienen lo mismo
    //define lassentencias como variables constantes como buena practica
    
    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE idPersona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idPersona = ?";
    
      
    ///////////////////////////METODO LISTAR////////////////////////////////////
    //recuerda que list es una clase  de la api coleccions
    //bascamentee son arrays mas sofisticados
    //este metodo ns almacenara todos los objetos tipo personas y retorna
    //una list con los datos
    public List<Persona> seleccionar() {
        //variables del metodo
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

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
                persona = new Persona(idPersona, nombre, apellido, email, telefono);

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
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return personas;
    }

    /////////////////////////////////////METODO INSERTAR///////////////////////
    public int insertar(Persona persona) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //establecemos coneccion
            conn = getConnection();
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
    public int actualizar(Persona persona) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //establecemos coneccion
            conn = getConnection();
            //prepare statement con la respectiva sentencia
            stmt = conn.prepareStatement(SQL_UPDATE);
            //se ejecuta el query, pero usamos set string por que se pasan textos
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5,persona.getIdPersona());
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
    public int delete(Persona persona) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //establecemos coneccion
            conn = getConnection();
            //prepare statement con la respectiva sentencia
            stmt = conn.prepareStatement(SQL_DELETE);
            //se ejecuta el query, pero usamos setiNT por que se pasan ENTEROS
            stmt.setInt(1,persona.getIdPersona());
            
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
