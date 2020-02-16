package stringclass;

public class Findchar {

	public static void main(String[] args)
	
	{	
		
	String name = "anand";
			
			int t=0;
	
	for(int i=0; i<name.length();i++)
	{
		if(name.charAt(i)=='n')
			
		{
			t++;
		}
	}
		
			System.out.println("numberof n="+t);

	
	}

}
