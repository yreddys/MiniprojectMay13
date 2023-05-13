package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JVD {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private int land;
	private int attendance;
	private String email;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLand() {
		return land;
	}
	public void setLand(int land) {
		this.land = land;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public JVD(int id, String name, int age, int land, int attendance, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.land = land;
		this.attendance = attendance;
		this.email = email;
	}
	
	JVD(){}
	@Override
	public String toString() {
		return "JVD [id=" + id + ", name=" + name + ", age=" + age + ", land=" + land + ", attendance=" + attendance
				+ ", email=" + email + "]";
	}
	
	
	
}
