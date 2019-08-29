import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet
 */
public class Servlet1 extends HttpServlet {

    
   
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=getServletContext();
        String name=context.getInitParameter("username");
     context.setAttribute("username", name);
     RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
     rd.include(req, resp);
    }
}
