package com.am.projectwala.service.impl;

import com.am.projectwala.model.Categories;
import com.am.projectwala.repositories.CategoryRepository;
import com.am.projectwala.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Categories> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Categories insertOrUpdateCategory(Categories categories) {
        return categoryRepository.save(categories);
    }

    @Override
    public Categories deleteCategory(Integer id) {
        Optional<Categories> categoriesData = categoryRepository.findById(id);
        if(categoriesData.isEmpty())
            return null;
        categoryRepository.deleteById(id);
        return categoriesData.get();
    }
}
