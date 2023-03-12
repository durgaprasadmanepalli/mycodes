package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Learnings;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin
public class Controller {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/learnings")
	public Student learnings1(@RequestBody Learnings ler)
	{
		return ss.learnings(ler);
	}
	
	@GetMapping("/learnings")
	public List<Student> getAllLearnings1()
	{
		return ss.getAllLearnings();
	}
	@GetMapping("/learnings/{name}")
	public Student getAllLearnings2(@PathVariable String name)
	{
		return ss.learnings1(name);
		
	}
	@PutMapping("/learnings/update{id}")
	public Student learnings2(@RequestBody Learnings ler,@PathVariable int id) 
	{
		return ss.update(ler,id);
	}
	@DeleteMapping("/learnings/{id}")
	public void delete1(@PathVariable int id) {
       ss.delete(id);
		
	}
	

}