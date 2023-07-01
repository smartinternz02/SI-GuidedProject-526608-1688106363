package com.smartintern.Doctor_Appointment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class Patient_Data {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String username;
	private String password;
	private String mobile;
	private String gender;
	private String symptoms;
	private String age;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient_Data [username=" + username + ", password=" + password + ", mobile=" + mobile + ", gender="
				+ gender + ", symptoms=" + symptoms + ", age=" + age + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getMobile()=" + getMobile() + ", getGender()=" + getGender()
				+ ", getSymptoms()=" + getSymptoms() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
