package ro.fasttrack.web;


import ro.fasttrack.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addOrder")
public class AddOrder extends HttpServlet {
    OperationService operationService = new OperationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        //get input as string
        String name_order = req.getParameter("name_order");
        int table_order = Integer.parseInt(req.getParameter("table_order"));
        String price_order = req.getParameter("price_order");



        // parse strings to integer
        try {
            operationService.saveOrder(name_order,table_order, Double.parseDouble(price_order));
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.println("<h2>Calculate </h2>");

            out.println("result is: <b>" + name_order + "</b><br/>");
            out.println("result is: <b>" + table_order + "</b><br/>");
            out.println("result is: <b>" + price_order + "</b><br/>");
            out.println("<a href='/calculator_war_exploded/'>Go Back</a>");

            out.close();
        } catch (Exception e) {

        }
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