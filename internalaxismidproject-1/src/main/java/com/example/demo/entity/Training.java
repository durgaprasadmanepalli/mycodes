 package com.example.demo.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Training {
	
	@Id
	int trainingnameid;
	
	@Column
	String trainingname;
	
	@Column
	Date starttrainingdate;
	
	@Column
	Date endtrainingdate;

	public int getTrainingnameid() {
		return trainingnameid;
	}

	public void setTrainingnameid(int trainingnameid) {
		this.trainingnameid = trainingnameid;
	}

	public String getTrainingname() {
		return trainingname;
	}

	public void setTrainingname(String trainingname) {
		this.trainingname = trainingname;
	}

	public Date getStarttrainingdate() {
		return starttrainingdate;
	}

	public void setStarttrainingdate(Date starttrainingdate) {
		this.starttrainingdate = starttrainingdate;
	}

	public Date getEndtrainingdate() {
		return endtrainingdate;
	}

	public void setEndtrainingdate(Date endtrainingdate) {
		this.endtrainingdate = endtrainingdate;
	}

	
}
