import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet2
 */
@WebServlet(urlPatterns = "/servlet2",initParams = { 
    @WebInitParam(name = "servlet1demo2", value = "servlet2")})
public class Servlet2 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String val="login";
        context.setInitParameter("val", val);
        String name2=context.getInitParameter(val);
        System.out.println(name2);
    }
}