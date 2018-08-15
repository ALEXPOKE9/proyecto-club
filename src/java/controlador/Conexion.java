
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection cnn;
    public Connection conexionbd(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn=DriverManager.getConnection("jdbc:mysql://localhost/club1","root","alexander9");
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION " +e);
        }
        return (cnn);
    }
    public static void main(String[] args){
        Conexion cx=new Conexion();
        cx.conexionbd();
        
    }
}
