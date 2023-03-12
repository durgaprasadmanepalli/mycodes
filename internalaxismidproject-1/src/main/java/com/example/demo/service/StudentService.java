package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Learnings;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.TrainingRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository sr;
	
	@Autowired
	TrainingRepository tr;
	 public Student learnings(Learnings ler)
	 {
		 return sr.save(ler.getStu());
		 
	 }
	 public List<Student> getAllLearnings()
	 {
		return sr.findAll(); 
	 }
	 public Student update(Learnings ler,int id)
	 {
		 return sr.save(ler.getStu());
	 }
	 public void delete(int id) 
	 {
		 
		 sr.deleteById(id);
	 }
	 public Student learnings1(String name)
	 {
		 return sr.searchStudentByName(name);
	 }
}
