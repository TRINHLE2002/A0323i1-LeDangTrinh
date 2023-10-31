package com.example.project_on_tap.service;

import com.example.project_on_tap.model.Category;
import com.example.project_on_tap.repository.ICategoryRepository;
import com.example.project_on_tap.repository.CategoryRepository;

import java.util.List;

public class CategoryService implements ICategoryService {
    private ICategoryRepository iCategoryRepository = new CategoryRepository();
        @Override
        public List<Category> display() {
            return iCategoryRepository.display();
        }

        @Override
        public Category search(int id) {
           return iCategoryRepository.search(id);
        }

}
