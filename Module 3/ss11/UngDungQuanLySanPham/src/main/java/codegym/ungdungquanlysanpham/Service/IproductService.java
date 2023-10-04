package codegym.ungdungquanlysanpham.Service;

import codegym.ungdungquanlysanpham.model.Product;

import java.util.List;

public interface IproductService {
    void save(Product product);
    boolean delete(int id);
    List<Product> findAll();
    void update(int id,Product product);
    Product findObject(int id);
}
