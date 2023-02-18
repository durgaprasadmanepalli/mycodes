package com.axis.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String name;
    private String parentPhoneNumber;
    private String address;

    public Student(String name, String parentPhoneNumber, String address) {
        this.name = name;
        this.parentPhoneNumber = parentPhoneNumber;
        this.address = address;
    }
    // getters and setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentPhoneNumber() {
		return parentPhoneNumber;
	}

	public void setParentPhoneNumber(String parentPhoneNumber) {
		this.parentPhoneNumber = parentPhoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

