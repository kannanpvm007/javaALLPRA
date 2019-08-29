import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletCookies1
 */
@WebServlet(urlPatterns="/ServletCookies1")
public class ServletCookies1 extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            String name = req.getParameter("userName");
            out.println("hello "+name);
            Cookie cookie = new Cookie("uname", name);
            resp.addCookie(cookie);
            // out.print("<form action='servletcookies1'>");
            // out.print("<input type='text' name='userName'/>");
            // out.print("<input type='submit' value='go' />");
            out.close();
        } catch (Exception e) {
           System.out.println(e);
        }

    }
}