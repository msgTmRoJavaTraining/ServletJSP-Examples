package exercise;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2", urlPatterns = "/Servlet2")
public class Servlet2 extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printW = resp.getWriter();

        HttpSession session = req.getSession();
        session.getAttribute("NUME");
        session.getAttribute("CNP");

        printW.println("<html>");
        printW.println("<head>");
        printW.println("<title>Generated page!</title>");
        printW.println("</head>");
        printW.println("<body>");
        printW.println("<h1>Succes</h1>");
        printW.println("<p>Name:"+session.getAttribute("NUME")+"</p>");
        printW.println("<p>CNP:"+session.getAttribute("CNP")+"</p>");
        printW.println("<h1>Inserted</h1>");
        printW.println("</body></html>");



    }
}
