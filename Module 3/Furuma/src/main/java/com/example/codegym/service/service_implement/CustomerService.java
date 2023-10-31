package com.example.codegym.service.service_implement;

import com.example.codegym.model.Customer;
import com.example.codegym.repository.repo_implement.CustomerRepository;
import com.example.codegym.service.i_service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void add(Customer customer) {

    }

    @Override
    public List<Customer> delete(int id) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public boolean edit(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }
}
