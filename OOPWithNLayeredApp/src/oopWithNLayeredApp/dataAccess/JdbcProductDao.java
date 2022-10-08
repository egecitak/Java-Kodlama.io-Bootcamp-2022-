package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        // Only for DB access codes; SQL
        System.out.println("Added to the database with JDBC");
    }

}


