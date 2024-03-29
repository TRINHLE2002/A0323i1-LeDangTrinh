package com.example.demo.Repository.ProductRepository;

import com.example.demo.Model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showListProduct();
    void create(Product product);
    void delete(int id);
    boolean update(Product product);
    List<Product> findByName(String name);
}
