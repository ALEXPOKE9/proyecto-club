
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Actualizar {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public int ModificarRol(ingresodatosgetset inggs){
        String r;
        int dat=0;
        try {
            ps=cnn.prepareStatement("update Roles set RolNombre='"+inggs.getRolNombre()+"' where RolCodigo='"+inggs.getRolCodigo()+"'");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Modificados");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERROR DE MODIFICAR ROL"+e);
        
    }
        return dat;
}
    
    public int ModificarCliente(ingresodatosgetset inggs){
        String r;
        int dat=0;
        try {
            ps=cnn.prepareStatement("update Cliente set CliNombre='"+inggs.getCliNombre()+"',CliTipo='"+inggs.getCliTipo()+"',CliTelefono='"+inggs.getCliTelefono()+"',CliFechVinculacion='"+inggs.getCliFechVinculacion()+"',CliFoto='"+inggs.getCliFoto()+"' where CliId='"+inggs.getCliId()+"'");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Modificados");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERROR DE MODIFICAR CLIENTE"+e);
        
    }
        return dat;
}
    
    public int ModificarFichaPuntuacion(ingresodatosgetset inggs){
        String r;
        int dat=0;
        try {
            ps=cnn.prepareStatement("update FichaPuntuacion set FpTorneo='"+inggs.getFpTorneo()+"',FpJugador='"+inggs.getFpJugador()+"',FpAnotador='"+inggs.getFpAnotadotor()+"',FpFecha='"+inggs.getFpFecha()+"' where FpCodigo='"+inggs.getFpCodigo()+"'");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Modificados");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERROR DE MODIFICAR FICHA PUNTUACION"+e);
        
    }
        return dat;
}
    
     public int ModificarPQRS(ingresodatosgetset inggs){
        String r;
        int dat=0;
        try {
            ps=cnn.prepareStatement("update PQRS set PqFechaHor='"+inggs.getPqFechaHor()+"',PqContenido='"+inggs.getPqContenido()+"',PqEstado='"+inggs.getPqEstado()+"',PqRespuesta='"+inggs.getPqRespuesta()+"' where PqCodRadicacion='"+inggs.getPqCodRadicacion()+"' and PqCliId='"+inggs.getPqCliId()+"' and PqTipo='"+inggs.getPqTipo()+"'");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Modificados");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERROR DE MODIFICAR PQRS"+e);
        
    }
        return dat;
}
      public int ModificarServicioEmpleado(ingresodatosgetset2 inggs){
        String r;
        int dat=0;
        try {
            ps=cnn.prepareStatement("update Servicio_Empleado set EmSerFH='"+inggs.getEmSerFH()+"' where EmSerEmId='"+inggs.getEmSerEmId()+"' and EmSerSerCod='"+inggs.getEmSerSerCod()+"'");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Modificados");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERROR DE MODIFICAR SERVICIO EMPLEADO"+e);
        
    }
        return dat;
}
      
       public int ModificarClienteFicha(ingresodatosgetset inggs){
        String r;
        int dat=0;
        try {
            ps=cnn.prepareStatement("update Cliente_Ficha set ClFpPar1='"+inggs.getClFpPar1()+"',ClFpPar2='"+inggs.getClFpPar2()+"',ClFpPar3='"+inggs.getClFpPar3()+"',ClFpPar4='"+inggs.getClFpPar4()+"',ClFpPar5='"+inggs.getClFpPar5()+"',ClFpPar6='"+inggs.getClFpPar6()+"',ClFpPar7='"+inggs.getClFpPar7()+"',ClFpPar8='"+inggs.getClFpPar8()+"',ClFpPar9='"+inggs.getClFpPar9()+"',ClFpSumaRonda1='"+inggs.getClFpSumaRonda1()+"',ClFpPar10='"+inggs.getClFpPar10()+"',ClFpPar11='"+inggs.getClFpPar11()+"',ClFpPar12='"+inggs.getClFpPar12()+"',ClFpPar13='"+inggs.getClFpPar13()+"',ClFpPar14='"+inggs.getClFpPar14()+"',ClFpPar15='"+inggs.getClFpPar15()+"',ClFpPar16='"+inggs.getClFpPar16()+"',ClFpPar17='"+inggs.getClFpPar17()+"',ClFpPar18='"+inggs.getClFpPar18()+"',ClFpSumaRonda2='"+inggs.getClFpSumaRonda2()+"',ClFpTotal='"+inggs.getClFpTotal()+"' where ClFpFpCodigo='"+inggs.getClFpFpCodigo()+"' and ClFpCliId='"+inggs.getClFpCliId()+"'");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Modificados");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERROR DE MODIFICAR CLIENTE FICHA PUNTUACION"+e);
        
    }
        return dat;
}
      
       public int ModificarTipoPQRS(ingresodatosgetset inggs){
        String r;
        int dat=0;
        try {
            ps=cnn.prepareStatement("update TipoPQRS set TipNombre='"+inggs.getTipNombre()+"',TipDescripcion='"+inggs.getTipDescripcion()+"' where TipCodigo='"+inggs.getTipCodigo()+"'");
            dat=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Modificados");
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERROR DE MODIFICAR CLIENTE FICHA PUNTUACION"+e);
        
    }
        return dat;
}
}
