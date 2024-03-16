//nunca nombres una clase Connection para evitar errorss
//siempre Conect or Conexion
package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

//Esta clase ya la hcimosmas generica para poder reutilizar el codigo
//mediante los metodos//
//asi que esta seria una clase de conexion aplicandoo buenas practicas
/**
 *
 * @author eber
 */
public class Conexion {

    //constantes para el metodo de conexion
    private static final String JDBCUrl = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    private static final String JDBCUser = "root";
    private static final String JDBCPasword = "admin";
    
    

    ////////////////////////////////////////////////////////////////////
    /////////// METODO PARA EL POOL DE CONEXIONES /////////////////////
    /////////////////////////////////////////////////////////////////
    
    //Para configurar el pool tambien en el POOM se agrego la dependencia 
    //para mayor detalle revisa el video 2 de la leccion 48
    public static DataSource getDataSource(){
        
        
        
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBCUrl);
        ds.setUsername(JDBCUser);
        ds.setPassword(JDBCPasword);
        
        ////SE DEFINE EL TAMAÑO INICIAL DEL POOL DE CONEXIONES
        // se debe tener cuidado de cuantas conexiones usar, ya que un numero grande
        //consume muchos recursos}
        //ASI QUE SE RECOMIENDA COMENZAR CON UN NUMERO PEQUEÑO DE CONEXIONES
        //Y CONTINUAR AUMENTANDO POCO A POCO 
        ds.setInitialSize(5);
        
        return ds;
        
           
    }
    
    
    
    
    
    
    //metodo de conexion aplicando el pool de conexiones
    //con esta configuracion ya queda 
    public static Connection getConnection() throws SQLException {

    return getDataSource().getConnection();

    }
    /////////////////////////////////////////////////////////////////////////
    ///Esta clase solo sirve para realizar la conexion con SQL pero tmbien
    //para cerrar las conexiones, el siguinte metodo se haracargo de eso

    //recuerda que el throws es la propagacion de los errores en Java
    public static void close(ResultSet rs) throws SQLException {

        rs.close();

    }

    //recuerda que statemant es para ejecutar las sentencias
    //pero es mejor el PrepareStatement entoces haremos ambos metodos
    public static void close(Statement st) throws SQLException {

        st.close();

    }

    //metodo para cerrar los preparestatement
    public static void close(PreparedStatement pst) throws SQLException {

        pst.close();

    }

    ////////////////////////////////////////
    //ESTE METODO SERA PARA CERRAR NESTRA CONEXION
    public static void close(Connection conn) throws SQLException {

        conn.close();

    }

}
