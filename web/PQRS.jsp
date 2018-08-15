<%-- 
    Document   : PQRS
    Created on : 15/08/2018, 08:45:45 AM
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
       <h1>PQRS</h1>
        <header>
            <h1>Ingreso de datos de PQRS</h1>
        </header>
        <div>
        <form action="ServletIngresar">
                <input type="text" name="" placeholder="ingrese el codigo de radicacion"><br><br>
                <input type="number" name="" placeholder="ingrese el documento del cliente"><br><br>
                <input type="number" name="" placeholder="ingrese el tipo de PQRS"><br><br>
                <input type="text" name="" placeholder="ingrese la fecha y hora de radicacion"><br><br>
                <textarea type="text" name="" placeholder="ingrese el contenido"></textarea><br><br>
                <input type="text" name="" placeholder="ingrese el estado"><br><br>
                <textarea type="text" name="" placeholder="ingrese la respuesta"></textarea><br><br>
                <input type="submit" value="Guardar">
            </form>
        </div><br><br>
        <div>
        <div class="tabla"><table border="1">
                <tr>
                    <th>Codigo De Radicacion</th>
                    <th>Documento Del Cliente</th>
                    <th>Tipo PQRS</th>
                    <th>Fecha Y Hora</th>
                    <th>Contenido</th>
                    <th>Estado</th>
                    <th>Respuesta</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
                <%
                ArrayList<ingresodatosgetset> lisdat=new ArrayList<>();
                Consultas con=new Consultas();
                lisdat=con.consultaPQRS();
                ingresodatosgetset igs=new ingresodatosgetset();
                for(int i=0; i<lisdat.size(); i++){
                    igs=lisdat.get(i);
                %>
                <form action="ServletModificar">
                    <tr>
                    <th><input type="text" name="" value="<%=igs.getPqCodRadicacion()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getPqCliId()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getPqTipo()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getPqFechaHor()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getPqContenido()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getPqEstado()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getPqRespuesta()%>"></th>
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
