<%-- 
    Document   : Cliente
    Created on : 13/08/2018, 04:54:04 PM
    Author     : ALEXPOKE9
--%>

<%@page import="modelo.Consultas"%>
<%@page import="modelo.ingresodatosgetset"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Cliente</h1>
        <header>
            <h1>Ingreso de datos de Clentes</h1>
        </header>
        <div>
        <form action="ServletIngresar">
                <input type="number" name="" placeholder="ingrese el documento del cliente">
                <input type="text" name="" placeholder="ingrese el nombre del cliente">
                <input type="text" name="" placeholder="ingrese el tipo del cliente">
                <input type="number" name="" placeholder="ingrese el telefono del cliente">
                <input type="date" name="" placeholder="elija la fecha de vinculacion del cliente">
                <input type="button" name="" placeholder="elija la foto del cliente">
                <input type="submit" value="Guardar">
            </form>
        </div>
        <div>
        <div class="tabla"><table border="1">
                <tr>
                    <th>Documento</th>
                    <th>Nombre</th>
                    <th>Tipo</th>
                    <th>Telefono</th>
                    <th>Fecha de Vinculacion</th>
                    <th>Foto</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
                <%
                ArrayList<ingresodatosgetset> lisdat=new ArrayList<>();
                Consultas con=new Consultas();
                lisdat=con.consultaClientes();
                ingresodatosgetset igs=new ingresodatosgetset();
                for(int i=0; i<lisdat.size(); i++){
                    igs=lisdat.get(i);
                %>
                <form action="ServletModificar">
                    <tr>
                    <th><input type="number" name="" value="<%=igs.getCliId()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getCliNombre()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getCliTipo()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getCliTelefono()%>"></th>
                    <th><input type="date" name="" value="<%=igs.getCliFechVinculacion()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getCliFoto()%>"></th>
                    <th><input type="submit" name="" value="Modificar"></th>
                    </tr>
                </form>
                <%
                }
                %>
            </table>
        </div>
            </div>
    </body>
</html>
