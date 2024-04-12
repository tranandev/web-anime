package com.anime.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import com.anime.dao.ICommentDAO;
import com.anime.mapper.CommentMapper;
import com.anime.model.CommentModel;

public class CommentDAO extends AbstractDAO<CommentModel> implements ICommentDAO {

	@Override
	public void createNewComment(String content, Long userid, Long filmid, Timestamp createdDate) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO comment(content, user_id, film_id, createddate) VALUES(?, ?, ?, ?)";
		update(sql, content, userid, filmid, createdDate);
	}

	@Override
	public List<CommentModel> findByNewComment() {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder(
				"SELECT c.content, f.title, u.fullname, f.photo, c.createddate FROM comment AS c");
		sql.append(" INNER JOIN user AS u ON u.id = c.user_id");
		sql.append(" INNER JOIN film AS f ON f.id = c.film_id");
		sql.append(" ORDER BY c.createddate DESC LIMIT 4");
		return query(sql.toString(), new CommentMapper());
	}

}
