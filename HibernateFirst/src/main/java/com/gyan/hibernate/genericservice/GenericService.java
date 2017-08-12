/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.hibernate.genericservice;

import java.util.List;

/**
 *
 * @author Admin_GYAN
 * @param <T>
 */
public interface GenericService<T> {

    void insert(T t);

    void update(T t);

    void delete(int id);

    T getById(int id);

    List<T> getAll();

}
