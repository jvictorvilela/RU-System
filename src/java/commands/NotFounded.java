
package commands;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NotFounded implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try{
            RequestDispatcher d = request.getRequestDispatcher("/notfounded.jsp");
            d.forward(request, response);
        }catch(IOException | ServletException ex){
            throw new RuntimeException(ex);
        }
    }
    
}
