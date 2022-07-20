package ro.fasttrack.service;

import ro.fasttrack.menuDTO.AddProductDTO;
import ro.fasttrack.menuDTO.ProductDTO;
import ro.fasttrack.repozitory.Postgrease;
import ro.fasttrack.repozitory.RepositInter;

public class OperationService {
    private RepositInter reposit = new Postgrease();

    public void saveProdact(String name, double price, String description) {


        reposit.save(new ProductDTO(name, price, description));

    }

    public void saveOrder(String name_order, int table_order, double price_order) {


        reposit.save(new AddProductDTO(name_order,table_order,price_order));

    }
}

