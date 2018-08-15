<%-- 
    Document   : ServicioEmpleado
    Created on : 15/08/2018, 09:11:22 AM
    Author     : ALEXPOKE9
--%>

<%@page import="modelo.Consultas"%>
<%@page import="modelo.ingresodatosgetset2"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Servicio Empleado</h1>
        <header>
            <h1>Ingreso de datos de Servicio Empleado</h1>
        </header>
        <div>
        <form action="ServletIngresar">
                <input type="number" name="" placeholder="ingrese el documento del empleado"><br><br>
                <input type="text" name="" placeholder="ingrese el codigo del servicio"><br><br>
                <input type="text" name="" placeholder="ingrese la hora y fecha del servicio"><br><br>
                <input type="submit" value="Guardar">
            </form>
        </div><br><br>
        <div>
        <div class="tabla"><table border="1">
                <tr>
                    <th>Documento Empleado</th>
                    <th>Codigo Servicio</th>
                    <th>Fecha Y Hora</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
                <%
                ArrayList<ingresodatosgetset2> lisdat=new ArrayList<>();
                Consultas con=new Consultas();
                lisdat=con.consultaServicioEmpleado();
                ingresodatosgetset2 igs=new ingresodatosgetset2();
                for(int i=0; i<lisdat.size(); i++){
                    igs=lisdat.get(i);
                %>
                <form action="ServletModificar">
                    <tr>
                    <th><input type="number" name="" value="<%=igs.getEmSerEmId()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getEmSerSerCod()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getEmSerFH()%>"></th>
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
