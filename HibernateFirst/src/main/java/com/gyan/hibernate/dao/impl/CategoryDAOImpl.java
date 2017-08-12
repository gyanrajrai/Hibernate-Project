/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.hibernate.dao.impl;

import com.gyan.hibernate.dao.CategoryDAO;
import com.gyan.hibernate.entity.Category;
import com.gyan.hibernate.generic.dao.impl.GenericDAOImpl;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository(value = "categoryDAO")
public class CategoryDAOImpl extends GenericDAOImpl<Category>implements CategoryDAO {

    @Override
    public List<Category> getAll() {
        List<Category> catList ;
        session = sessionFactory.openSession();
        catList = session.createQuery("SELECT c FROM Category c").list();
        session.close();
        return catList;
    }

}
