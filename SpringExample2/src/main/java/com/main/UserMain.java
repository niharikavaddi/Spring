package com.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;
import com.exception.CustomException;
import com.service.UserCrud;

public class UserMain {
	@Autowired
	private UserCrud userCrud;

	public static void main(String[] args) {
		try {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/userconfig.xml");
			UserCrud userCrud = (UserCrud) applicationContext.getBean("userCrud");
			List<User> users = userCrud.readUser();
			users.stream().forEach(user -> System.out.println(user.getUserName() + " " + user.getPassword()));
			((AbstractApplicationContext) applicationContext).registerShutdownHook();
		} catch (CustomException ce) {
			System.out.println(ce.getMessage());
		}
	}

}
