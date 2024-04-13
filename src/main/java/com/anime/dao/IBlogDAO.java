package com.anime.dao;

import java.util.List;

import com.anime.model.BlogModel;
import com.anime.paging.Pageble;

public interface IBlogDAO extends GenericDAO<BlogModel> {

	List<BlogModel> findAll();

	List<BlogModel> findAll(Pageble pageble);

	int getTotalItem();

	BlogModel findOneById(String id);

	void delete(String id);
}
