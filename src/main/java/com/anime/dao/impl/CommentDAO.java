package com.anime.dao.impl;

import java.sql.Timestamp;

import com.anime.dao.ICommentDAO;
import com.anime.model.CommentModel;

public class CommentDAO extends AbstractDAO<CommentModel> implements ICommentDAO{

	@Override
	public void createNewComment(String content, Long userid, Long filmid, Timestamp createdDate) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO comment(content, user_id, film_id, createddate) VALUES(?, ?, ?, ?)";
		update(sql, content, userid, filmid, createdDate);
	}

}
