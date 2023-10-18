package car;


public class aaa {
	public static void main(String[] args)
	{
		car mazda = new car("sedan",2,"diesel","red");
		car a = new car();
		a.setColor("Black");
		a.setFuel("bio-diesel");
		a.setSeats(5);
		a.setType("pickup");
		
		
		System.out.println(
				"type = "+a.getType()+" fuel = "+a.getFuel()+" color = "+a.getColor()+" seats = "+a.getSeats()
				);
		
		a.spec();
		
		if (a.getSeats()>mazda.getSeats())
			System.out.println( "a car has more seats than mazda");
			else
				System.out.println( "mazda has more seats than a car");
	}
}
