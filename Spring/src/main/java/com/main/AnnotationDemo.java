package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

public class AnnotationDemo {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/annotationdemo.xml");
		Employee employee1 = (Employee) applicationContext.getBean("employee");
		System.out.println(employee1.getEmpnum() + " " + employee1.getEmpname());

		Employee employee2 = (Employee) applicationContext.getBean("emp");
		System.out.println(employee2.getEmpnum() + " " + employee2.getEmpname());

	}

}
