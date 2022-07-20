package ro.fasttrack.repozitory;




import ro.fasttrack.menuDTO.AddProductDTO;
import ro.fasttrack.menuDTO.ProductDTO;
import ro.fasttrack.web.AddProduct;

import java.util.List;

public interface RepositInter {

    void save(ProductDTO l);

    void save(AddProductDTO r);
}



