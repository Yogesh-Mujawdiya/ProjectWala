package com.am.projectwala.service;

import com.am.projectwala.model.Categories;

import java.util.List;

public interface CategoryService {

    List<Categories> getCategories();

    Categories insertOrUpdateCategory(Categories categories);

    Categories deleteCategory(Integer id);

}
