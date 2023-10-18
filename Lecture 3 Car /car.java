package car;

public class car {
	
		private String type;
		private int no_seats;
		private String fuel;
		private String body_color;
		
		
		
		car(){
		type="";
		no_seats=0;
		fuel="";
		body_color="";
		}
		
		
		car (String type, int seats, String fuel, String body_color){
		this.type=type;
		this.no_seats=seats;
		this.fuel=fuel;
		this.body_color=body_color;
		}
		
		public String getType(){
		return type;
		}
		
		public void setType(String type){
		this.type=type;
		}
		
		
		
		public int getSeats(){
		return no_seats;
		}
			
		public void setSeats(int no_seats){
		this.no_seats=no_seats;
		}
		
		
		
		public String getFuel(){
		return fuel;
		}
			
		public void setFuel(String fuel){
		this.fuel=fuel;
		}
		
		
		
		public String getColor(){
		return body_color;
		}
				
		public void setColor(String body_color){
		this.body_color=body_color;
		}
			
		void spec()
		{
			System.out.println(
					"type = "+this.type+" fuel = "+this.fuel+" color = "+this.body_color+" seats = "+this.no_seats
					);
		}
		
		
}
