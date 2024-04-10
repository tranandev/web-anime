package com.anime.dao;

import java.sql.Timestamp;
import java.util.List;

import com.anime.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel> {
	
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
	void createNewUser(String userName, String password, String email, Timestamp createdDate);
	boolean  findByUserName(String userName);
	List<UserModel> findAll();
	UserModel findById(String id);
}
