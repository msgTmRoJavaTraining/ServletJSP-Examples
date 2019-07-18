package FirstServlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", urlPatterns = "/FormServlet")
public class FormServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String recieved1 = req.getParameter("Name");
        String recieved2 = req.getParameter("CNP");

        if(recieved2.length()==13 && recieved1.contains(" ")) {
            RequestDispatcher requestDispatcher =req.getRequestDispatcher("SecondServlet");

            HttpSession s=req.getSession();

            s.setAttribute("Name",recieved1);
            s.setAttribute("CNP",recieved2);
            requestDispatcher.forward(req,resp);
        }
        else
        {
            resp.sendRedirect("form.html");
        }
    }



}
