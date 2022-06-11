package service;


import model.Product;

import java.util.List;

public interface productService {
    List<Product> findAll();

    void save(Product product);

    int indexOfByID(int id);

    Product findByName (String name);

    Product findById (int id);

    void update(int id,Product product);

    void delete(int id );

}
