package com.example.project_on_tap.service;

import com.example.project_on_tap.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> display();
    Category search(int id);

}
