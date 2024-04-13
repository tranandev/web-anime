package com.anime.dao;

import java.sql.Timestamp;
import java.util.List;

import com.anime.model.BlogModel;
import com.anime.paging.Pageble;

public interface IBlogDAO extends GenericDAO<BlogModel> {

	List<BlogModel> findAll();

	List<BlogModel> findAll(Pageble pageble);

	int getTotalItem();

	BlogModel findOneById(String id);

	void delete(String id);

	void createNewFilm(String title, String content, String author, Timestamp createdDate);

	void editFilm(Long id, String title, String content, String author, Timestamp modifiedDate);
}
