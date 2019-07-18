package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet2", urlPatterns = "/servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type","text/html");
        String name = req.getSession(false).getAttribute("name").toString();
        String  cnp = req.getSession(false).getAttribute("CNP").toString();
        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title><h1>Success!</h1></title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h1>Success!</h3>");
        pw.println("<a>Name:</a>");
        pw.println("<b>"+ name+ "</b><br>");
        pw.println("<a>CNP:</a>");
        pw.println("<b>"+cnp+ "</b>");
        pw.println("<h1>Inserted!</h3><br>");
        pw.println("</table></body></html>");
        pw.close();

    }
}
