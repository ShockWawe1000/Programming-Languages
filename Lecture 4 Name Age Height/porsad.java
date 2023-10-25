package excs;

import java.util.Scanner; 

public class porsad {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	      
	      System.out.print("Enter your name: ");
	      String name = scanner.nextLine();
	      System.out.print("Enter your year of birth: ");
	      int birthYear = scanner.nextInt();
	      int age = 2023 - birthYear;
	      
	      System.out.print("Enter your height in meters: ");
	      double height = scanner.nextDouble();
	      int heightCm = (int) (height * 100);
	      
	      System.out.println("Name: " + name);
	      System.out.println("Age: " + age);
	      System.out.println("Height (in cm): " + heightCm);
		
	}

}
