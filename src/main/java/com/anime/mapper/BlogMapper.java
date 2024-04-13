package com.anime.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.anime.model.BlogModel;

public class BlogMapper implements RowMapper<BlogModel>{

	@Override
	public BlogModel mapRow(ResultSet resultSet) {
		// TODO Auto-generated method stub
		try {
			BlogModel blog = new BlogModel();
			blog.setId(resultSet.getLong("id"));
			blog.setTitle(resultSet.getString("title"));
			blog.setContent(resultSet.getString("content"));
			blog.setAuthor(resultSet.getString("author"));
			blog.setPhoto(resultSet.getString("photo"));
			return blog;
		} catch (SQLException e) {
			return null;
		}
	}

}
