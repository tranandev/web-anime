package com.anime.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.anime.dao.IFilmDAO;
import com.anime.mapper.FilmMapper;
import com.anime.model.FilmModel;
import com.anime.paging.Pageble;

public class FilmDAO extends AbstractDAO<FilmModel> implements IFilmDAO {

	@Override
	public List<FilmModel> findAll(Pageble pageble) {
	
		StringBuilder sql = new StringBuilder("SELECT * FROM film");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName())
				&& StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
		}
		return query(sql.toString(), new FilmMapper());
	}

	@Override
	public List<FilmModel> findByTrending() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FilmModel> findByPopular() {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("SELECT * FROM film AS f");
		sql.append(" INNER JOIN category AS c ON f.id = c.id");
		sql.append(" ORDER BY view DESC LIMIT 6");
		List<FilmModel> films = query(sql.toString(), new FilmMapper());
		return films;

	}

	@Override
	public List<FilmModel> findByRate() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM film ORDER BY rate DESC LIMIT 6";
		List<FilmModel> films = query(sql, new FilmMapper());
		return films;
	}

	@Override
	public void createNewFilm(String title, Integer categoryId, String photo, Integer episode, Integer currentEpisode,
			Timestamp createddate) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO film(title, categoryid, photo, view, episode, current_episode, rate, createddate) VALUES(?, ?, ?, 0, ?, ?, 0, ?)";
		update(sql, title, categoryId, photo, episode, currentEpisode, createddate);
	}

	@Override
	public FilmModel findOneById(String id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM film WHERE id = ?";
		List<FilmModel> film = query(sql, new FilmMapper(), id);
		return film.isEmpty() ? null : film.get(0);
	}

	@Override
	public void editFilm(Long id, String title, Integer categoryId, String photo, Integer episode, Integer currentEpisode, Timestamp modifiedDate) {
		// TODO Auto-generated method stub

		StringBuilder sql = new StringBuilder("UPDATE film");
		sql.append(" SET title = ?, categoryid = ?, episode = ?, current_episode = ?, modifieddate = ?, photo = ?");
		sql.append(" WHERE id = ?");
		update(sql.toString(), title, categoryId, episode, currentEpisode, modifiedDate, photo, id);
	}

	@Override
	public List<FilmModel> findAll() {
		// TODO Auto-generated method stub
		
		  String sql = "SELECT * FROM film";
		  List<FilmModel> films = query(sql, new FilmMapper());
		  return films;
		 
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		String sql = "SELECT count(*) FROM film";
		return count(sql);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM film WHERE id = ?";
		update(sql, id);
	}


}
