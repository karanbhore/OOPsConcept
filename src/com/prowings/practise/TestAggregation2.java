package com.prowings.practise;

public class TestAggregation2 {
	public static void main(String[] args) {
		
		Course csr1=new Course("Java Development", 300);
		Course csr2=new Course("Python Development", 300);
		Course csr3=new Course("Java Automation Testing", 200);
		Course csr4=new Course("Python Automation Testing", 200);
		
		Course[] courses1= {csr1,csr2};
		Course[] courses2= {csr3,csr4};
		
		Candidate cnd1=new Candidate(10, "Ram", "pune", courses2);
		Candidate cnd2=new Candidate(20, "Sham", "Mumbai", courses1);
		
		System.out.println(cnd1);
		System.out.println(cnd2);
		
		
	}

}
