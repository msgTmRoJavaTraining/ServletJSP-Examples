package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EchoServlet", urlPatterns = "/echoServlet")
public class EchoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String received = req.getParameter("requestString");
        PrintWriter outWriter = resp.getWriter();
        outWriter.println(received+" received via GET method!");
        outWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String received = req.getParameter("requestString");
        PrintWriter outWriter = resp.getWriter();
        outWriter.println(received+" received via POST method!");
        outWriter.close();
    }
}
