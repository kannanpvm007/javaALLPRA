import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * FileDemo
 * 
 * @param <MultipartRequest>
 */
public class FileDemo<MultipartRequest> extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter write=resp.getWriter();

        ServletConfig config=getServletConfig();
        String conn=config.getInitParameter("con");
        write.print("welcome: "+conn);
    }
}