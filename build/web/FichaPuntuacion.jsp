<%-- 
    Document   : FichaPuntuacion
    Created on : 14/08/2018, 03:34:13 PM
    Author     : ALEXPOKE9
--%>

<%@page import="modelo.ingresodatosgetset"%>
<%@page import="modelo.Consultas"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Ficha De Puntuacion</h1>
        <header>
            <h1>Ingreso de datos de Ficha De Puntuacion</h1>
        </header>
        <div>
        <form action="ServletIngresar">
                <input type="number" name="" placeholder="ingrese el codigo de la ficha"><br><br>
                <input type="text" name="" placeholder="ingrese el nombre del torneo"><br><br>
                <input type="text" name="" placeholder="ingrese el nombre del jugador"><br><br>
                <input type="text" name="" placeholder="ingrese el anotador"><br><br>
                <input type="date" name="" placeholder="ingrese la fecha"><br><br>
                <input type="submit" value="Guardar">
            </form>
        </div><br><br>
        <div>
        <div class="tabla"><table border="1">
                <tr>
                    <th>Codigo</th>
                    <th>Torneo</th>
                    <th>jugador</th>
                    <th>Anotador</th>
                    <th>Fecha</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
                <%
                ArrayList<ingresodatosgetset> lisdat=new ArrayList<>();
                Consultas con=new Consultas();
                lisdat=con.consultaFichaPuntuacion();
                ingresodatosgetset igs=new ingresodatosgetset();
                for(int i=0; i<lisdat.size(); i++){
                    igs=lisdat.get(i);
                %>
                <form action="ServletModificar">
                    <tr>
                    <th><input type="number" name="" value="<%=igs.getFpCodigo()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getFpTorneo()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getFpJugador()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getFpAnotadotor()%>"></th>
                    <th><input type="text" name="" value="<%=igs.getFpFecha()%>"></th>
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
