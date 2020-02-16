package stringclass;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Your account Number is 1234";
		String str2 ="Your account number is 1234";
	

				
				
				//function 1
				
				System.out.println(str.charAt(24));
				
				//function 2
				
				System.out.println(str.length());
				
				//function3
				System.out.println(str.toUpperCase());
				// function 4
				System.out.println(str.toLowerCase());
				
				//function5
				System.out.println(str.equals(str2));
				
				//function6
				
				System.out.println(str.equalsIgnoreCase(str2));
				
				//function7
				System.out.println(str.replace("1234","5678"));
				
				//Function8
				
				System.out.println(str.substring(23));
				
				//function9
				System.out.println(str.substring(23,27));
				
				//function10
				System.out.println(str);
				System.out.println(str.trim());
				
				//function11
				
		String [] arr=	str.split(" ");
		for(String s:arr)
				
		{
			System.out.println(s);
		}
				
		//function12
		
		System.out.println(str.contains("1254"));
		

	}

}
