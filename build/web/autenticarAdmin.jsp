<%@page import="entidade.Usuario"%>
<%@page import="DAO.UsuarioDAO"%>
<% 
        UsuarioDAO dao = new UsuarioDAO();
        String usuario = request.getSession().getAttribute("usuario")+"";
        String senha = (String)request.getSession().getAttribute("senha");
        Usuario usr = dao.autenticarUsuario(usuario, senha);
        if (usr == null || usr.getNivelAcesso() != 4) {
            RequestDispatcher d = request.getRequestDispatcher("notfounded.jsp");
            d.forward(request, response);
        }
    %>