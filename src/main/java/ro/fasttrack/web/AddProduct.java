package ro.fasttrack.web;

import ro.fasttrack.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addProduct")
public class AddProduct extends HttpServlet {

    OperationService operationServic = new OperationService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String descriptions = req.getParameter("descriptions");

        try {
            operationServic.saveProdact(name, price, descriptions);

            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.println("<h2>Product </h2>");

            out.println("product is: <b>" + name + "</b><br/>");
            out.println("product is: <b>" + price + "</b><br/>");
            out.println("product is: <b>" + descriptions + "</b><br/>");
            out.println("<a href='/menu_war_exploded/'>Go Back</a>");

            out.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
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
