package com.example.project_on_tap.service;

import com.example.project_on_tap.model.Product;
import com.example.project_on_tap.repository.ProductRepository;
import com.example.project_on_tap.repository.IProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> display() {
        return iProductRepository.display();
    }

    @Override
    public List<Product> searchByName(String nameSearch) {
       return iProductRepository.searchByName(nameSearch);
    }

    @Override
    public List<Product> searchAll(String inputSearch) {
        return iProductRepository.searchAll(inputSearch);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

}
