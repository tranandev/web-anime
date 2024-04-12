package com.anime.dao;

import java.util.List;

import com.anime.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
    
    List<CategoryModel> findAll();
}
