package constructer;

public class User {

	public static void main(String[] args) {

		Car ford= new Car();
		ford.Average=10;
		ford.colour="Black";
		ford.model="figo";
		ford.speed=150;
		//Car.Wheel=5;
		ford.featers();
		
		
		Car maruti= new Car();
		maruti.Average=20;
		maruti.colour="Red";
		maruti.model="Baleno";
		maruti.speed=80;
		//maruti.Wheel=4;
		maruti.featers();
		
		Car Kia= new Car();
		Kia.Average=15;
		Kia.colour="Siliver";
		Kia.model="Seltos";
		Kia.speed=180;
		//Kia.Wheel=4;
		Kia.featers();
		
		Car Hyundai=new Car("Polar White",140,"Elite",14);
		Hyundai.featers();
		
		
		
		
	}

}
