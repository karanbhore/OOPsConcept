package com.prowings.POJO;

public class Employee {
	String name;
	public String id;
	private double salary;
	
	public Employee(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		this.salary = salary-100000;
	}
	public static void main(String[] args) {
		Employee employee=new Employee();
		
		employee.setName("Asmita");
		System.out.println(employee.getName());
		
		employee.setId("female");
		System.out.println(employee.getId());
		
		employee.setSalary(2000000d);
		System.out.println(employee.getSalary());
		
	}
	}
