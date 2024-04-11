package com.anime.service;

import java.util.List;

import com.anime.model.CommentModel;
import com.anime.model.FilmModel;
import com.anime.paging.Pageble;

public interface IFilmService {
	
	FilmModel findOneById(String id);
	List<FilmModel> findAll(Pageble pageble);
	List<FilmModel> findAll();
	List<FilmModel> findByTrending();
	List<FilmModel> findByPopular();
	List<FilmModel> findByRate();
	List<FilmModel> findByRecentlyAdd();
	void createNewFilm(FilmModel filmModel);
	void editFilm(FilmModel filmModel);
	int getTotalItem();
	void delete(String id);
	List<CommentModel> findCommentByFilmId(String id);
}
