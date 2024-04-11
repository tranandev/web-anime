package com.anime.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.anime.model.FilmModel;

public class FilmMapper implements RowMapper<FilmModel> {

	@Override
	public FilmModel mapRow(ResultSet resultSet) {
		try {
			FilmModel film = new FilmModel();
			film.setId(resultSet.getLong("id"));
			film.setTitle(resultSet.getString("title"));
			film.setCategoryId(resultSet.getInt("categoryid"));
			film.setPhoto(resultSet.getString("photo"));
			film.setFile(resultSet.getString("file"));
			film.setShortdescription(resultSet.getString("shortdescription"));
			film.setType(resultSet.getString("type"));
			film.setStudio(resultSet.getString("studio"));
			film.setDuration(resultSet.getString("duration"));
			film.setView(resultSet.getInt("view"));
			film.setEpisode(resultSet.getInt("episode"));
			film.setCurrentEpisode(resultSet.getInt("current_episode"));
			film.setRate(resultSet.getInt("rate"));
			 try {
				 film.setCategoryName(resultSet.getString("name"));
			 } catch (Exception e) {
				 
			 }
			return film;
		} catch (SQLException e) {
			return null;
		}
	}

}
