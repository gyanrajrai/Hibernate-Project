/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.hibernate.service.impl;

import com.gyan.hibernate.dao.CategoryDAO;
import com.gyan.hibernate.entity.Category;
import com.gyan.hibernate.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin_GYAN
 */
@Service(value = "categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public void insert(Category t) {
        categoryDAO.insert(t);
    }

    @Override
    public void update(Category t) {
        categoryDAO.update(t);
    }

    @Override
    public void delete(int id) {
        categoryDAO.delete(id);
    }

    @Override
    public Category getById(int id) {
        return categoryDAO.getById(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryDAO.getAll();
    }

}
