package com.prowings.practise;

public class TestCompositionAggregation {
	public static void main(String[] args) {
		StudentId id=new StudentId(10, 883039136);
		Address address=new Address("pune", "India", 1234);
		
		Student2 std1=new Student2("Ram", 78.5f, address);
		System.out.println(std1);
	}

}
