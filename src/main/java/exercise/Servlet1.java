package exercise;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet1", urlPatterns = "/Servlet1")
public class Servlet1 extends HttpServlet{

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            boolean chefIfValid = false;
            String receivedName = req.getParameter("requestName");
            String receivedCNP = req.getParameter("requestCNP");
            HttpSession mySes = req.getSession();
            mySes.setAttribute("NUME",receivedName);
            mySes.setAttribute("CNP",receivedCNP);
            if(receivedCNP.length() == 13 && receivedName.contains(" "))
                chefIfValid = true;

            if(chefIfValid) {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Servlet2");
                requestDispatcher.forward(req, resp);
            }else{
                resp.sendRedirect("print.html");
            }
        }
    }


