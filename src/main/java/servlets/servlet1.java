package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "servlet1", urlPatterns = "/servlet1")
public class servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nume = req.getParameter("name");
        String cnp = req.getParameter("cnp");
        HttpSession httpSession = req.getSession();
        if (nume.contains(" ") && cnp.length() == 13) {
            httpSession.setAttribute("name", nume);
            httpSession.setAttribute("cnp", cnp);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("servlet2");
            requestDispatcher.forward(req,resp);
        } else {
            resp.sendRedirect("index.html");
        }
    }
}
