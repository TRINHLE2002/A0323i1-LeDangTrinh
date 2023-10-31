package com.example.codegym.repository.repo_implement;

import com.example.codegym.database.BaseRepository;
import com.example.codegym.model.Customer;
import com.example.codegym.repository.i_repository.I_customer_repo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.codegym.database.BaseRepository.getConnection;

public class CustomerRepository implements I_customer_repo {
    private static final String SELECT_ALL_CUSTOMER = "select * from customer;";
    private static final String FIND_BY_ID ="select * from customer where id=?;" ;
    @Override
    public void add(Customer customer) {

    }

    @Override
    public List<Customer> update(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> delete(int id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = null;
        Connection connection = getConnection();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SELECT_ALL_CUSTOMER);
            while (rs.next()){

                int id = rs.getInt("customer_id");
                String name = rs.getString("customer_name");
                Date birthday = rs.getDate("customer_birthday");
                Boolean gender = rs.getBoolean("customer_gender");
                int id_card = rs.getInt("customer_id_card");
                int phone = rs.getInt("customer_phone");
                String email = rs.getString("customer_email");
                int id_type = rs.getInt("customer_type_id");
                String address = rs.getString("customer_address");

                customer = new Customer(id,name,birthday,gender,id_card,phone,email,id_type,address);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return customerList;
    }
    public Customer findById(int id) throws SQLException {
        Customer customer=null;
        Connection connection= BaseRepository.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(FIND_BY_ID);
        preparedStatement.setInt(1,id);
        ResultSet rs=preparedStatement.executeQuery();
        while(rs.next()){
            String name = rs.getString("customer_name");
            Date birthday = rs.getDate("customer_birthday");
            Boolean gender = rs.getBoolean("customer_gender");
            int id_card = rs.getInt("customer_id_card");
            int phone = rs.getInt("customer_phone");
            String email = rs.getString("customer_email");
            int id_type = rs.getInt("customer_type_id");
            String address = rs.getString("customer_address");
            customer = new Customer(id,name,birthday,gender,id_card,phone,email,id_type,address);
        }
        return customer;
    }
}
