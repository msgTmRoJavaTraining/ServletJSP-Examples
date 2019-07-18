package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet2", urlPatterns = "/servlet2")
public class servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        String nume = (String) httpSession.getAttribute("name");
        String cnp = (String) httpSession.getAttribute("cnp");
        PrintWriter outWriter = resp.getWriter();
        outWriter.println("Success!");
        outWriter.println("Name: " + nume);
        outWriter.println("CNP: " + cnp);
        outWriter.println("Inserted!");
        outWriter.close();
    }

}
