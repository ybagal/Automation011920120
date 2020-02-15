package oops.polymorphism;

import functios.Functions1;
import oops.inheritence.Mobile;
import oops.inheritence.Telephone;
import oops.inheritence.Smartphone;

public class Dynamic_polympohisum {

	public static void main(String[] args) 
	
	{
		
		Telephone phone;
		
		
	 phone = new Mobile();
	 phone= new Telephone();
	 phone = new Smartphone();
	 
	 phone.calling();
	 phone.calling();
		
		 
		

	}

}
