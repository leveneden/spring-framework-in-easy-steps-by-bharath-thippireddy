package org.example;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public int getId() {
		return id;
	}

	public Employee setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Employee setName(String name) {
		this.name = name;
		return this;
	}

	public int getSalary() {
		return salary;
	}

	public Employee setSalary(int salary) {
		this.salary = salary;
		return this;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
