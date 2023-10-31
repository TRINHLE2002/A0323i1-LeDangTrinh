package com.example.project_on_tap.repository;

import com.example.project_on_tap.model.Product;
import com.example.project_on_tap.service.ICategoryService;
import com.example.project_on_tap.service.CategoryService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private ICategoryService iCategoryService = new CategoryService();
    private final String SELECT = "select * from product";

    private final String INSERT = "insert into  `manager_product`.`product` (`name`, `price`, `quantity`, `color`, `category_id`)\n" +
            "values(?,?,?,?,?)";
    private final String DELETE = "Call delete_product_by_id(?)";
    private final String SEARCH_NAME = "call search_product_by_name(?)";
    private final String SEARCH_All = "call search_product_by_all(?)";
    @Override
    public List<Product> display() {
        List<Product> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                int categoryId = resultSet.getInt("category_id");
                list.add(new Product(id,name,price,quantity,color,iCategoryService.search(categoryId)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public void save(Product product) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(INSERT);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setDouble(2,product.getPrice());
            preparedStatement.setInt(3,product.getQuantity());
            preparedStatement.setString(4,product.getColor());
            preparedStatement.setInt(5,product.getCategory().getCategoryId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Product> searchByName(String nameSearch) {
        Connection conn = BaseRepository.getConnection();
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(SEARCH_NAME);
            ps.setString(1,nameSearch);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                int categoryId = resultSet.getInt("category_id");
                list.add(new Product(name,price,quantity,color,iCategoryService.search(categoryId)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public List<Product> searchAll(String inputSearch) {
        Connection conn = BaseRepository.getConnection();
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(SEARCH_All);
            ps.setString(1,inputSearch);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                int categoryId = resultSet.getInt("category_id");
                list.add(new Product(name,price,quantity,color,iCategoryService.search(categoryId)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void delete(int id) {
        Connection con = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
