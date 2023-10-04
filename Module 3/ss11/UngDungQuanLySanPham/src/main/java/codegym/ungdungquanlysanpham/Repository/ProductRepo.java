package codegym.ungdungquanlysanpham.Repository;

import codegym.ungdungquanlysanpham.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo implements IproductRepo{
    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product("Trinh",1,123,"12/12/1222"));
        products.put(2,new Product("Trinh",1,123,"12/12/1222"));
        products.put(3,new Product("Trinh",1,123,"12/12/1222"));
        products.put(4,new Product("Trinh",1,123,"12/12/1222"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}
