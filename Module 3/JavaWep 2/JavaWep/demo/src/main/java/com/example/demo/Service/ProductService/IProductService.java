package com.example.demo.Service.ProductService;

import com.example.demo.Model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showListProduct();
    void create(Product product);
    void delete(int id);
    void update(Product product);
    List<Product> findByName(String name);
}
