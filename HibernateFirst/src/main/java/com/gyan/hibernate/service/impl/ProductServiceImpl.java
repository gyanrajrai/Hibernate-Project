/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.hibernate.service.impl;

import com.gyan.hibernate.dao.ProductDAO;
import com.gyan.hibernate.entity.Product;
import com.gyan.hibernate.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin_GYAN
 */
@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public void insert(Product t) {
        productDAO.insert(t);
    }

    @Override
    public void update(Product t) {
        productDAO.update(t);
    }

    @Override
    public void delete(int id) {
        productDAO.delete(id);
    }

    @Override
    public Product getById(int id) {
        return productDAO.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productDAO.getAll();
    }

}
