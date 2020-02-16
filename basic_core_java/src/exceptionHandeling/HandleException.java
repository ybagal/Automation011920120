package exceptionHandeling;

public class HandleException {

	public static void main(String[] args) {
		
		try 
		{
			//Exception1
			System.out.println(10/2);
			
			//Exception2
			
		String name ="anand";
		System.out.println(name.charAt(0));
		
		
		//Type1.e.sum(10,20);
		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Recovery 1");

		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Recovery 2");

		}
		catch(Exception e)
		{
			System.out.println("Recovery 3");

		}
		
		finally 
		{
			
			System.out.println("finally");
		}



		System.out.println(("anand"));
	}

}
