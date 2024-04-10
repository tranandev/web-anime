package com.anime.service.impl;

import java.security.MessageDigest;
import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.anime.dao.IUserDAO;
import com.anime.model.UserModel;
import com.anime.service.IUserService;


public class UserService implements IUserService {

	@Inject
	private IUserDAO userDAO;
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		try {
			String hashed = hashPassword(password);
			return userDAO.findByUserNameAndPasswordAndStatus(userName, hashed, status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void createNewUser(String userName, String password, String email) {
		// TODO Auto-generated method stub
		try {
			String hashed = hashPassword(password);
			Timestamp createdDate = new Timestamp(System.currentTimeMillis());
			userDAO.createNewUser(userName, hashed, email, createdDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDAO.findByUserName(userName);

	}
	
	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	@Override
	public UserModel findById(String id) {
		// TODO Auto-generated method stub
		return userDAO.findById(id);
	}

	
	private String hashPassword(String password) throws Exception {
		String SALT = "my_salt_value"; // SALT value for additional security
		try {
			// Append the SALT value to the password
			String passwordWithSalt = password + SALT;

			// Create a MessageDigest instance for SHA-256
			MessageDigest digest = MessageDigest.getInstance("SHA-256");

			// Perform hashing
			byte[] hashBytes = digest.digest(passwordWithSalt.getBytes("UTF-8"));

			// Convert byte array to hexadecimal string
			StringBuilder hexString = new StringBuilder();
			for (byte hashByte : hashBytes) {
				String hex = Integer.toHexString(0xff & hashByte);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString().substring(0, 32);
		} catch (Exception ex) {
			// Handle exception
			throw new Exception("Error hashing password: " + ex.getMessage());
		}
	}
}
