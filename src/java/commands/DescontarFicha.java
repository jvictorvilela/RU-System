package commands;

import DAO.UsuarioDAO;
import DAO.VendaDAO;
import entidade.Usuario;
import entidade.Venda;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DescontarFicha implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            
            VendaDAO vendDao = new VendaDAO();
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usr = dao.autenticarUsuario((String)((request.getSession().getAttribute("usuario"))+""), (String)((request.getSession().getAttribute("senha"))+""));
            

            // autenticação 
            if (usr == null || usr.getNivelAcesso() != 2) {
                RequestDispatcher d = request.getRequestDispatcher("/notfounded.jsp");
                d.forward(request, response);
            }
            //
            
            RequestDispatcher d;
            
            Usuario usrN = (Usuario)dao.getPojo((String)(request.getParameter("matricula")+""));
            if (usrN.getNome() != null) {
                if (usrN.getQuantTicket() >= 1) {
                    usrN.setQuantTicket(usrN.getQuantTicket()-1);
                    dao.updatePojo(usrN);
                } else {
                    d = request.getRequestDispatcher("/responsavel.jsp?erro=Saldo insuficiente!");
                    d.forward(request, response);
                }
                d = request.getRequestDispatcher("/responsavel.jsp?sucesso=Saldo descontato com sucesso!");
                d.forward(request, response);
            } else {
                d = request.getRequestDispatcher("/responvel.jsp?erro=Usuário não encontrado!");
                d.forward(request, response);
            }

            

        }catch(IOException | ServletException ex){
            throw new RuntimeException(ex);
        }
    }
    
}
