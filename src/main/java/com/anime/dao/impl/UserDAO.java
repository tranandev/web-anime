package com.anime.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import com.anime.dao.IUserDAO;
import com.anime.mapper.UserMapper;
import com.anime.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		StringBuilder sql = new StringBuilder("SELECT * FROM user AS u");
		sql.append(" INNER JOIN role AS r ON r.id = u.roleid");
		sql.append(" WHERE username = ? AND password = ? AND status = ?");
		List<UserModel> users = query(sql.toString(), new UserMapper(), userName, password, status);
		return users.isEmpty() ? null : users.get(0);
	}

	@Override
	public void createNewUser(String userName, String password, String email, Timestamp createdDate) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO user(username, password, email, status, roleid, createddate) VALUES(?, ?, ?, 1, 1, ?)";
		update(sql, userName, password, email, createdDate);
	}

	@Override
	public boolean findByUserName(String userName) {

		String sql = "SELECT * FROM user WHERE username = ?";
		List<UserModel> user = query(sql, new UserMapper(), userName);
		return !user.isEmpty();
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM user";
		List<UserModel> users = query(sql, new UserMapper());
		return users;
	}

	@Override
	public UserModel findById(String id) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("SELECT * FROM user AS u");
		sql.append(" INNER JOIN role AS r ON r.id = u.roleid");
		sql.append(" WHERE id = ?");
		List<UserModel> users = query(sql.toString(), new UserMapper(), id);
		return users.isEmpty() ? null : users.get(0);
	}

}
