package ro.fasttrack.web;

import ro.fasttrack.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.datatransfer.DataFlavor;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addProduct")
public class AddProduct extends HttpServlet {

    OperationService operationServic = new OperationService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String  nProduct = req.getParameter("name");
        String  nPrice= req.getParameter("price");
        String nDescripion = req.getParameter("description");

        try {
            operationServic.saveProdact(nProduct, Double.parseDouble(nPrice),nDescripion);

            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.println("<h2>Prodact </h2>");

            out.println("prodact is: <b>" + nProduct + "</b><br/>");
            out.println("prodact is: <b>" + nPrice + "</b><br/>");
            out.println("prodact is: <b>" + nDescripion + "</b><br/>");
            out.println("<a href='/calculator_war_exploded/'>Go Back</a>");

            out.close();
        } catch (Exception e){
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
