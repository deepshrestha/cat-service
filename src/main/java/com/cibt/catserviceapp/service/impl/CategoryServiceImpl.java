package com.cibt.catserviceapp.service.impl;

import java.util.List;
import java.util.Optional;

import com.cibt.catserviceapp.models.Category;
import com.cibt.catserviceapp.repository.CategoryRepository;
import com.cibt.catserviceapp.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategoryByParentId(Long parentId) {
        return categoryRepository.findByParentId(parentId);
	}

    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.findByCategoryName(name);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(Long id) {

        // return categoryRepository.findById(id).get();

        Optional<Category> categoryEntity =  categoryRepository.findById(id);

        if(categoryEntity.isPresent()) {
            return categoryEntity.get();
        }
        
        return null;

        // return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
    
}