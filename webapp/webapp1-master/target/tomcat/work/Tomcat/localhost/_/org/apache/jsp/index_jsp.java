/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-21 10:09:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"background-color:darkcyan;\">\n");
      out.write("    <h1>page heading</h1>\n");
      out.write("    <p>first paragraph</p>\n");
      out.write("    <p>second paragraph</p>\n");
      out.write("    <br>\n");
      out.write("    color<input type=\"color\" name=\"color\">\n");
      out.write("    </br>\n");
      out.write("    <!-- <br>\n");
      out.write("    button<input type=\"button\" name=\"button\">\n");
      out.write("    </br> -->\n");
      out.write("    <br>\n");
      out.write("    select the range<input type=\"range\" name=\"range\">\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    datetime-local<input type=\"datetime-local\" name=\"datetime-local\">\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    email<input type=\"email\" name=\"email\">\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    file<input type=\"file\" name=file>\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    image<input type=\"image\" name=\"image\">\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    week<input type=\"week\" name=\"week\">\n");
      out.write("    </br>\n");
      out.write("    <br>\n");
      out.write("    search<input type=\"search\" name=\"search\">\n");
      out.write("    </br>\n");
      out.write("    <h2>languages:</h2>\n");
      out.write("    <ul>\n");
      out.write("        <li>java</li>\n");
      out.write("        <li>sql</li>\n");
      out.write("        <li>html</li>\n");
      out.write("    </ul>\n");
      out.write("    <h2 style=\"background-color:orange;\">hello</h2>\n");
      out.write("    <h2 style=\"color:blue;\">hai!</h2>\n");
      out.write("    <h2 style=\"border: 2px solid blueviolet;\">hello world</h2>\n");
      out.write("    <h2 style=\"background-color:rgb(192, 161, 166);\">hello</h2>\n");
      out.write("    <h2 style=\"font-family:sans-serif\">hello</h2>\n");
      out.write("    <h2 style=\"text-align: center;\">hello world</h2>\n");
      out.write("    <h4>link<a href=\"https://www.tutorialrepublic.com/\">tutorialrepublic</a></h4>\n");
      out.write("    <h3>To make text bold,italics,inserted,deleted,marked,subscript,superscript,strong,small:</h3>\n");
      out.write("    <ul>\n");
      out.write("        <li><b>text is bold</b></li>\n");
      out.write("        <li><i>text is italics</i></li>\n");
      out.write("        <li><ins>text is inserted</ins></li>\n");
      out.write("        <li><del>text is deleted</del></li>\n");
      out.write("        <li><mark>text is marked</mark></li>\n");
      out.write("        <li>text is <sub>subscripted</sub></li>\n");
      out.write("        <li>text is <sup>superscripted</sup></li>\n");
      out.write("        <li>text is <strong>strong</strong></li>\n");
      out.write("        <li>text is <small>small</small></li>\n");
      out.write("    </ul>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
