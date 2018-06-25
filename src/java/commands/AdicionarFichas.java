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


public class AdicionarFichas implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            
            VendaDAO vendDao = new VendaDAO();
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usr = dao.autenticarUsuario((String)((request.getSession().getAttribute("usuario"))+""), (String)((request.getSession().getAttribute("senha"))+""));
            

            // autenticação 
            if (usr == null || usr.getNivelAcesso() != 4) {
                RequestDispatcher d = request.getRequestDispatcher("/notfounded.jsp");
                d.forward(request, response);
            }
            //
            
            RequestDispatcher d;
            
            Usuario usrN = (Usuario)dao.getPojo((String)(request.getParameter("matricula")+""));
            if (usrN.getNome() != null) {
                usrN.setQuantTicket(usrN.getQuantTicket()+(Integer.parseInt(request.getParameter("qtd")+"")));
                dao.updatePojo(usrN);
                
                long milis = System.currentTimeMillis();
                Calendar.getInstance().setTimeInMillis(milis);
                Date data = (Date) Calendar.getInstance().getTime(); 
                int horas = Calendar.getInstance().get(Calendar.HOUR);
                int minutos = Calendar.getInstance().get(Calendar.MINUTE);
                int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                int mes = Calendar.getInstance().get(Calendar.MONTH);
                int ano = Calendar.getInstance().get(Calendar.YEAR);
                
                Venda venda = new Venda();
                venda.setQuantTicket(Integer.parseInt(request.getParameter("qtd")+""));
                venda.setIdUsuC(Integer.parseInt(request.getParameter("matricula")+""));
                venda.setIdUsuV(Integer.parseInt(request.getSession().getAttribute("usuario")+""));
                venda.setHoras(horas+":"+minutos);
                venda.setDatas(dia+"/"+mes+"/"+ano);
                
                vendDao.createPojo(venda);
                

                
                d = request.getRequestDispatcher("/admin.jsp?sucesso=Fichas adicionadas com sucesso!");
                d.forward(request, response);
            } else {
                d = request.getRequestDispatcher("/admin.jsp?erro=Usuário não encontrado!");
                d.forward(request, response);
            }

            

        }catch(IOException | ServletException ex){
            throw new RuntimeException(ex);
        }
    }
    
}
