package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidade.Item;
import DAO.ItemDAO;
import entidade.Cardapio;
import DAO.CardapioSemDAO;
import DAO.UsuarioDAO;
import entidade.Usuario;

public final class usuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Tela aluno", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "autenticar.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    ");

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usr = (Usuario)dao.getPojo(request.getSession().getAttribute("usuario")+"");
        

    
      out.write("\n");
      out.write("    \n");
      out.write("    <body class=\"admin\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/top-usuario.jsp", out, false);
      out.write("\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/menu-usuario.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("active", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("inicio", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    \n");
      out.write("        <div class=\"container-fluid container-admin\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"box-admin\">\n");
      out.write("                                <div class=\"box-titulo\"><i class=\"fas fa-list-ul\"></i>Cardápio</div>\n");
      out.write("                                <div class=\"box-conteudo ajuste-cardapio\">\n");
      out.write("\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/cardapio.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12 col-md-6\">\n");
      out.write("                            <div class=\"box-admin box-verde\">\n");
      out.write("                                <div class=\"box-titulo\"><i class=\"far fa-credit-card\"></i>Créditos</div>\n");
      out.write("                                <div class=\"box-conteudo ajuste-creditos center\"><span class=\"font-regular\" style=\"font-size: 75px\">");
      out.print( usr.getQuantTicket());
      out.write("</span><span class=\"font-regular\" style=\"font-size: 30px\"> Refeições</span></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--\n");
      out.write("                        <div class=\"col-lg-12 col-md-6\">\n");
      out.write("                            <div class=\"box-admin\">\n");
      out.write("                                <div class=\"box-titulo\"><i class=\"fas fa-history\"></i></i>Histórico</div>\n");
      out.write("                                <div class=\"box-conteudo\">\n");
      out.write("\n");
      out.write("                                    <table class=\"table table-historico\">\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>+ 10,50</td>\n");
      out.write("                                                <td>05/11/2018 - 12:32</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>- 01,10</td>\n");
      out.write("                                                <td>05/11/2018 - 12:45</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>- 01,10</td>\n");
      out.write("                                                <td>05/11/2018 - 18:05</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>- 01,10</td>\n");
      out.write("                                                <td>06/11/2018 - 12:11</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>- 01,10</td>\n");
      out.write("                                                <td>07/11/2018 - 11:56</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>- 01,10</td>\n");
      out.write("                                                <td>07/11/2018 - 18:01</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
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
