
package commands;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Sair implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            request.getSession().removeAttribute("usuario");
            request.getSession().removeAttribute("senha");
            RequestDispatcher d = request.getRequestDispatcher("/index.jsp");
            d.forward(request, response);
        }catch(IOException | ServletException ex){
            throw new RuntimeException(ex);
        }
    }
    
}
