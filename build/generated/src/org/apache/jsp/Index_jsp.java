package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .boton{\n");
      out.write("                margin: 10px;\n");
      out.write("                width: 95px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function main() {\n");
      out.write("                var bton = document.getElementById(\"reset\");\n");
      out.write("                bton.onclick = function () {\n");
      out.write("                    var ele = document.getElementsByName(\"servicio\");\n");
      out.write("                    var ele2 = document.getElementsByName(\"instalacion\");\n");
      out.write("                    var ele3 = document.getElementsByName(\"edificada\");\n");
      out.write("                    var ele4 = document.getElementsByName(\"moviliario\");\n");
      out.write("                    for(var i = 0; i<ele.length; i++){\n");
      out.write("                        ele[i].checked = false;}\n");
      out.write("                    for(var i = 0; i<ele2.length; i++){\n");
      out.write("                        ele2[i].checked = false;}\n");
      out.write("                    for(var i = 0; i<ele3.length; i++){\n");
      out.write("                        ele3[i].checked = false;}\n");
      out.write("                    for(var i = 0; i<ele4.length; i++){\n");
      out.write("                        ele4[i].checked = false;}\n");
      out.write("                };\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"main()\">\n");
      out.write("        <div style=\"border:blue ridge ;margin:2% 15%; width: 35%; height: 40%;\">\n");
      out.write("            <div style=\"margin: 30px; \">\n");
      out.write("                <h1>Construcciones.S.A.C</h1>\n");
      out.write("                <form action=\"Controlador\" method=\"GET\">\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Elige servicio:</legend>\n");
      out.write("                        <label>\n");
      out.write("                            <fieldset>\n");
      out.write("                                <legend> <input type=\"radio\" name=\"servicio\" value=\"Instalacion\"> Instalacion</legend>\n");
      out.write("                                <label>\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <legend> <input type=\"radio\" name=\"Tinstalacion\" value=\"edificada\"> Edificada</legend>\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"radio\" name=\"Tedificada\" value=\"techo\"> Techo\n");
      out.write("                                        </label>\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"radio\" name=\"Tedificada\" value=\"pared\"> Pared\n");
      out.write("                                        </label>\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </label>\n");
      out.write("                                <label>\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <legend><input type=\"radio\" name=\"Tinstalacion\" value=\"empotrada\"> Empotrada</legend>\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </label>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </label>\n");
      out.write("\n");
      out.write("                        <label>\n");
      out.write("                            <fieldset>\n");
      out.write("                                <legend> <input type=\"radio\" name=\"servicio\" value=\"mobiliario\"> Mobiliario</legend>\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"radio\" name=\"mobiliario\" value=\"mueble\"> Muebles\n");
      out.write("                                </label>\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"radio\" name=\"mobiliario\" value=\"silla\"> Sillas\n");
      out.write("                                </label>\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"radio\" name=\"mobiliario\" value=\"mesa\"> Mesa\n");
      out.write("                                </label>\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"radio\" name=\"mobiliario\" value=\"tele\"> Television\n");
      out.write("                                </label>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </label>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <input type='submit' valur='Enviar'/>\n");
      out.write("                </form>\n");
      out.write("                <input type='button' id='reset' value='Reset'/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
