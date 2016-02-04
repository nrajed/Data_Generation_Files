
public class ParkingScore {
/**
 * Couple of things to deal with
 * 1. Campus permit wanted for
 * 2. GPA
 * 3. Car Manufacturer
 * 4. 
 * If GPA between 2.0 and 3.0, score already down to 50
 * If car manfacturer is luxury, score down 25 more.
 * If campus wanted for is livingston, score down.
 * Want sparse campuses:
 * Find money saved by a student.
 * Dynamic pricing model calculator.
 */
	public static void main(String[] args)
	{
		//25*4*10=1000
		//int ticketsreceived = 25*10;
		//int programmoney=30;
		//How much will it cost me?
		int baseCost=30;
		//if luxury car bmw +=20, 21 if audi, mercedes +=19
		//if GPA > 3.0 -=10, >3.5 -=10 unless owns luxury car
		//if owns typical car, -=20
		//if owns toyota, ford, honda, neutral.
		// if owns chevrolet, +=100
		//String car = cars[i];
		//System.out.println("Do you own a " + car);
		double gpa=4;
		String car="Volvo";
		String campus="Cook";
			if(car.equals("BMW"))baseCost+=20;
			else if(car.equals("Mercedes")) baseCost+=19;
			else if (car.equals("Audi"))baseCost+=21;
			else if (car.equals("Subaru")) baseCost-=10;
			else if (car.equals("Jeep")) baseCost-=10;
			else if (car.equals("Hyundai")) baseCost-=10;
			else if (car.equals("Volvo")) baseCost-=10;
			else if (car.equals("Chevrolet")) baseCost+=100;
		
		if(gpa>3.0) baseCost-=10;
		else if(gpa>2.0) baseCost+=20;
		
		if(campus.equals("Livingston")) baseCost+=10;
		else if(campus.equals("Busch")) baseCost+=5;
		else if(campus.equals("Douglass")) baseCost+=5;
		else if(campus.equals("Cook")) baseCost-=10;
		
		System.out.println(baseCost);
		
	}
}
