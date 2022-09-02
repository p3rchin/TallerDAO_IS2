package co.edu.unbosque.model;

import java.io.Serializable;

public class Person implements Serializable{

	private String name;
	private String lastName;
	private String age;
	private String sex;
	private String id;
	private String country;
	private String telephone;
	private String email;
	
	public Person() {
		
	}

	public Person(String name, String lastName, String age, String sex, String id, String country, String telephone, String email) {
	
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
		this.id = id;
		this.country = country;
		this.telephone = telephone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
