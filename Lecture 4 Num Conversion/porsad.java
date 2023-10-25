package excs;
import java.util.Scanner;
import java.util.InputMismatchException;


public class porsad {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter number: ");
	      try {
	      int n = scanner.nextInt();
	      scanner.close();
	      
	      System.out.println("Decimal: " + n);
	        System.out.println("Octal: " + Integer.toOctalString(n));
	        System.out.println("Binary: " + Integer.toBinaryString(n));
	        System.out.println("Hexadecimal: " + Integer.toHexString(n));
		
	}catch(InputMismatchException e)
	{
		System.out.println("Error");
	}
	  
	
	}

}
