import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet1
 */
@WebServlet(urlPatterns="/Login")
public class LoginDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String user = req.getParameter("uname");
        String pswd = req.getParameter("pass");
        if (user.equals("sasikumar")) {
            out.print("Welcome, " + user);
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            session.setMaxInactiveInterval(20);
            resp.sendRedirect("home.jsp");
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(req, resp);
        }
    }
}