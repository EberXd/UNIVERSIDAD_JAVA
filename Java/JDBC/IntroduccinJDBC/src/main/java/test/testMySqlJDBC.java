package test;

import java.sql.*;

public class testMySqlJDBC {

    public static void main(String[] args) {

        //con esta cadena se indica la direccion donde se localiza la base de datos
        //para MySQL esta es la estructura para conectar
        //en la sguiente linea cuando pasamos del signo de interrogacion
        //lo qe se agregan son diversos aramatros que solicita mySql en las ultimas
        //versiones
        //useSSL= indicams que no se usara seguridad ssl para la conexion a la base de datos
        //timeZone= si usaremos horario local
        //serverTimezone= le decimos que es UTC el timezon del server
        //allowPublicKeyRetrieval= estono lo explia bien ugalde
        //invesstigando por mi cuenta en las ultimas versiones da error
        //se debe permitir la llave publica
        //esto con el fin de e el cliente pueda acceder a la llavedel servidor 
        //de forma automatica
        //evitando algunos errores de las nuevas versiones
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        ///////////////////////////////////////////////////////////////////////////////////////////
        //el siguiente bloque de codigo ya no se requiere en las nuevas versiones de java
        //pero en versiones anteriores si, asi qe ugalde te la muestra por si se requiere
        //y para entender que esto es parte de una conexion
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");  <--- linea que podemos requerir
            //para aplicaicones WEB

            //las siguients clases son del java sql
            //el metodo getConnecion nos solicita la url de arriba
            //y el usuario y password de la db
            Connection conexion = DriverManager.getConnection(url, "root", "admin");

            //El objeto Stetemenet nos permite ejecutar sentencias en una db
            //Statement es una interface
            //y con nuestra variable conexion se implementa
            ////////////////////////este codigo puede servir para otras bases de datos
            ///////////////////////lapartede a implementacion
            ///////////////////////aplicando los conceptos de interface y hacercodigo generico
            Statement instruccion = conexion.createStatement();

            /////////////////////////////////////////////////////////////////
            //vamos a comenzar a usar allgunas sentencias de SQL como ya las conocemos
            //una buena practica es respetar las palabras clave en mayusculas
            //aunque sql las ejecuta sin importar eso
            //es buea practica para poder leer mas facil el code
            var sql = "SELECT idpersona, nombre, apellido, email,telefono FROM persona";
            ///////////////////////////////////////////////////////////////////////////
            //resultset es otra interface
            //y se implementa con el SqL
            //aqui ya se ejecuta la sentencia y se guarda en resultado

            ResultSet resultado = instruccion.executeQuery(sql);

            //para imprimir los resultados requerimos iterar la variable
            //el metodo next(),manda un true si aun hay datos para iterar
            //si no hay manda false
            //esto nos ayuda a continuar el while o romperlo
            while (resultado.next()) {
                //print solo escribe una linea a diferencia de println
                System.out.println("id persona " + resultado.getInt("idpersona"));
                System.out.println("Nombre " + resultado.getString("nombre"));
                System.out.println("Apellido " + resultado.getString("apellido"));
                System.out.println("Email " + resultado.getString("email"));
                System.out.println("Telefono " + resultado.getString("telefono"));

            }
            resultado.close();
            instruccion.close();
            conexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
