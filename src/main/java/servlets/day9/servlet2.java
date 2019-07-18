package servlets.day9;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet2", urlPatterns = "/day9/servlet2")
public class servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession httpSession = request.getSession();

        String nameFromSession = (String) httpSession.getAttribute("sessionNameAttribute");
        String cnpFromSession = (String) httpSession.getAttribute("sessionCnpAttribute");

        response.setContentType("text/html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Registered Successfully</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Success!</h1>");
        out.println("<p>Name: " + nameFromSession + "</p>");
        out.println("<p>CNP: " + cnpFromSession + "</p>");
        out.println("<h1>Inserted!</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { }
}
