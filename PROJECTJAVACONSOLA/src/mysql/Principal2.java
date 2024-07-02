package mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class Principal2 {

    public static void main(String[] args) {
       ConexionMysql cm = new ConexionMysql("CAMPUSFP1");
       Connection conexion = cm.getConexion();
       String sql = "SHOW TABLES";
       if(conexion != null) {
           System.out.println("OK: CONEXION");
           try {
              PreparedStatement ps = conexion.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
              while(rs.next()) {
                 String tabla = rs.getString(1);
                 System.out.println(tabla);
              }
           
           }catch(SQLException e) {
              System.out.println("ERROR: SQL " + e.getMessage());
           }
           
       }else {
           System.out.println("ERROR: CONEXION");
       }
       
       
    }
    
}
