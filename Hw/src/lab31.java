import java.util.Scanner;


public class lab31 {
	

	public static void main(String[] args) {
	
		String userName;
		Scanner objectName = new Scanner(System.in);
		System.out.println("Enter a name.");
		userName = objectName.nextLine();

		double dCel;                       //  Celsuis value
		Scanner objectdCel = new Scanner(System.in);
		System.out.println("\nEnter the Temperature on Celsius.");
		dCel = objectdCel.nextDouble();
		
		
		final int LIMIT = 20;           // limite of the loop
		double loop = dCel + LIMIT;
		
	    System.out.printf("\n%-20s%s","Celsius","Fahrenheit");
		while(dCel < loop)
		 {
			
			double dFah = (dCel * 9/5) + 32;         // Celsius to Fahrenheit
			
			System.out.printf("\n%-20.2f%.2f",dCel,dFah);
			dCel++;
			
			
		 }
	}

}
