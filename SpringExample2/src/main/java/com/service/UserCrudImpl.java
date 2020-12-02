package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DaoUserCrud;
import com.exception.CustomException;
import com.bean.User;

@Service("userCrud")
public class UserCrudImpl implements UserCrud {
	@Autowired
	private DaoUserCrud daoUserCrud;

	public List<User> readUser() throws CustomException {
		return daoUserCrud.readUser();
	}

}
