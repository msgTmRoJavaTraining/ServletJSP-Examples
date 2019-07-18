package FirstServlets;

import org.glassfish.grizzly.config.dom.HttpRedirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "SecondServlet", urlPatterns = "/SecondServlet")
public class SecondServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession r=req.getSession();

        String recieved1 = (String) r.getAttribute("Name");
        String recieved2 = (String)r.getAttribute("CNP");
        PrintWriter outWriter = resp.getWriter();
        outWriter.println("Succes!");
        outWriter.println();
        outWriter.println();
        outWriter.println(recieved1);
        outWriter.println(recieved2);
        outWriter.println();
        outWriter.println();
        outWriter.println("Inserted!");
    }
}
