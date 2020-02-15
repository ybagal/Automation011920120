package oops.Abstraction;

import oops.inheritence.Mobile;
import oops.inheritence.Smartphone;
import oops.inheritence.Telephone;

public class Bank_user {

	public static void main(String[] args) 
	
	{
	

		callBank(new HDFC());	
		callBank(new SBI());	
		callBank(new HSBC());	
		
		callphone(new Telephone());
		callphone(new Smartphone());
		callphone(new Mobile());
	}
	
	public static void callBank(RBI bank)	
	{
		
		bank.currentAccount();
		bank.debitcard();
		bank.savingAccount();
		bank.currentAccount();
		bank.demonetization();
		
				
	}
	private static void demonetization() {
		// TODO Auto-generated method stub
		
	}

	public static void callphone(Telephone phone)
	
	{
		phone.calling();
	}
	
	public static void sum(int a,int b)
	
	{
		System.out.println(a+b);
	}


}
