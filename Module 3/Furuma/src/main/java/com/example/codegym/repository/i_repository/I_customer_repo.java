package com.example.codegym.repository.i_repository;

import com.example.codegym.model.Customer;

import java.util.List;

public interface I_customer_repo {
    void add(Customer customer);
    List<Customer> update(Customer customer);
    List<Customer> delete(int id);
    List<Customer> getAll();
}
