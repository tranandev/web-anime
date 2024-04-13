package com.anime.dao.impl;

import java.util.List;

import com.anime.dao.IBlogDAO;
import com.anime.mapper.BlogMapper;
import com.anime.model.BlogModel;

public class BlogDAO extends AbstractDAO<BlogModel> implements IBlogDAO {

	@Override
	public List<BlogModel> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM blog";
		List<BlogModel> blogs = query(sql, new BlogMapper());
		return blogs;
	}

}
