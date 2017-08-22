package com.nisum.model;

import org.springframework.data.annotation.Id;


public class Employee {

	
	@Id
    private String id;

    private String name;
    private String position;
    private int exp;
    private int age;
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String id, String name, String position, int exp, int age) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.exp = exp;
		this.age = age;
	}

	

    public Employee() {}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", exp=" + exp + ", age=" + age
				+ "]";
	}

	

   /** public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
**/
   

}

