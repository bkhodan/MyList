package servlets;


import car.Cars;
import car.CarsInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyTableServlet", value = "/data")
public class MyTableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Object usernameData = request.getAttribute("user");
        System.out.println(usernameData);
        CarsInfo s1 = new CarsInfo();

        out.println("<html><body>");
        out.println("<body>");
        out.println("<table border=\"1px solid black\" align=\"center\">\n" +
                            "<tr>\n" +
                            "<th> Name cars </th>\n" +
                            "<th> Car type </th>\n" +
                            "<th> Horsepower </th>\n" +
                            "<th> Year of issue </th>" +
                            "</tr>");
        for (Cars s : s1) {
            out.println("<tr><td>" + s.nameCar + "</td>" +
                                "<td>" + s.Cartype + "</td>" +
                                "<td align=\"center\">" + s.Horsepower() + "</td>" +
                                "<td align=\"center\">" + s.Year() + "</td></tr>");
        }
        out.println(" </table>");
        out.println("<form action=\"index.html\" align=\"center\"><input type=\"submit\" value=\"Back\"></form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
