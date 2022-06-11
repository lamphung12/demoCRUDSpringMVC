package service;


import model.Product;
import service.productService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImp implements productService {
    List<Product> products = new ArrayList<>();

    public ProductServiceImp() {
        products = new ArrayList<>();
        products.add(new Product(1,"SamSung",1000));
        products.add(new Product(2,"Iphone",4000));
        products.add(new Product(3,"Xiaomi",2500));
        products.add(new Product(4,"OnePlus",3300));
        products.add(new Product(5,"Redmi",5300));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);

    }

    @Override
    public int indexOfByID(int id) {
        int index =-1;
        for (int i = 0; i < products.size() ; i++) {
            if(products.get(i).getId()==id){
                index=i;
            }
        }
        return 0;
    }

    @Override
    public Product findByName(String name) {
        for (int i = 0; i < products.size() ; i++) {
            if(products.get(i).getName().contains(name)){
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public Product findById(int id) {
        for (Product product:products) {
            if (product.getId()==id){
                 return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
     int indexOf = indexOfByID(id);
     products.set(indexOf,product);
    }

    @Override
    public void delete(int id) {
        int indexOfDelete =indexOfByID(id);
        products.remove(indexOfDelete);

    }
}
