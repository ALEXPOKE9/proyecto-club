<%-- 
    Document   : clienteficha
    Created on : 14/08/2018, 03:50:46 PM
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
       <h1>Cliente y Ficha De Puntuacion</h1>
        <header>
            <h1>Ingreso de datos de Cliente y Ficha De Puntuacion</h1>
        </header>
        <div>
        <form action="ServletIngresar">
                <input type="number" name="" placeholder="ingrese el codigo de la ficha">
                <input type="number" name="" placeholder="ingrese el documento del cliente">
                <input type="number" name="" placeholder="ingrese el par1"><br><br>
                <input type="number" name="" placeholder="ingrese el par2">
                <input type="number" name="" placeholder="ingrese el par3">
                <input type="number" name="" placeholder="ingrese el par4"><br><br>
                <input type="number" name="" placeholder="ingrese el par5">
                <input type="number" name="" placeholder="ingrese el par6">
                <input type="number" name="" placeholder="ingrese el par7"><br><br>
                <input type="number" name="" placeholder="ingrese el par8">
                <input type="number" name="" placeholder="ingrese el par9">
                <input type="number" name="" placeholder="ingrese la suma de la ronda 1"><br><br>
                <input type="number" name="" placeholder="ingrese el par10">
                <input type="number" name="" placeholder="ingrese el par11">
                <input type="number" name="" placeholder="ingrese el par12"><br><br>
                <input type="number" name="" placeholder="ingrese el par13">
                <input type="number" name="" placeholder="ingrese el par14">
                <input type="number" name="" placeholder="ingrese el par15"><br><br>
                <input type="number" name="" placeholder="ingrese el par16">
                <input type="number" name="" placeholder="ingrese el par17">
                <input type="number" name="" placeholder="ingrese el par18"><br><br>
                <input type="number" name="" placeholder="ingrese la suma de la ronda 2">
                <input type="number" name="" placeholder="ingrese la suma total"><br><br>
                <input type="submit" value="Guardar">
            </form>
        </div><br><br>
        <div>
        <div class="tabla"><table border="1">
                <tr>
                    <th>codigo de la ficha</th>
                    <th>documento del cliente</th>
                    <th>par1</th>
                    <th>par2</th>
                    <th>par3</th>
                    <th>par4</th>
                    <th>par5</th>
                    <th>par6</th>
                    <th>par7</th>
                    <th>par8</th>
                    <th>par9</th>
                    <th>suma de la ronda 1</th>
                    <th>par10</th>
                    <th>par11</th>
                    <th>par12</th>
                    <th>par13</th>
                    <th>par14</th>
                    <th>par15</th>
                    <th>par16</th>
                    <th>par17</th>
                    <th>par18</th>
                    <th>suma de la ronda 2</th>
                    <th>suma total</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
                <%
                ArrayList<ingresodatosgetset> lisdat=new ArrayList<>();
                Consultas con=new Consultas();
                lisdat=con.consultaFichaCliente();
                ingresodatosgetset igs=new ingresodatosgetset();
                for(int i=0; i<lisdat.size(); i++){
                    igs=lisdat.get(i);
                %>
                <form action="ServletModificar">
                    <tr>
                    <th><input type="number" name="" value="<%=igs.getClFpFpCodigo()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpCliId()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar1()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar2()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar3()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar4()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar5()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar6()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar7()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar8()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar9()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpSumaRonda1()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar10()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar12()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar13()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar14()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar15()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar16()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar17()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpPar18()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpSumaRonda2()%>"></th>
                    <th><input type="number" name="" value="<%=igs.getClFpTotal()%>"></th>
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
</html>
