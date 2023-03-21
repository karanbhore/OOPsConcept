package com.prowings.classObject;

public class Product {

	int productNum;
	String name;
	int cost;
	int quantity;

	public Product(int productNum, String name, int cost, int quantity) {
		super();
		this.productNum = productNum;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("productNum :" + productNum + " \nname : " + name + " \ncost : " + cost + " \nquantity : " + quantity);
	}

	public static void main(String[] args) {
		Product obj = new Product(7, "DELL", 100000, 2);
		System.out.println(obj);
	}

}
