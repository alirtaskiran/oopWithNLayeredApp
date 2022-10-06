package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
    void add(Product product);
}
