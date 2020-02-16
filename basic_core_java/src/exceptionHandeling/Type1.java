package exceptionHandeling;

public class Type1 {
	
	static Type1 e;

	public static void main(String[] args) {//unchecked Exception
		   

		// TODO Auto-generated method stub
		
		//Exception1
		System.out.println(10/2);
		
		//Exception2
		
	String name ="anand";
	System.out.println(name.charAt(0));
	
	//Exception3
  
			e.sum(10,20);


	}
	
	
	public void sum(int a,int b )
	
	{
		System.out.println(a+b);
	}

}
