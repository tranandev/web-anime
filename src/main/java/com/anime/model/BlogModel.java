package com.anime.model;

import java.sql.Timestamp;

public class BlogModel extends AbstractModel {

	private String title;
	private String content;
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

}
