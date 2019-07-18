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

@WebServlet(name = "servlet1", urlPatterns = "/servlet1")
public class Servelt1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        String name = req.getParameter("name");
        String cnp = req.getParameter("CNP");
        String[] checkName = name.split(" ");
        boolean okName = false;
        boolean okCNP = false;
        if(checkName.length>1) {
            if (checkName[0] != null && checkName[1] != null) {
                okName = true;
                if (cnp.length() == 13) {
                    okCNP = true;
                }
            }
        }
        if(okName== true && okCNP == true){
            httpSession.setAttribute("name", name);
            httpSession.setAttribute("CNP", cnp);
            resp.setContentType("text/plain");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("servlet2");
            requestDispatcher.forward(req,resp);
        }else{
            resp.sendRedirect("indexExercise.html");
        }

    }
}
