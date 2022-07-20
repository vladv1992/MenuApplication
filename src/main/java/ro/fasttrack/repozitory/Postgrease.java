package ro.fasttrack.repozitory;


import ro.fasttrack.domaine.Product;
import ro.fasttrack.menuDTO.AddProductDTO;
import ro.fasttrack.menuDTO.ProductDTO;
import ro.fasttrack.web.AddProduct;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Postgrease implements RepositInter {
    final static String URL = "jdbc:postgresql://localhost:5432/Menu";
    final static String USERNAME = "postgres";
    final static String PASSWORD = "1234";

    public Postgrease() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
//           throw new RepAccessEception(e);
        }
    }

    @Override
    public void save(ProductDTO l) {
        try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // 4. create a query statement
            PreparedStatement pSt = conn.prepareStatement("INSERT INTO prodact(name, price, descriptions) VALUES (?,?,?)")){
//            Class.forName("org.postgresql.Driver");
            // 2. define connection params to db


            // 3. obtain a connection
            //so we have 3 params
            pSt.setString(1, l.name());
            pSt.setDouble(2, l.price());
            pSt.setString(3, l.description());



            // 5. execute a prepared statement
            int rowsUpdated = pSt.executeUpdate();

            // 6. close the objects

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void save(AddProductDTO r) {
        try(Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // 4. create a query statement
            PreparedStatement pSt = conn.prepareStatement("INSERT INTO order(name_order, table_order, price_order) VALUES (?,?,?)")){
//            Class.forName("org.postgresql.Driver");
            // 2. define connection params to db


            // 3. obtain a connection
            //so we have 3 params
            pSt.setString(1, r.name_order());
            pSt.setInt(2, r.table_order());
            pSt.setDouble(3, r.price_order());



            // 5. execute a prepared statement
            int rowsUpdated = pSt.executeUpdate();

            // 6. close the objects

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
