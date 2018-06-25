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


public class CadastrarNovoUsuario implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            
            UsuarioDAO dao = new UsuarioDAO();
            Usuario usr = dao.autenticarUsuario((String)((request.getSession().getAttribute("usuario"))+""), (String)((request.getSession().getAttribute("senha"))+""));
            

            // autenticação 
            if (usr == null || usr.getNivelAcesso() != 4) {
                RequestDispatcher d = request.getRequestDispatcher("/notfounded.jsp");
                d.forward(request, response);
            }
            //
            
            RequestDispatcher d;
            
            String nome = request.getParameter("nome");
            String matricula = request.getParameter("matricula")+"";
            String senha = request.getParameter("senha");
            String cpf = request.getParameter("cpf");
            String tipo = request.getParameter("tipo");
            
            if (nome != null && matricula != null && senha != null && cpf != null && tipo != null) {
                Usuario novoUsr = new Usuario();
                novoUsr.setNome(nome);
                novoUsr.setMatricula(Integer.parseInt(matricula));
                novoUsr.setSenha(senha);
                novoUsr.setCpf(cpf);
                novoUsr.setTipo(tipo);
                
                dao.createPojo(novoUsr);

                
                d = request.getRequestDispatcher("/admin.jsp?sucesso=Usuário criado com sucesso!");
                d.forward(request, response);
            } else {
                d = request.getRequestDispatcher("/admin.jsp?erro=Preencha todos os dados!");
                d.forward(request, response);
            }

            

        }catch(IOException | ServletException ex){
            throw new RuntimeException(ex);
        }
    }
    
}
