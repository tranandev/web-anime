package com.anime.dao;

import java.sql.Timestamp;

import com.anime.model.CommentModel;

public interface ICommentDAO extends GenericDAO<CommentModel>{

	void createNewComment(String content, Long userid, Long filmid, Timestamp createdDate);

}
