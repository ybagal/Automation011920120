package arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[11];
		
		arr[0]="Apporva";
		arr[1]="sneha";
		arr[2]="Pallavi";
		arr[3]="prachi";
		arr[4]="Harshal";
		arr[5]="Sachin";
		arr[6]="Abhishek";
		arr[7]="Yogesh";
		arr[8]="Deepika";
		arr[9]="Varasha";
		arr[10]="Rani";

		/*int i=0;
		while(i<=10)
		{
			System.out.println(arr[i]);
			i++;
			
		}*/
		
		
	/*	
   for (int i=0;i<arr.length;i++)
   {
	   System.out.println(arr[i]);
   }*/
		
		//Enhanced for Loop.....................
		
		/*
		for(String a:arr)
			
		{
			System.out.println(a);
		}*/
		
             for(String var:arr)
			
		{
			System.out.println(var);
		}
		
		






		

				

	}

}
