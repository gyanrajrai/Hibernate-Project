/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.hibernate.generic.dao.impl;

import com.gyan.hibernate.generic.dao.GenericDAO;
import java.lang.reflect.ParameterizedType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Admin_GYAN
 */
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

    @Autowired
    protected SessionFactory sessionFactory;
    protected Session session;
    protected Transaction transaction;
    protected Class<T> persistentClass;

    public GenericDAOImpl() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    }

    @Override
    public void insert(T t) {
        session = sessionFactory.openSession();
        transaction = session.getTransaction();
        transaction.begin();
        session.save(t);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(T t) {
        session = sessionFactory.openSession();
        transaction = session.getTransaction();
        transaction.begin();
        session.update(t);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        session = sessionFactory.openSession();
        transaction = session.getTransaction();
        transaction.begin();
        session.delete(session.get(persistentClass, id));
        transaction.commit();
        session.close();
    }

    @Override
    public T getById(int id) {
        session = sessionFactory.openSession();
        T obj = (T) session.get(persistentClass, id);
        session.close();
        return obj;
    }

    

}
