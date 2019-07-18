package servlets.day9;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet1", urlPatterns = "/day9/servlet1")
public class servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String receivedName = request.getParameter("name");
        String receivedCnp = request.getParameter("cnp");

        PrintWriter printWriter = response.getWriter();
        String[] nameWords = receivedName.split(" ");

        if(nameWords.length == 2 && receivedCnp.length() == 13) {
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("sessionNameAttribute", receivedName);
            httpSession.setAttribute("sessionCnpAttribute", receivedCnp);

            response.setContentType("text/plain");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("servlet2");
            requestDispatcher.forward(request,response);
        } else {
            response.sendRedirect("../registrationFormDayNine.html");
        }

        printWriter.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
