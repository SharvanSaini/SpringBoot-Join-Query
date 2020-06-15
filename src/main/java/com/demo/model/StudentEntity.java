package com.demo.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Student", schema = "dbo", catalog = "KSCDatabase")
@Table(name = "Student")
public class StudentEntity {	
  private int rollNumber;
  private String name;
  private int departmentId;
  private int age;
  private String email;
  
  @Id
  @Column(name = "rollNumber")
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	@Basic
  @Column(name = "Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Basic
  @Column(name = "DepartmentId")
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	@Basic
  @Column(name = "age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Basic
  @Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	}

	