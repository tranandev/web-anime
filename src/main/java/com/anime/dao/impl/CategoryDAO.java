package com.anime.dao.impl;

import java.util.List;

import com.anime.dao.ICategoryDAO;
import com.anime.mapper.CategoryMapper;
import com.anime.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO{

	@Override
	public List<CategoryModel> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM category";
		List<CategoryModel> category = query(sql, new CategoryMapper());
		return category;
	}

}
