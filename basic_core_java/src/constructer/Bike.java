package constructer;

public class Bike {

	
	
		
		String colour;
		int speed;
		String model;
		int average;
	 int wheel;
		
		
		public void featers()
		
		{
		   System.out.println(colour+" "+ model+" Bike has "+wheel+" wheel and its average is "+speed+" a and average is "+average+" kmpl");	
		}

		public Bike(String colour,
				int speed,
				String model,
				int Average, int wheel)
				
				{
					this.colour=colour;
					this.average=average;
					this.speed=speed;
					this.model= model;
					this.wheel=wheel;
					
					
				}

		

	

}
