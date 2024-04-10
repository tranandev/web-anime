package com.anime.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.anime.dao.ICategoryDAO;
import com.anime.model.CategoryModel;
import com.anime.service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDAO categoryDAO;

	@Override
	public List<CategoryModel> findAll() {
		// TODO Auto-generated method stub
		return categoryDAO.findAll();
	}

}
