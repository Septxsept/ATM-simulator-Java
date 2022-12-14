import java.util.Scanner;
public class lab3 {

	public static void main(String[] args) {
	
		String userName;
		Scanner objectName = new Scanner(System.in);
		System.out.println("Enter a name. ");
		userName = objectName.nextLine();

		double dCel;                      //  Celsuis value
		Scanner objectdCel = new Scanner(System.in);
		System.out.println('\n' + "Enter the Temperature on Celsius. ");
		dCel = objectdCel.nextDouble();
		
		
		
		final int LIMIT = 20;           // limite of the loop
		double loop = dCel + LIMIT;
	
		while(dCel < loop);
		 {
			
			double dFah = (dCel * 9/5) + 32; // Celsius to Fahrenheit
		
		
			System.out.println("heello");
		
		 }
		
		
			
			
		
	}

}
