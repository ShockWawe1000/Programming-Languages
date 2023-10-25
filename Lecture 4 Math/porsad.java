package excs;
import java.lang.Math;
import java.util.Scanner; 

public class porsad {

	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in); 
		    System.out.println("Enter number");

		    String temp = myObj.nextLine();
		    double n =  Double.parseDouble(temp);
		    System.out.println(n);
		    
		 
		    System.out.println("Sine: " + Math.sin(n));
		    System.out.println("Cosine: " + Math.cos(n));
		    System.out.println("Tangent: " +  Math.tan(n));
	
		    double cotVal = 1/Math.tan(n);
		    System.out.println("Cotangent: " + cotVal);
		    
		    System.out.println("Square root of " + Math.sqrt(n));
		    System.out.println(n + " squared: " + Math.pow(n, 2));
		    System.out.println(n + " cubed: " + Math.pow(n, 3));

		    System.out.println("Smallest integer larger than or equal to " + n + " = " +  (int) Math.ceil(n));
		    System.out.println("Largest integer smaller than or equal to " + n + " = " + (int) Math.floor(n));
		    
		    double area = Math.PI * Math.pow(n, 2);
		    System.out.println("The area of a circle with radius " + n + " is " + area);
		    
		    System.out.println("The value of Pi is " + Math.PI);
		    
		    System.out.println("The value of e is " + Math.E);
	}

}
