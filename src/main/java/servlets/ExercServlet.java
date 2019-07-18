package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ExercServlet", urlPatterns = "/exerc")
public class ExercServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nume = req.getParameter("Nume");
        String CNP = req.getParameter("CNP");
        PrintWriter printWriter = resp.getWriter();

//        printWriter.println(nume);
//        printWriter.println(CNP);

        String[] fullName=nume.split(" ");
        if(fullName.length >1 && CNP.length()==13){
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Succes page!</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("Succes<br>");
            printWriter.println("Name:"+nume);
            printWriter.println("<br>CNP:"+CNP);
            printWriter.println("</body>");
            printWriter.println("</html>");
            printWriter.close();
        }
        else
        resp.sendRedirect("exerc.html");

    }
}
