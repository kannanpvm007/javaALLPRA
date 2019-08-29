import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet1
 */
@WebServlet(urlPatterns = "/servlet1",initParams = { 
    @WebInitParam(name = "servlet1demo", value = "servlet1")})
public class Servlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String fullname = "sasikumar";
        context.setInitParameter("fullname",fullname);
        String name1=context.getInitParameter(fullname);
        System.out.println(name1);
        
        ServletConfig config=getServletConfig();
        String lastname=config.getInitParameter("servlet1demo");
        req.setAttribute("lastname",lastname);
        req.setAttribute("name1", name1);
        RequestDispatcher rd = req.getRequestDispatcher("servlet1.jsp");
        rd.forward(req, resp);
    }
}
