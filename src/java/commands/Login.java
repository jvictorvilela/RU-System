/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import DAO.UsuarioDAO;
import entidade.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usr = dao.autenticarUsuario(request.getParameter("login"), request.getParameter("senha"));
            if (usr != null) { // acesso autorizado
                request.getSession().setAttribute("usuario", usr.getMatricula());
                request.getSession().setAttribute("senha", usr.getSenha());
                RequestDispatcher d;
                switch (usr.getNivelAcesso()) {
                    case 1: 
                        d = request.getRequestDispatcher("/usuario.jsp");
                        d.forward(request, response);
                        break;
                    case 2:
                        d = request.getRequestDispatcher("/responsavel.jsp");
                        d.forward(request, response);
                        break;
                    case 3:
                        d = request.getRequestDispatcher("/nutricionista.jsp");
                        d.forward(request, response);
                        break;
                    case 4:
                        d = request.getRequestDispatcher("/admin.jsp");
                        d.forward(request, response);
                        break;
                }

            } else {
                RequestDispatcher d = request.getRequestDispatcher("/index.jsp?erro=1");
                d.forward(request, response);
            }
            
        }catch(IOException | ServletException ex){
            throw new RuntimeException(ex);
        }
    }
    
}
