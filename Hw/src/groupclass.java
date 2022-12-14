import java.util.Scanner;

// list of all the option in enum method.
enum Month {
	January, February, March, April, May, June, July, August, September, October, November, December

}

public class groupclass {

	public static void main(String[] args) {

		// Data type as string and the request of the user input

		System.out.println("Enter your brithday month " + "\nDon't forget to start with Capital latter. ");

		String userChoice;
		Scanner objChoice = new Scanner(System.in);
		userChoice = objChoice.nextLine();

		// Method call for the message out put
		monthMessage(userChoice);

	}

	// the message out put method with Try and catch function
	// also Switch and case function for each moth with string as data type

	public static void monthMessage(String userChoice) {

		try {

		Month month = Month.valueOf(userChoice);
			
			switch (month) {

			case January: {
				System.out.println(" You chose the first month. New year born have the best personality");
				break;
			}
			case February: {
				System.out.println(" You chose the best month ");
				break;
			}
			case March: {
				System.out.println(" You chose the month of cool people ");
				break;
			}
			case April: {
				System.out.println(" :0 !!!!!!!!!");
				break;
			}
			case May: {
				System.out.println(" Who are you ");
				break;
			}
			case June: {
				System.out.println(" Ready to party!!!!!!");
				break;
			}
			case July: {
				System.out.println(" Another cool persons ");
				break;
			}

			case August: {
				System.out.println(" I dont want to be in August ");
				break;
			}

			case September: {
				System.out.println("Classes is starting ");
				break;
			}
			case October: {
				System.out.println(" What are we doing for october??");
				break;
			}

			case November: {
				System.out.println(" :) You chose " + Month.October);
				break;
			}

			case December: {
				System.out.println(" Happy new year ");
				break;
			}

			}
		} catch (IllegalArgumentException e) {

			System.out.println("oups!!! somthing went wrong ");

		}
	}
}
//Sept :]
