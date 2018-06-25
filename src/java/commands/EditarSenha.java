package commands;

import DAO.UsuarioDAO;
import entidade.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EditarSenha implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usr = (Usuario)dao.getPojo((String)((request.getSession().getAttribute("usuario"))+""));
            usr.setSenha(request.getParameter("senha"));
            dao.updatePojo(usr);
            request.getSession().setAttribute("senha", usr.getSenha());
            RequestDispatcher d = request.getRequestDispatcher("/editarPerfil.jsp?sucesso=Senha editada com sucesso!");
            d.forward(request, response);
        }catch(IOException | ServletException ex){
            throw new RuntimeException(ex);
        }
    }
    
}
