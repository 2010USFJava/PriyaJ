package com.revature.beans;

public class Driver {
	public static void main (String [] args) {
	
		Animal animal1 = new Animal("Dog", 4, "mammal");
		
		Continent c1= new Continent("North America", 2000);
		
		
		
		
		
		 animal1.setName("Dog");
		String A = animal1.getName();
		
		 animal1.setLegs(4);
		int B = animal1.getLegs();
		 System.out.println(A);
		  System.out.println(B);
		    System.out.println(c1);
	}

}
