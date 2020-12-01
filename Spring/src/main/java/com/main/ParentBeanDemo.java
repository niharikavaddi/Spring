package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.A;
import com.bean.B;

public class ParentBeanDemo {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/parentdemo.xml");
		// A a = (A) applicationContext.getBean("a");
		B b = (B) applicationContext.getBean("b");
		// System.out.println(a.getName() + " " + a.getRoll());
		System.out.println(b.getName() + " " + b.getRoll() + " " + b.getCity());
		((AbstractApplicationContext) applicationContext).registerShutdownHook();
	}

}
