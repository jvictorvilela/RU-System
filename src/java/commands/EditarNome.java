package commands;

import DAO.UsuarioDAO;
import entidade.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EditarNome implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usr = (Usuario)dao.getPojo((String)((request.getSession().getAttribute("usuario"))+""));
            usr.setNome(request.getParameter("nome"));
            dao.updatePojo(usr);
            RequestDispatcher d = request.getRequestDispatcher("/editarPerfil.jsp?sucesso=Nome editado com sucesso!");
            d.forward(request, response);
        }catch(IOException | ServletException ex){
            throw new RuntimeException(ex);
        }
    }
    
}
