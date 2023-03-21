package com.prowings.practise;

import java.util.Arrays;

public class Candidate {
	int id;
	String name;
	String address;
	Course cources[];
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int id, String name, String address, Course[] cources) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.cources = cources;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", address=" + address + ", cources="
				+ Arrays.toString(cources) + "]";

	
	
	
	}
}
