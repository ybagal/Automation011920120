package functios;

public class Non_static_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Non_static_function ref= new Non_static_function();
		
		int add=ref.sum(10,20);
		int add2=ref.sum(30,40);
		
		System.out.println(add+add2);
		
		Functions1.sum(10,20);

	}
	public int sum (int a,int b)
	{
				
		return a+b;
	}

}
