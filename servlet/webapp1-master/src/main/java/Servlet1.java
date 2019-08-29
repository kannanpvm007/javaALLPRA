import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet1
 */
public class Servlet1 extends HttpServlet {

    private static final long serialVersionUID = -1483613522746997316L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String fullname = context.getInitParameter("user_name");

        req.setAttribute("user_name", fullname);
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        rd.forward(req, resp);

    }
}
