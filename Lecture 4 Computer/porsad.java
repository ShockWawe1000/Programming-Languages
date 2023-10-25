package excs;

public class porsad {

	public static void main(String[] args) {
		String str = "Computer";
		System.out.println("Original: " + str);
		System.out.println("Length: " + str.length());
		System.out.println("First Letter: " + str.charAt(0));
		System.out.println("Last Letter: " + str.charAt(str.length()/2));
		System.out.println("Last Letter: " + str.charAt(str.length()-1));
		if (str.substring(0,3).equals("Com"))
			System.out.println("Starts with \"Com\": true");
		else
			System.out.println("Starts with \"Com\": false");
		
		if (str.substring(str.length()-4,str.length()-1).equals("ion"))
			System.out.println("Ends with \"ion\": true");
		else
			System.out.println("Ends with \"ion\": false");
		System.out.println("The first two letters are: " + str.charAt(0)+str.charAt(1));
		
		
		char[] charArray = str.toCharArray();
		for (int i= 0 ; i< str.length()-1; i++)
		{
			if (charArray[i] == 'e')
				charArray[i]='o';
		}
		String r = new String(charArray);
		System.out.println("Swap \"e\" with \"o\": "+ r );
		
		r = str.replace("Compu" , "Calcula");
		
		System.out.println("Replace \"Compu\" with \"Calcula\": "+ r );
	
	}

}
