package com.tnsif.client;

import com.tnsif.entities.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;

public class Client{
	public static void main(String[] args) {
		//Debug this program as Debug -> Debug as Java

		StudentService service = new StudentServiceImpl();

		Student student = new Student();
		// Create Operation
		student.setStudentId(500);
		student.setName("Faiyz");
		student.setStudentId(600);
		student.setName("Abdul");
		service.addStudent(student);

		
	}
}
