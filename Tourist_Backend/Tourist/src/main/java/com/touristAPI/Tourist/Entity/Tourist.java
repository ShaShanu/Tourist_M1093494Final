package com.touristAPI.Tourist.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tourist {
	
	@Id
	private int id;
	private String firstName,lastName,gender,fromPlace;
	private int age, numberOfDaysVisit;
	
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Tourist(int id, String firstName, String lastName, String gender, String fromPlace, int age,
			int numberOfDaysVisit) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.fromPlace = fromPlace;
		this.age = age;
		this.numberOfDaysVisit = numberOfDaysVisit;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumberOfDaysVisit() {
		return numberOfDaysVisit;
	}
	public void setNumberOfDaysVisit(int numberOfDaysVisit) {
		this.numberOfDaysVisit = numberOfDaysVisit;
	}
}
