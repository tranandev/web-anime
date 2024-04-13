package com.anime.service;

import java.util.List;

import com.anime.model.BlogModel;
import com.anime.paging.Pageble;

public interface IBlogService {

	List<BlogModel> findAll();

	List<BlogModel> findAll(Pageble pageble);

	int getTotalItem();

	BlogModel findOneById(String id);

	void delete(String id);

	void createNewFilm(BlogModel blog);

	void editFilm(BlogModel blog);
	
	
}
