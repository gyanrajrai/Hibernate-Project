/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.hibernate.controller.admin;

import com.gyan.hibernate.dto.CategoryDTO;
import com.gyan.hibernate.entity.Category;
import com.gyan.hibernate.service.CategoryService;
import com.gyan.hibernate.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Admin_GYAN
 */
@Controller
@RequestMapping(value = "/admin/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("categories", categoryService.getAll());
        return "admin/category/index";
    }
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("CategoryDTO")CategoryDTO categoryDTO){
        ModelMapper mapper=new ModelMapper();
        Category category=mapper.map(categoryDTO, Category.class);
        categoryService.insert(category);
        return categoryDTO.getName()+"success";
    }
    
}
