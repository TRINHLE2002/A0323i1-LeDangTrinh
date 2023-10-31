package com.example.project_on_tap.repository;



import com.example.project_on_tap.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();
    List<Product> searchByName(String nameSearch);
    List<Product> searchAll(String inputSearch);
    void save(Product product);
    void delete(int id);
}
