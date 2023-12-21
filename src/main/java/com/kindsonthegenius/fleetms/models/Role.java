package com.kindsonthegenius.fleetms.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role extends Auditable<String>{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	private String description;
	private String details;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", description=" + description + ", details=" + details + "]";
	}

	public Role(Integer id, String description, String details) {
		super();
		this.id = id;
		this.description = description;
		this.details = details;
	}

	public Role() {
		super();
	}

}
