package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Consultas;
import modelo.ingresodatosgetset;
import java.util.ArrayList;

public final class clienteficha_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <h1>Cliente y Ficha De Puntuacion</h1>\n");
      out.write("        <header>\n");
      out.write("            <h1>Ingreso de datos de Cliente y Ficha De Puntuacion</h1>\n");
      out.write("        </header>\n");
      out.write("        <div>\n");
      out.write("        <form action=\"ServletIngresar\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el codigo de la ficha\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el documento del cliente\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par1\"><br><br>\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par2\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par3\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par4\"><br><br>\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par5\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par6\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par7\"><br><br>\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par8\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par9\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese la suma de la ronda 1\"><br><br>\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par10\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par11\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par12\"><br><br>\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par13\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par14\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par15\"><br><br>\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par16\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par17\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el par18\"><br><br>\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese la suma de la ronda 2\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese la suma total\"><br><br>\n");
      out.write("                <input type=\"submit\" value=\"Guardar\">\n");
      out.write("            </form>\n");
      out.write("        </div><br><br>\n");
      out.write("        <div>\n");
      out.write("        <div class=\"tabla\"><table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>codigo de la ficha</th>\n");
      out.write("                    <th>documento del cliente</th>\n");
      out.write("                    <th>par1</th>\n");
      out.write("                    <th>par2</th>\n");
      out.write("                    <th>par3</th>\n");
      out.write("                    <th>par4</th>\n");
      out.write("                    <th>par5</th>\n");
      out.write("                    <th>par6</th>\n");
      out.write("                    <th>par7</th>\n");
      out.write("                    <th>par8</th>\n");
      out.write("                    <th>par9</th>\n");
      out.write("                    <th>suma de la ronda 1</th>\n");
      out.write("                    <th>par10</th>\n");
      out.write("                    <th>par11</th>\n");
      out.write("                    <th>par12</th>\n");
      out.write("                    <th>par13</th>\n");
      out.write("                    <th>par14</th>\n");
      out.write("                    <th>par15</th>\n");
      out.write("                    <th>par16</th>\n");
      out.write("                    <th>par17</th>\n");
      out.write("                    <th>par18</th>\n");
      out.write("                    <th>suma de la ronda 2</th>\n");
      out.write("                    <th>suma total</th>\n");
      out.write("                    <th>Modificar</th>\n");
      out.write("                    <th>Eliminar</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                ArrayList<ingresodatosgetset> lisdat=new ArrayList<>();
                Consultas con=new Consultas();
                lisdat=con.consultaFichaCliente();
                ingresodatosgetset igs=new ingresodatosgetset();
                for(int i=0; i<lisdat.size(); i++){
                    igs=lisdat.get(i);
                
      out.write("\n");
      out.write("                <form action=\"ServletModificar\">\n");
      out.write("                    <tr>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpFpCodigo());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpCliId());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar1());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar2());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar3());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar4());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar5());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar6());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar7());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar8());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar9());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpSumaRonda1());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar10());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar12());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar13());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar14());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar15());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar16());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar17());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpPar18());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpSumaRonda2());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getClFpTotal());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"submit\" name=\"\" value=\"Modificar\"></th>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
