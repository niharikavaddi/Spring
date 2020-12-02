package com.dao;

import java.util.List;

import com.exception.CustomException;
import com.bean.User;

public interface DaoUserCrud {

	List<User> readUser() throws CustomException;
}
