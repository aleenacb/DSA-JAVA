import java.util.*;
import javax.servlet.*;
import java.io.*;
public class PostParameterServlet extends GenericServlet{
    public void service(ServletRequest request, ServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html"); // Set content type
        PrintWriter pw = response.getWriter();
        Enumeration<String> e = request.getParameterNames();
        while(e.hasMoreElements()) {
            String pname = e.nextElement();
            pw.print(pname + "=");
            String pvalue = request.getParameter(pname);
            pw.print(pvalue + "<br>"); // Add line break for readability
        }
        pw.close();
    }
}
