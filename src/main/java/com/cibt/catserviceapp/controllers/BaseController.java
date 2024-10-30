package com.cibt.catserviceapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public abstract class BaseController<T, Type> {

    protected String viewPage;
    protected String baseUrl;
    protected String path = "/";

    @Autowired
    protected JpaRepository<T, Type> jpaRepository;
    
    public String index(Model model) {
        System.out.println("I am here!");
        model.addAttribute("records", jpaRepository.findAll());
        return path + "/index";
    }
}