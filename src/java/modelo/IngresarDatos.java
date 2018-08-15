
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class IngresarDatos {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    
    public void ingresarRoles(ingresodatosgetset inggs){
        try {
            ps=cnn.prepareStatement("insert into Roles values (?,?)");
            ps.setString(1,inggs.getRolCodigo());
            ps.setString(2,inggs.getRolNombre());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Registrados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR DE ROLES" +e);
        }
}
}
