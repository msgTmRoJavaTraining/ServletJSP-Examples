package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "htmlGenerator", urlPatterns = "/htmlGenerator")
public class HTMLGeneratorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Generated page!</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<table border='2'>");
        printWriter.println("<tr><th>Random number</th></tr>");
        int n = random.nextInt(20);
        for (int i = 0; i < n; i++) {
            printWriter.println("<tr><td>" + random.nextInt() + "</td></tr>");
        }
        printWriter.println("</table></body></html>");
        printWriter.close();
    }
}
