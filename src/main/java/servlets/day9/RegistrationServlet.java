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

@WebServlet(name = "RegistrationServlet", urlPatterns = "/day9/registerServlet")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String receivedName = req.getParameter("requestName");
        String receivedCNP = req.getParameter("requestCNP");

        String[] nrWords = receivedName.split(" ");
        PrintWriter printWriter = resp.getWriter();

        if(nrWords.length>=2 && receivedCNP.length()==13){
            HttpSession httpSession = req.getSession();

            httpSession.setAttribute("requestName",receivedName);
            httpSession.setAttribute("requestCNP",receivedCNP);


            RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegistrationServlet2");
            requestDispatcher.forward(req, resp);

        }
        else {
            resp.sendRedirect("../registration.html");
        }
        printWriter.close();

    }
}
