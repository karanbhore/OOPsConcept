package com.prowings.conceptOerview;

public class Employee {

	String name;
	String jobTitle;
	float salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String jobTitle, float salary) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void calculateSalary(double salary) {

		System.out.println(getSalary());

	}

	public void updateSalary(float salary) {
		double salaryHike = getSalary()*10/100;

		double updatedSalary = ((getSalary()) + salaryHike);

		System.out.println(updatedSalary);

	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Rajesh", "Developer", 200000f);
		Employee emp2 = new Employee("Devansh", "Tester", 100000f);

		System.out.println(emp1);
		System.out.println(emp2);

		emp1.calculateSalary(8);
		emp2.calculateSalary(8);

		emp1.updateSalary(8);
		emp2.updateSalary(8);
        
	}

}
