package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sessionServlet", urlPatterns = "/sessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Integer nrVisited = (Integer) httpSession.getAttribute("nrVisited");
        if (nrVisited == null) {
            nrVisited = 0;
        }
        nrVisited++;
        httpSession.setAttribute("nrVisited", nrVisited);
        response.setContentType("text/plain");
        try (PrintWriter outWriter = response.getWriter()) {
            outWriter.println(nrVisited);
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("servlet2");
        requestDispatcher.forward(request,response);
    }
}
