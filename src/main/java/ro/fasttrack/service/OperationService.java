package ro.fasttrack.service;

import ro.fasttrack.menu.OrderDTO;
import ro.fasttrack.menu.ProductDTO;
import ro.fasttrack.repozitory.Postgrease;
import ro.fasttrack.repozitory.RepositInter;
import java.util.List;

public class OperationService {
    private final RepositInter reposit = new Postgrease();

    public List<ProductDTO> dtoList() {
        List<ProductDTO> productDTOS = reposit.findAlll();

        return productDTOS;
    }

    public List<OrderDTO> list() {
        List<OrderDTO> orderDTOS = reposit.findAll();

        return orderDTOS;
    }

    public void saveProdact(String name, double price, String descriptions) {

        reposit.save(new ProductDTO(name, price, descriptions));

    }

    public void saveOrder(String name_order, int table_order, double price_order) {

        reposit.save(new OrderDTO(name_order, table_order, price_order));

    }
}

