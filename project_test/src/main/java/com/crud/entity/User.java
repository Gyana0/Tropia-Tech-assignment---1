package com.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	  @Id
	  @GeneratedValue(strategy = GenerationType.TABLE)
	  private Long id;
	  
	  @Column(name="first_name")
	  private String firstName;
	  
	  @Column(name="last_name")
	  private String lastName;
	  
	  @Column(name="DOB")
	  private String dateOfBirth;
	  
	  @Column(name="username",unique=true,nullable=false)
	  private String username;
	  
	  @Column(name="email_id",unique=true,nullable=false)
	  private String email;
	  
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	  
}
