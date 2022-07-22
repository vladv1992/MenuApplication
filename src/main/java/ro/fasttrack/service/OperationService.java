package ro.fasttrack.service;


import ro.fasttrack.menu.OrderDTO;
import ro.fasttrack.menu.ProductDTO;
import ro.fasttrack.repozitory.Postgrease;
import ro.fasttrack.repozitory.RepositInter;

import java.util.ArrayList;
import java.util.List;

public class OperationService {
    private RepositInter reposit = new Postgrease();

    public List<OrderDTO> list(){
        List<OrderDTO> orderDTOS = reposit.findAll();

            return orderDTOS;
    }

    public void saveProdact(String name, double price, String description) {


        reposit.save(new ProductDTO(name, price, description));

    }

    public void saveOrder(String name_order, int table_order, double price_order) {


        reposit.save(new OrderDTO(name_order,table_order,price_order));

    }
}

