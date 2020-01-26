package ifElseStatements;

public class Nested_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;
		
		if (a>b)
		{
		
			if(a>c)
				
			{
				System.out.println("a greatest");
		
			}			
				else 			
			{
						System.out.println("c greatest");
			}
				}
		else if(b>c)
		
		{
				System.out.println("b is greatest");
				
			}
		else
			
		{
			System.out.println("c is greatest");
			

		}
	}

}
