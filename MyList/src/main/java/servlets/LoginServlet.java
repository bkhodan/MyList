package servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println("User (LoginServlet#doPOST) - " + user + " " + password);
        request.setAttribute("user", user);
        PrintWriter out = response.getWriter();
        if ("root".equals(user) && "root".equals(password)) {
            String tableContext = "/data";
            RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher(tableContext);
            dispatcher.forward(request, response);
        } else {
            String path = request.getContextPath() + "/.";
            response.sendRedirect(path);
        }
    }
    public void destroy() {
    }
}