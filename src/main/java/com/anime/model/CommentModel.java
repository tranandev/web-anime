package com.anime.model;

import java.sql.Timestamp;

public class CommentModel extends AbstractModel{

	private String content;
	private String fullName;
	private String title;
	private Long userId;
	private Long filmId;
	private Timestamp minutesAgo;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getFilmId() {
		return filmId;
	}
	public void setFilmId(Long filmId) {
		this.filmId = filmId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Timestamp getMinutesAgo() {
		return minutesAgo;
	}
	public void setMinutesAgo(Timestamp minutesAgo) {
		this.minutesAgo = minutesAgo;
	}
	
	
}
