package com.finalassignment.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@MappedSuperclass
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Person implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;

	@Formula(value = " concat(firstName, ' ', lastName) ")
	private String fullName;

	private String title;
	private String initials;
	private String socialSecurityNumber;
	private String gender;
	private String maritalStatus;

	@ManyToOne
	@JoinColumn(name = "countryid", insertable = false, updatable = false)
	private Country country;
	private Integer countryid;

	@ManyToOne
	@JoinColumn(name = "stateid", insertable = false, updatable = false)
	private State state;
	private Integer stateid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	private String city;
	private String address;
	private String phone;
	private String mobile;
	private String email;
	private String photo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Integer getStateid() {
		return stateid;
	}

	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstname=" + firstName + ", lastname=" + lastName + ","
				+ ", fullName=" + fullName + ", title=" + title + ", initials=" + initials + ", socialSecurityNumber="
				+ socialSecurityNumber + ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", country="
				+ country + ", countryid=" + countryid + ", state=" + state + ", stateid=" + stateid + ", dateOfBirth="
				+ dateOfBirth + ", city=" + city + ", address=" + address + ", phone=" + phone + ", mobile=" + mobile
				+ ", email=" + email + ", photo=" + photo + "]";
	}

	public Person(Integer id, String firstname, String lastname, String othername, String fullName, String title,
			String initials, String socialSecurityNumber, String gender, String maritalStatus, Country country,
			Integer countryid, State state, Integer stateid, Date dateOfBirth, String city, String address,
			String phone, String mobile, String email, String photo) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
		this.fullName = fullName;
		this.title = title;
		this.initials = initials;
		this.socialSecurityNumber = socialSecurityNumber;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.country = country;
		this.countryid = countryid;
		this.state = state;
		this.stateid = stateid;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.photo = photo;
	}

	public Person() {
		super();
	}

}
