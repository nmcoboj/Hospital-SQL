package hospital.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static final String URL = "jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=CONVERT_TO_NULL&test&useSSL=false";
    public static final String USUARIO = "root";
    public static final String CLAVE = "SASA";

    public Conexion() {
        
    }
     
    public Connection getConnection() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, USUARIO, CLAVE);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error No se puede abrir la base de datos " + ex.getMessage());
        }

        return conexion;
    }

}
