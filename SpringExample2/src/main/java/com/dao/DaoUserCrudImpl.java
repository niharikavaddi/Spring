package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.bean.User;
import com.exception.CustomException;

@Repository("daoUserCrud")
public class DaoUserCrudImpl implements DaoUserCrud {

	public List<User> readUser() throws CustomException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		User user = null;
		List<User> users = null;
		try {
			connection = DatabaseConnection.Connect();
			String query1 = "select * from logindetails order by username";
			statement = connection.createStatement();
			resultset = statement.executeQuery(query1);
			users = new ArrayList<User>();
			if (resultset != null) {
				while (resultset.next()) {
					user = new User();
					user.setUserName(resultset.getString(1));
					user.setPassword(resultset.getString(2));
					users.add(user);
					user = null;
				}
			} else {
				throw new CustomException("No Data Available");
			}
			resultset.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			throw new CustomException(e.getMessage());
		}
		return users;
	}

}
