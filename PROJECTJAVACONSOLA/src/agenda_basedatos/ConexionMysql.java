package agenda_basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {

    //VARIABLE DE INSTANCIA (ATRIBUTO)
    String nombreBaseDatos; //ENTRADA
    Connection conexion; //SALIDA

    //DATOS DE LA CONEXION
    String protocolo = "jdbc:mysql";
    String nombreServidor = "localhost";//127.0.0.1
    String puerto = "3306";

    String usuario = "root";
    String clave = "12345678";

    //CONSTRUCTORES
    public ConexionMysql(String nombreBaseDatos) {
        this.nombreBaseDatos = nombreBaseDatos;
        setConexion();
    }

    //METODOS SET Y GET
    public Connection getConexion() {
        return conexion;
    }

    public void setConexion() {
        String url = protocolo + "://" + nombreServidor + ":"
                + puerto + "/" + nombreBaseDatos;

        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            conexion = null;
        }
    }
}


