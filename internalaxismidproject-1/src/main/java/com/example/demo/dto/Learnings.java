package com.example.demo.dto;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;

public class Learnings {
	
	
	@Autowired
	Student stu;

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	


}