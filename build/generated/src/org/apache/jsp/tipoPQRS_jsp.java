package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Consultas;
import modelo.ingresodatosgetset;
import java.util.ArrayList;

public final class tipoPQRS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <h1>Tipo PQRS</h1>\n");
      out.write("        <header>\n");
      out.write("            <h1>Ingreso de datos del Tipo De PQRS</h1>\n");
      out.write("        </header>\n");
      out.write("        <div>\n");
      out.write("        <form action=\"ServletIngresar\">\n");
      out.write("                <input type=\"number\" name=\"\" placeholder=\"ingrese el codigo\">\n");
      out.write("                <input type=\"text\" name=\"\" placeholder=\"ingrese el nombre\">\n");
      out.write("                <textarea name=\"\" placeholder=\"ingrese la descripcion\"></textarea>\n");
      out.write("                <input type=\"submit\" value=\"Guardar\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("        <div class=\"tabla\"><table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Codigo</th>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>Descripcion</th>\n");
      out.write("                    <th>Modificar</th>\n");
      out.write("                    <th>Eliminar</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                ArrayList<ingresodatosgetset> lisdat=new ArrayList<>();
                Consultas con=new Consultas();
                lisdat=con.consultaTipoPQRS();
                ingresodatosgetset igs=new ingresodatosgetset();
                for(int i=0; i<lisdat.size(); i++){
                    igs=lisdat.get(i);
                
      out.write("\n");
      out.write("                <form action=\"ServletModificar\">\n");
      out.write("                    <tr>\n");
      out.write("                    <th><input type=\"number\" name=\"\" value=\"");
      out.print(igs.getTipCodigo());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"text\" name=\"\" value=\"");
      out.print(igs.getTipNombre());
      out.write("\"></th>\n");
      out.write("                    <th><input type=\"text\" name=\"\" value=\"");
      out.print(igs.getTipDescripcion());
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
