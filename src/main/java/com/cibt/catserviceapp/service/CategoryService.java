package com.cibt.catserviceapp.service;

import java.util.List;

import com.cibt.catserviceapp.models.Category;

public interface CategoryService {

    List<Category> getAll();

    List<Category> getCategoryByParentId(Long parentId);

    Category getById(Long id);

    Category getCategoryByName(String name);

    Category saveCategory(Category category);
}