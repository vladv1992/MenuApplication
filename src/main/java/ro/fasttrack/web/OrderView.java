package ro.fasttrack.web;

import ro.fasttrack.menu.OrderDTO;
import ro.fasttrack.service.OperationService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/orderView")
public class OrderView extends HttpServlet {
    OperationService operationService = new OperationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<head>");
        out.println("<title>Istoric </title>");
        out.println("</head>");

        out.println("<body>");
        out.println("Historic:<br />");
        out.println("<table>");

        out.println("<tr><th>Name order</th><th>Table order</th><th>Price order</th>");

        for (OrderDTO value : operationService.list()) {
            out.print("<tr>");
            out.print("<td>" + value.name_order() + "</td>");
            out.print("<td>" + value.table_order() + "</td>");
            out.print("<td>" + value.price_order()+ "</td>");
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
