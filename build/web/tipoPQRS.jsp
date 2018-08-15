<%-- 
    Document   : tipoPQRS
    Created on : 14/08/2018, 02:57:15 PM
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
       <h1>Tipo PQRS</h1>
        <header>
            <h1>Ingreso de datos del Tipo De PQRS</h1>
        </header>
        <div>
        <form action="ServletIngresar">
                <input type="number" name="" placeholder="ingrese el codigo"><br><br>
                <input type="text" name="" placeholder="ingrese el nombre"><br><br>
                <textarea name="" placeholder="ingrese la descripcion"></textarea><br><br>
                <input type="submit" value="Guardar">
            </form>
        </div><br><br>
        <div>
        <div class="tabla"><table border="1">
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Descripcion</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
                <%
                ArrayList<ingresodatosgetset> lisdat=new ArrayList<>();
                Consultas con=new Consultas();
                lisdat=con.consultaTipoPQRS();
                ingresodatosgetset igs=new ingresodatosgetset();
                for(int i=0; i<lisdat.size(); i++){
                    igs=lisdat.get(i);
                %>
                <form action="ServletModificar">
                    <tr>
                    <th><input type="number" name="" value="<%=igs.getTipCodigo()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getTipNombre()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getTipDescripcion()%>"></th>
                    <th><input type="submit" name="" value="Modificar"></th>
                    </tr>
                
                <%
                }
                %>
                </form>
            </table>
        </div>
            </div>
    </body>
</html>
