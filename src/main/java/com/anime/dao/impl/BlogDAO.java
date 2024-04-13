package com.anime.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.anime.dao.IBlogDAO;
import com.anime.mapper.BlogMapper;
import com.anime.model.BlogModel;
import com.anime.paging.Pageble;

public class BlogDAO extends AbstractDAO<BlogModel> implements IBlogDAO {

	@Override
	public List<BlogModel> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM blog";
		List<BlogModel> blogs = query(sql, new BlogMapper());
		return blogs;
	}

	@Override
	public List<BlogModel> findAll(Pageble pageble) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("SELECT * FROM blog");
		if (pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName())
				&& StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" ORDER BY " + pageble.getSorter().getSortName() + " " + pageble.getSorter().getSortBy() + "");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT " + pageble.getOffset() + ", " + pageble.getLimit() + "");
		}
		return query(sql.toString(), new BlogMapper());
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		String sql = "SELECT count(*) FROM blog";
		return count(sql);
	}

	@Override
	public BlogModel findOneById(String id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM blog WHERE id = ?";
		List<BlogModel> blog = query(sql, new BlogMapper(), id);
		return blog.isEmpty() ? null : blog.get(0);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM blog WHERE id = ?";
		update(sql, id);
	}

	@Override
	public void createNewFilm(String title, String content, String author, Timestamp createdDate) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO blog(title, content, author, createddate) VALUES(?, ?, ?, ?)";
		update(sql, title, content, author, createdDate);
	}

	@Override
	public void editFilm(Long id, String title, String content, String author, Timestamp modifiedDate) {
		// TODO Auto-generated method stub

		StringBuilder sql = new StringBuilder("UPDATE blog");
		sql.append(" SET title = ?, content = ?, author = ?, modifieddate = ?");
		sql.append(" WHERE id = ?");
		update(sql.toString(), title, content, author, modifiedDate, id);
	}

}
