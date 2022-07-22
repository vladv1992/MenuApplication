package ro.fasttrack.web;

import ro.fasttrack.menu.ProductDTO;
import ro.fasttrack.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/productView")
public class ProductView extends HttpServlet {
    OperationService operationServic = new OperationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<head>");
        out.println("<title>Historic </title>");
        out.println("</head>");

        out.println("<body>");
        out.println("Istoric:<br />");
        out.println("<table>");

        out.println("<tr><th>Name</th><th>Price</th><th>Descriptions</th>");

        for (ProductDTO value : operationServic.dtoList()) {
            out.print("<tr>");
            out.print("<td>" + value.name() + "</td>");
            out.print("<td>" + value.price() + "</td>");
            out.print("<td>" + value.descriptions() + "</td>");
            out.print("</tr>");
        }
        out.println("</table>");

        out.println("</body>");
        out.close();
    }


    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
