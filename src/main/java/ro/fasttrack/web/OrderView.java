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
//              operationService.list();

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<head>");
        out.println("<title>Istoric </title>");
        out.println("</head>");

        out.println("<body>");
        out.println("Istoric:<br />");
        out.println("<table>");
        // op1 op op2 result
        out.println("<tr><th>op1</th><th>op</th><th>op2</th><th>result</th>");
        //history[0] = "5 + 10 = 15"
        // 5 + 10 15

        for (OrderDTO value : operationService.list()) {
            out.print("<tr>");
            out.print("<td>" + value.name_order() + "</td>");
            out.print("<td>" + value.price_order() + "</td>");
            out.print("<td>" + value.table_order()+ "</td>");
            out.print("</tr>");
        }
        out.println("</table>");

        out.println("</body>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

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
