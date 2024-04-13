package com.anime.model;

import java.sql.Timestamp;

public class BlogModel extends AbstractModel {

	private String title;
	private String content;
	private String shortDescription;
	private String author;
	private Timestamp minutesAgo;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
