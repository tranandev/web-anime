package com.anime.service;

import java.util.List;

import com.anime.model.CommentModel;

public interface ICommentService {

	void createNewComment(CommentModel newComment);
	List<CommentModel> findByNewComment();

}
