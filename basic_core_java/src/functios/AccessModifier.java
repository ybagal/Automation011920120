package functios;

public class AccessModifier {

	public static void main(String[] args) {	
		
		AccessModifier obj = new AccessModifier();
		
		obj.publicFunction();
		obj.privateFunction();
		obj.noAccessModFun();
		obj.protectedFunction();
		
		
	}
	
	
	public void publicFunction()
	{
		System.out.println("public function");
				
	}
	
	
	private void privateFunction()
	{
		System.out.println("privateFunction");
	}
	
	void noAccessModFun()
	{
		System.out.println("noAccessModFun");
	}
	protected void protectedFunction()
	{
		System.out.println("protectedFunction");
	}

}
