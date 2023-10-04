package codegym.ungdungquanlysanpham.Repository;

import codegym.ungdungquanlysanpham.model.Product;

import java.util.List;

public interface IproductRepo {
    List<Product> findAll();
    void save (int id, Product product);
    Product findById(int id);
    void update(int id, Product product);

    void delete(int id);
}
