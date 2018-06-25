package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidade.Venda;
import java.util.List;
import DAO.VendaDAO;
import entidade.Item;
import DAO.ItemDAO;
import entidade.Cardapio;
import DAO.CardapioSemDAO;
import DAO.UsuarioDAO;
import entidade.Usuario;

public final class responsavel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Tela responsável", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "autenticarResponsavel.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    ");

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usr = (Usuario) dao.getPojo(request.getSession().getAttribute("usuario") + "");


    
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\"admin\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/top-responsavel.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/menu-responsavel.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("active", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("inicio", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid container-admin\">\n");
      out.write("\n");
      out.write("            <!-- mensagens -->\n");
      out.write("            ");
          
                if (request.getParameter("erro") != null) {
            
      out.write("\n");
      out.write("            <div class=\"alert alert-danger alert-dismissibler alert-dismissible fade show\" role=\"alert\" style=\"margin-bottom: 30px\">\n");
      out.write("                ");
      out.print( request.getParameter("erro"));
      out.write("\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("            ");

                if (request.getParameter("sucesso") != null) {
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\" style=\"margin-bottom: 30px\">\n");
      out.write("                ");
      out.print( request.getParameter("sucesso"));
      out.write("\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <!-- -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-12\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"box-admin\">\n");
      out.write("                                <div class=\"box-titulo\"><i class=\"fas fa-plus-circle\"></i>Descontar ficha</div>\n");
      out.write("                                <div class=\"box-conteudo\">\n");
      out.write("\n");
      out.write("                                    <form action=\"/ru/Controller?command=AdicionarFichas\" method=\"POST\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"matriculaLabel\">Matrícula</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control form-green\" id=\"matriculaLabel\" name=\"matricula\" >\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"submit\" value=\"Descontar\" class=\"btn btn-green\">\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
