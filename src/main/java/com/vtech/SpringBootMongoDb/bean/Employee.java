package com.vtech.SpringBootMongoDb.bean;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	private  String id = UUID.randomUUID().toString();
	private String name;
	private String email;
	private Address address;
	private List<String> skills;

	public Employee(String id, String name, String email, Address address, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.skills = skills;
	}

	public Employee() {
		super();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Address getAddress() {
		return address;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", skills="
				+ skills + "]";
	}

}
