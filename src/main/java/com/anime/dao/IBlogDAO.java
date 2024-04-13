package com.anime.dao;

import java.util.List;

import com.anime.model.BlogModel;

public interface IBlogDAO extends GenericDAO<BlogModel> {

	List<BlogModel> findAll();
}
