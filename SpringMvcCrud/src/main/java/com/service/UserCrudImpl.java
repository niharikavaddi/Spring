package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DaoUserCrud;
import com.exception.CustomException;
import com.model.User;

@Service("userCrud")
public class UserCrudImpl implements UserCrud {
	@Autowired
	private DaoUserCrud daoUserCrud;

	@Override
	public User createUser(User user) throws CustomException {
		System.out.println("came");
		return daoUserCrud.createUser(user);
	}

	@Override
	public User readUser(String userName) throws CustomException {
		return daoUserCrud.readUser(userName);

	}

	@Override
	public User updateUser(User user1, User user2) throws CustomException {
		return daoUserCrud.updateUser(user1, user2);
	}

	@Override
	public String deleteUser(User user) throws CustomException {
		return daoUserCrud.deleteUser(user);
	}
}
