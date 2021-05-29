package com.empManager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
   @Id @GeneratedValue (strategy=GenerationType.AUTO) 
	private Long  id;
	private String name;
	private String phone;
	private String email;
	private String jobTitle;
	private String imageURL;
	public Employee() {
		
		
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", jobTitle="
				+ jobTitle + ", imageURL=" + imageURL + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getJobTitle()=" + getJobTitle()
				+ ", getImageURL()=" + getImageURL() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

}
