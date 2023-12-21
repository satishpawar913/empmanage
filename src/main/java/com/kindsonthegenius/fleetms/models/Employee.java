package com.kindsonthegenius.fleetms.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee extends Person {

	@ManyToOne
	@JoinColumn(name = "employeetypeid", insertable = false, updatable = false)
	private EmployeeType employeeType;
	private Integer employeetypeid;
	private String photo;
	private String username;
	private String firstname;
	private String lastname;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	@ManyToOne
	@JoinColumn(name = "jobtitleid", insertable = false, updatable = false)
	private JobTitle jobTitle;
	private Integer jobtitleid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;

}
