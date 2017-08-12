/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.hibernate.dao.impl;

import com.gyan.hibernate.dao.ProductDAO;
import com.gyan.hibernate.entity.Product;
import com.gyan.hibernate.generic.dao.impl.GenericDAOImpl;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository(value = "productDAO")
public class ProductDAOImpl extends GenericDAOImpl<Product>implements ProductDAO  {

    @Override
    public List<Product> getAll() {
        List<Product> proList ;
        session = sessionFactory.openSession();
        proList = session.createQuery("SELECT p FROM Product p").list();
        session.close();
        return proList;
    }

}
