package com.cibt.catserviceapp.controllers.rest;

import java.util.List;

import com.cibt.catserviceapp.controllers.GenericResponse;
import com.cibt.catserviceapp.models.Category;
// import com.cibt.catserviceapp.repository.CategoryRepository;
// import com.cibt.catserviceapp.service.impl.CategoryServiceImpl;
import com.cibt.catserviceapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/categories")
public class CategoryAPIController {

    /* @Autowired
    private CategoryServiceImpl categoryServiceImpl; */

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<GenericResponse<List<Category>>> index() {
        List<Category> list = categoryService.getAll();
        if(list == null) {
            return ResponseEntity.ok(new GenericResponse<>(list, "Data not found!", HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND.value()));
        }
        return ResponseEntity.ok(new GenericResponse<>(list, "Data found!", HttpStatus.OK, HttpStatus.OK.value()));
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<GenericResponse<Category>> detail(@PathVariable("id") Long id){
        Category category = categoryService.getById(id);
        System.out.println("Category: " + category);
        if(category == null) {
            return ResponseEntity.ok(new GenericResponse<>(category, "Data not found!", HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND.value()));
        }
        return ResponseEntity.ok(new GenericResponse<>(category, "Data found!", HttpStatus.OK, HttpStatus.OK.value()));
    }

    @GetMapping(value="/parent/{parentId}")
    public ResponseEntity<GenericResponse<List<Category>>> detailByparentId(@PathVariable("parentId") Long parentId){
        List<Category> list = categoryService.getCategoryByParentId(parentId);
        if(list == null) {
            return ResponseEntity.ok(new GenericResponse<>(list, "Data not found!", HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND.value()));
        }
        return ResponseEntity.ok(new GenericResponse<>(list, "Data found!", HttpStatus.OK, HttpStatus.OK.value()));
    }

    @GetMapping(value="/query")
    public ResponseEntity<GenericResponse<Category>> categoryDetail(@RequestParam("name") String name) throws Exception {
        Category category =  categoryService.getCategoryByName(name);
        if(category == null) {
            return ResponseEntity.ok(new GenericResponse<>(category, "Data not found!", HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND.value()));
        }
        return ResponseEntity.ok(new GenericResponse<>(category, "Data found!", HttpStatus.OK, HttpStatus.OK.value()));
    }

    /* @GetMapping("/status")
    public ResponseEntity<GenericResponse<List<Category>>> status() {
        List<Category> category =  categoryService.findByStatusAndParentId(true, null);
        if(category == null) {
            return ResponseEntity.ok(new GenericResponse<>(category, "Data not found!", HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND.value()));
        }
        return ResponseEntity.ok(new GenericResponse<>(category, "Data found!", HttpStatus.OK, HttpStatus.OK.value()));
    } */

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }
}