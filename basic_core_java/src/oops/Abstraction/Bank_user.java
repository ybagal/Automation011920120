package oops.Abstraction;

public class Bank_user {

	public static void main(String[] args) 
	
	{
	

		callBank(new HDFC());	
		callBank(new SBI());	
		callBank(new HSBC());	
	}
	
	public static void callBank(RBI bank)	
	{
		
		bank.currentAccount();
		bank.debitcard();
		bank.savingAccount();
		bank.currentAccount();
		
				
	}
	
	public static void sum(int a,int b)
	
	{
		System.out.println(a+b);
	}


}
