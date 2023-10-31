package com.example.project_on_tap.repository;

import com.example.project_on_tap.model.Category;

import java.util.List;

public interface ICategoryRepository {
    List<Category> display();

    Category search(int id);
}
