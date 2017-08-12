/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.hibernate.generic.dao;

import java.util.List;

/**
 *
 * @author Admin_GYAN
 */
public interface GenericDAO<T> {

    void insert(T t);

    void update(T t);

    void delete(int id);

    T getById(int id);

    List<T> getAll();

}
