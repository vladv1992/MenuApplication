package ro.fasttrack.repozitory;

import ro.fasttrack.menu.OrderDTO;
import ro.fasttrack.menu.ProductDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Postgrease implements RepositInter {
    final static String URL = "jdbc:postgresql://localhost:5432/Menu";
    final static String USERNAME = "postgres";
    final static String PASSWORD = System.getenv("POSTGRES_PASSWORD");


    public Postgrease() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }
    }

    @Override
    public void save(ProductDTO l) {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

             PreparedStatement pSt = conn.prepareStatement("INSERT INTO product(name, price, descriptions) VALUES (?,?,?)")) {

            pSt.setString(1, l.name());
            pSt.setDouble(2, l.price());
            pSt.setString(3, l.descriptions());

            int rowsInserted = pSt.executeUpdate();
            System.out.println("Inserted " + rowsInserted);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void save(OrderDTO r) {

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

             PreparedStatement pSt = conn.prepareStatement("INSERT INTO command(name_order, table_order, price_order) VALUES (?,?,?)")) {

            pSt.setString(1, r.name_order());
            pSt.setInt(2, r.table_order());
            pSt.setDouble(3, r.price_order());

            int rowsInserted = pSt.executeUpdate();
            System.out.println("Inserted " + rowsInserted);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<OrderDTO> findAll() {

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

             Statement st = conn.createStatement();

             ResultSet rs = st.executeQuery("SELECT * FROM command");

        ) {
            List<OrderDTO> orderDTOS = new ArrayList<>();
            while (rs.next()) {
                String name_order = rs.getString("name_order");
                int table_order = rs.getInt("table_order");
                double price_order = rs.getDouble("price_order");
                orderDTOS.add(new OrderDTO(name_order, table_order, price_order));
            }
            return orderDTOS;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<ProductDTO> findAlll() {
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

             Statement st = conn.createStatement();

             ResultSet rs = st.executeQuery("SELECT * FROM product");

        ) {
            List<ProductDTO> productDTOList = new ArrayList<>();
            while (rs.next()) {
                String nane = rs.getString("name");
                Double price = rs.getDouble("price");
                String descriptions = rs.getString("descriptions");
                productDTOList.add(new ProductDTO(nane, price, descriptions));
            }
            return productDTOList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
