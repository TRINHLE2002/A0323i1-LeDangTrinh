package com.example.project_on_tap.repository;

import com.example.project_on_tap.model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements ICategoryRepository {

    private final String SELECT = "select * from type_paid";
    private final String SEARCH = "call search_category_by_id(?)";


    @Override
    public List<Category> display() {
        List<Category> list = new ArrayList<>();
        Connection con = BaseRepository.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()){
                int id = resultSet.getInt("category_id");
                String name = resultSet.getString("category_name");
                list.add(new Category(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public Category search(int id) {
        Connection conn = BaseRepository.getConnection();
        Category category = new Category();
        try {
            PreparedStatement ps = conn.prepareStatement(SEARCH);
            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("category_name");
                category = new Category(id,name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return category;
    }
}
