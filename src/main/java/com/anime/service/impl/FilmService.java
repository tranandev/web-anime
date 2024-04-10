package com.anime.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.anime.dao.IFilmDAO;
import com.anime.model.FilmModel;
import com.anime.paging.Pageble;
import com.anime.service.IFilmService;

public class FilmService implements IFilmService {

	@Inject
	private IFilmDAO filmDAO;

	@Override
	public List<FilmModel> findAll(Pageble pageble) {
		// TODO Auto-generated method stub
		return filmDAO.findAll(pageble);
	}

	@Override
	public List<FilmModel> findByTrending() {
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public List<FilmModel> findByPopular() {
		// TODO Auto-generated method stub
		return filmDAO.findByPopular();
	}

	@Override
	public List<FilmModel> findByRate() {
		// TODO Auto-generated method stub
		return filmDAO.findByRate();
	}

	@Override
	public void createNewFilm(FilmModel film) {
		film.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		filmDAO.createNewFilm(film.getTitle(), film.getCategoryId(), film.getPhoto(), film.getEpisode(), film.getCurrentEpisode(), film.getCreatedDate());
	}

	@Override
	public FilmModel findOneById(String id) {
		// TODO Auto-generated method stub
		return filmDAO.findOneById(id);
	}

	@Override
	public void editFilm(FilmModel film) {
		// TODO Auto-generated method stub
		film.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		filmDAO.editFilm(film.getId(), film.getTitle(), film.getCategoryId(), film.getPhoto(), film.getEpisode(), film.getCurrentEpisode(), film.getModifiedDate());
	}

	@Override
	public List<FilmModel> findAll() {
		// TODO Auto-generated method stub
		return filmDAO.findAll();
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return filmDAO.getTotalItem();
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		filmDAO.delete(id);
	}


}
