import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet1
 */
public class Servlet1 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    ServletConfig config=getServletConfig();
    String name=config.getInitParameter("username");
    req.setAttribute("username", name);
    RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
    rd.include(req, resp);
}
    
}