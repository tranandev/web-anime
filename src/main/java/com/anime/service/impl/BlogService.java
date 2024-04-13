package com.anime.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.anime.dao.IBlogDAO;
import com.anime.model.BlogModel;
import com.anime.paging.Pageble;
import com.anime.service.IBlogService;

public class BlogService implements IBlogService {
	
	@Inject
	IBlogDAO blogDAO;

	@Override
	public List<BlogModel> findAll() {
		// TODO Auto-generated method stub
		return blogDAO.findAll();
	}

	@Override
	public List<BlogModel> findAll(Pageble pageble) {
		// TODO Auto-generated method stub
		return blogDAO.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return blogDAO.getTotalItem();
	}

	@Override
	public BlogModel findOneById(String id) {
		// TODO Auto-generated method stub
		return blogDAO.findOneById(id);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		blogDAO.delete(id);
	}

}
