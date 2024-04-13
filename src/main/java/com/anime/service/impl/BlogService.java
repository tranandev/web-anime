package com.anime.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.anime.dao.IBlogDAO;
import com.anime.model.BlogModel;
import com.anime.service.IBlogService;

public class BlogService implements IBlogService {
	
	@Inject
	IBlogDAO blogDAO;

	@Override
	public List<BlogModel> findAll() {
		// TODO Auto-generated method stub
		return blogDAO.findAll();
	}

}
