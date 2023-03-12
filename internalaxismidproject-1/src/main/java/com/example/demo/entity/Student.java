package com.example.demo.entity;


import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue
	int id;
	
	@Column
	String name;
	
	
	@Column
	String Assignedfacultyname;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssignedfacultyname() {
		return Assignedfacultyname;
	}

	public void setAssignedfacultyname(String assignedfacultyname) {
		Assignedfacultyname = assignedfacultyname;
	}


	@OneToMany(targetEntity=Training.class,cascade=CascadeType.ALL)
	@JoinColumn(name="studentid",referencedColumnName="id")
	List<Training>training;

	public List<Training> getTraining() {
		return training;
	}

	public void setTraining(List<Training> training) {
		this.training = training;
	}
	
	
}
	