package servlets.day9;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegistrationServlet2", urlPatterns = "/day9/RegistrationServlet2")
public class RegistrationServlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession httpSession = req.getSession();

        String nameSession = (String) httpSession.getAttribute("requestName");
        String cnpSession = (String) httpSession.getAttribute("requestCNP");

        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Generated page!</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h1>Success!</h1></br>");
        printWriter.println("<p>Name:" +  nameSession + "</p>");
        printWriter.println("<p>CNP:" + cnpSession + "</p>");
        printWriter.println("<h1>Inserted!</h1>");
        printWriter.println("</body></html>");

        printWriter.close();
    }
}