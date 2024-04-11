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
			comment.setCreatedDate(resultSet.getTimestamp("createddate"));
			try {
				comment.setTitle(resultSet.getString("title"));
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
			return comment;
		} catch (SQLException e) {
			return null;
		}
	}
}