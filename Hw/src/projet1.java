import java.util.Scanner;

public class projet1 {
	public static void main(String[] args) {
		
		String firstName;
		Scanner objectFName = new Scanner(System.in);
		System.out.println("Enter your first name ");
		firstName = objectFName.nextLine();
		
		String lastName;
		Scanner objectLName = new Scanner(System.in);
		System.out.println("Enter your last name ");
		lastName = objectLName.nextLine();
		
		int age;
		Scanner objectAge = new Scanner(System.in);
		System.out.println("Inter your age ");
		age = objectAge.nextInt();
		if((age <=17) || (age >=70))       // if condition of age
		{
		System.out.println('\n' + firstName +'\s' + lastName + " you are too young/old to be working here.");	
		}
		else {
		
		int Ssn;
		Scanner objectSsn = new Scanner(System.in);
		System.out.println("Inter your social security number ");
		Ssn = objectSsn.nextInt();
		
		System.out.println('\n' + "Thanks for the information." + '\n' + "Let process your pay stubs." );
		
		double workHours;
		Scanner objectWh = new Scanner(System.in);
		System.out.println('\n' + "How many hours did you worked in a Day? ");
		workHours = objectWh.nextDouble();
		
		int workDays;
		Scanner objectDays = new Scanner(System.in);
		System.out.println('\n' + "How may days did you worded in a Week.");
		workDays = objectDays.nextInt();
		
		
	    final int PH = 20;                                    // $ pay by hours                                  // over time pay by hour
		final int WBM = 4;                                    // weeks by months
		final int WBY = 52;                                   // weeks by year
		
		double hw = workHours * workDays;                     // hours by week
		double hm = hw * WBM;                                 // hours by months
		double hy = hw * WBY;                                 //hours by in year
		
		double pw, pm, py;
		pw = hw * PH;                                         // pay by week
		pm = hm * PH;                                         // pay by month
	    py = hy * PH;                                         // pay by year
		
			
			System.out.println('\n'+ firstName + '\s'+ lastName);
			System.out.println("Age: " + age );
			System.out.println('\n'+"Weekly Pay: $" + Math.round(pw));
			System.out.println('\n'+"Monthly Pay: $" + Math.round(pm));
			System.out.println('\n'+"Yearly Pay: $" + Math.round(py));
			
			
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		         }
		
	        }
		}


