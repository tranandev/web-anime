package com.anime.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.anime.model.CommentModel;

public class CommentMapper implements RowMapper<CommentModel> {

	@Override
	public CommentModel mapRow(ResultSet resultSet) {
		try {
			CommentModel comment = new CommentModel();
			comment.setContent(resultSet.getString("content"));
			comment.setFullName(resultSet.getString("fullname"));
			comment.setPhoto(resultSet.getString("photo"));
			return comment;
		} catch (SQLException e) {
			return null;
		}
	}
}