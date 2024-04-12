package com.anime.dao;

import java.sql.Timestamp;
import java.util.List;

import com.anime.model.CommentModel;
import com.anime.model.FilmModel;
import com.anime.paging.Pageble;

public interface IFilmDAO extends GenericDAO<FilmModel> {

	FilmModel findOneById(String id);

	List<FilmModel> findAll(Pageble pageble);

	List<FilmModel> findAll();

	List<FilmModel> findByTrending();

	List<FilmModel> findByPopular();

	List<FilmModel> findByRate();

	List<FilmModel> findByRecentlyAdd();

	void createNewFilm(String title, Integer categoryId, String photo, Integer episode, Integer currentEpisode,
			Timestamp createddate);

	void editFilm(Long id, String title, Integer categoryId, String photo, Integer episode, Integer currentEpisode,
			Timestamp modifieddate);

	int getTotalItem();

	void delete(String id);

	List<CommentModel> findCommentByFilmId(String id);
}
