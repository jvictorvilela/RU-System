package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Página inicial", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    <body class=\"bg\">\n");
      out.write("        <canvas class=\"canvas\"></canvas>\n");
      out.write("        <div class=\"container full\">\n");
      out.write("            <div class=\"row align-items-center full\">\n");
      out.write("                <div class=\"col-md-7 col-lg-6 offset-md-0 offset-lg-1 col-sm-12 offset-sm-0 cardapio height-box-login\">\n");
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/cardapio.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5 col-lg-4 login-place height-box-login box-login\">\n");
      out.write("                    ");
 if (request.getParameter("erro") != null) {
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                        Matrícula ou senha incorretas!\n");
      out.write("                        </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <img src=\"img/logo.png\" class=\"logo-main-page\">\n");
      out.write("                    <form action=\"/ru/Controller?command=Login\" method=\"POST\">\n");
      out.write("                        <input class=\"form-control form-green\" type=\"text\" name=\"login\" placeholder=\"Matrícula\">\n");
      out.write("                        <input class=\"form-control form-green\" type=\"password\" name=\"senha\" placeholder=\"Senha\">\n");
      out.write("                        <input type=\"checkbox\" value=\"lembrar\" id=\"lembrar-me\">\n");
      out.write("                        <label class=\"form-check-label\" for=\"lembrar-me\">Lembrar-me</label>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" value=\"Entrar\" class=\"btn btn-green\">\n");
      out.write("                    </form>\n");
      out.write("                    <a href=\"#\" data-toggle=\"modal\" data-target=\"#recuperarSenha\" >Esqueceu sua senha?</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Modal -->\n");
      out.write("            <div class=\"modal fade\" id=\"recuperarSenha\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Recuperar Senha</h5>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <form class=\"form-group\" style=\"margin-bottom: 0px\">\n");
      out.write("                                <input type=\"text\" class=\"form-control form-green\" placeholder=\"Seu email\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Fechar</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-green\">Recuperar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
