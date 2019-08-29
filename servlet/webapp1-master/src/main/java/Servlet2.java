import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet1
 */
public class Servlet2 extends HttpServlet {

    private static final long serialVersionUID = -1483613522746997316L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String lastname = config.getInitParameter("password");

        req.setAttribute("password", lastname);
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        rd.forward(req, resp);

    }
}
