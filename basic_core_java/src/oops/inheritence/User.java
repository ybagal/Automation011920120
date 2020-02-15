package oops.inheritence;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Telephone phone  = new Telephone ();
		phone.calling();
		
		Mobile mobile=new Mobile();
		mobile.calling();
		
		
		Smartphone sm=new Smartphone();
		sm.calling();
		sm.Texting();
		sm.internet();
		
		

		
	}

}

