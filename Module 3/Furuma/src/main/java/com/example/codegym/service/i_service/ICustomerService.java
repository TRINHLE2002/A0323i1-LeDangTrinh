package com.example.codegym.service.i_service;

import com.example.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    void add(Customer customer);
    List<Customer> delete(int id);
    void update(Customer customer);
    boolean edit(Customer customer);
    List<Customer> getAll();
}
