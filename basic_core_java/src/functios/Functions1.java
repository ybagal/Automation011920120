package functios;

public class Functions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum();		
		
		int add =sum(30,40);
		int add2 =sum(50,60);
		System.out.println(add+add2);

		
		
	}
	
	
	public static void sum ()
	
	{
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		
	}
	
	public static int sum (int a, int b)
	
	{
		return a+b;
		
	}

}
