package com.prowings.overloading;

public class Test {
public static void main(String[] args) {
	System.out.println("Inside main method ");
	Test.main("Hello");
	System.out.println("-------------------");
}
public static void main(String arg1) {
	System.out.println("Hi ,"+arg1);
	Test.main("2nd main ","My Dear");
	System.out.println("----------------------");
}
public static void main(String arg1,String arg2) {
	System.out.println("Hi, "+arg1+","+arg2);
}


}
