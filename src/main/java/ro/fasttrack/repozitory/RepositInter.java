package ro.fasttrack.repozitory;

import ro.fasttrack.menu.OrderDTO;
import ro.fasttrack.menu.ProductDTO;

public interface RepositInter {

    void save(ProductDTO l);

    void save(OrderDTO r);
}



