package arrays;

public class Two_dimentional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[][]arr=new String[3][2];
		
		//row1
		
		arr[0][0]="sneha";
		arr[0][1]="Apporva";
		
		//row2
		
				arr[1][0]="Pallavi";
				arr[1][1]="Prachi";		
				
		//row3
				
				arr[2][0]="Abhishek";
				arr[2][1]="Yogesh";
//				
//		for(int r=0;r<=2;r++)
//				{
//		for(int c=0;c<=1;c++)
				
				for(int r=0;r<arr.length ;r++)
					{
			for(int c=0;c<arr[r].length;c++)

				

		
				{
					System.out.print(arr[r][c]+" || ");
					
				}
		{
			System.out.println();
		
		}
	
				}
				
	}

}
