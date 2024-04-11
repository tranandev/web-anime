package com.anime.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.anime.dao.ICommentDAO;
import com.anime.model.CommentModel;
import com.anime.service.ICommentService;

public class CommentService implements ICommentService{
	
	@Inject
	ICommentDAO commentDAO;

	@Override
	public void createNewComment(CommentModel newComment) {
		// TODO Auto-generated method stub
		newComment.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		commentDAO.createNewComment(newComment.getContent(), newComment.getUserId(), newComment.getFilmId(), newComment.getCreatedDate());
	}

	@Override
	public List<CommentModel> findByNewComment() {
		// TODO Auto-generated method stub
		return commentDAO.findByNewComment();
	}

}
