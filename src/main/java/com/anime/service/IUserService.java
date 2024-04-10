package com.anime.service;

import java.util.List;

import com.anime.model.UserModel;

public interface IUserService {
	List<UserModel> findAll();
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
	void createNewUser(String userName, String password, String email);
	boolean findByUserName(String username);
	UserModel findById(String id);
}
