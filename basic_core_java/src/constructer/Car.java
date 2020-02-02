package constructer;

public class Car {
	
	String colour;
	int speed;
	String model;
	int Average;
	static int Wheel=4;
	
	public void featers()
	{
	   System.out.println(colour+" "+ model+" car has "+Wheel+" wheels and its average is "+speed+" a and average is "+Average+" kmpl");	
	}
	
	public Car(String colour,
	int speed,
	String model,
	int Average)
	
	{
		this.colour=colour;
		this.Average=Average;
		this.speed=speed;
		this.model= model;
		
		
	}

		public Car() {
	}
	
		
	}

