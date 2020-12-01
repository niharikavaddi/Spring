package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Address;
import com.bean.Student;

public class SpringDemoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig.xml");
		/*
		 * Student student1 = (Student) applicationContext.getBean("student1"); Student
		 * student2 = (Student) applicationContext.getBean("student2"); Address address1
		 * = (Address) applicationContext.getBean("address1"); Address address2 =
		 * (Address) applicationContext.getBean("address2"); Address address3 =
		 * (Address) applicationContext.getBean("address3");
		 * System.out.println("------Constructor injection------");
		 * System.out.println("Student id: " + student1.getStudentid());
		 * System.out.println("Student name: " + student1.getStudentname());
		 * System.out.println("Housenumber: " + address1.getHousenumber());
		 * System.out.println("Streetnumber: " + address1.getStreetnumber());
		 * System.out.println("City: " + address1.getCity()); System.out.println();
		 * System.out.println("Student id: " + student2.getStudentid());
		 * System.out.println("Student name: " + student2.getStudentname());
		 * System.out.println("Housenumber: " + address2.getHousenumber());
		 * System.out.println("Streetnumber: " + address2.getStreetnumber());
		 * System.out.println("City: " + address2.getCity()); System.out.println();
		 * System.out.println("-------Setter injection------");
		 * System.out.println("Housenumber: " + address3.getHousenumber());
		 * System.out.println("Streetnumber: " + address3.getStreetnumber());
		 * System.out.println("City: " + address3.getCity());
		 */
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.getStudentname());
		System.out.println(student.getStudentid());
		List<Address> studentaddresses = (List<Address>) student.getAddresses();
		studentaddresses.stream().forEach(address -> System.out
				.println(address.getHousenumber() + " " + address.getStreetnumber() + " " + address.getCity()));
		((AbstractApplicationContext) applicationContext).registerShutdownHook();
	}

}
