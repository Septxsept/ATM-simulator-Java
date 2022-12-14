import java.awt.AWTException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * enum of the menu option in a switch case function
 */
enum Option {
	W, D, I, E

}

public class Finalpj {

	private double initialDepositCash;
	private double initialGetCash;
	private double initialBlance;
	final private double INITIALRATE;
	private double initialNewBalance;
	final public int INITIALZEROFORLOOP;

	/*
	 * constructor to initiate variables constants of deposit / withdraw /balance
	 */
	Finalpj() {

		initialBlance = 1000;
		initialNewBalance = 0;
		INITIALRATE = 0.02;
		INITIALZEROFORLOOP = 0;
		initialGetCash = 0;
		initialDepositCash = 0;
	}

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.out.println("\n            WELCOME to CIS144 BANK ");

		Thread.sleep(2000);
		System.out.println("\nLet start by Creating an account. \n");

		Thread.sleep(2000);

		/*
		 * getting all the variable and from the constructor with an object function
		 * setting them into a new container
		 */
		String newMenuOrExit, exitChoice = null;

		String Yes = "Y", No = "N";

		Finalpj objectfinlaprojet = new Finalpj();
		double balance = objectfinlaprojet.initialBlance;
		double newBalance = objectfinlaprojet.initialNewBalance;
		final double RATE = objectfinlaprojet.INITIALRATE;
		final int ZEROOFLOOP = objectfinlaprojet.INITIALZEROFORLOOP;

		/*
		 * create account with usernam and password
		 */

		System.out.println("\nCREAT YOUR USER NAME: \n");

		String userName;
		Scanner objectName = new Scanner(System.in);
		userName = objectName.nextLine();

		System.out.println("\nCREAT YOUR PASSWORD: \n");

		String password;
		Scanner objectPassword = new Scanner(System.in);
		password = objectPassword.nextLine();

		System.out.println("\nYou have succefully creat you account. \n");

		/*
		 * option to go to the menu or exit after creating an account
		 *
		 * "if" statement to apply the option with error output for incorrect values
		 */
		String exit = "E";
		String menu = "M";
		Thread.sleep(2000);
		System.out.println("\nEnter M for Menu or E to Exit \n");

		String menuOrExit;
		Scanner objectMoE = new Scanner(System.in);
		menuOrExit = objectMoE.nextLine().toUpperCase();

		/*
		 * if statement for an incorrect input for the menu or exit option + a new
		 * request in a loop until a correct input is enter
		 */
		if (!menuOrExit.equals(exit) && !menuOrExit.equals(menu)) {

			do {
				System.out.println("\nError !!! Please enter a corect value \n");

				Thread.sleep(2000);

				System.out.println("\nEnter M for Menu or E to Exit \n");

				Scanner newObjectMoE = new Scanner(System.in);
				newMenuOrExit = newObjectMoE.nextLine().toUpperCase();

				menuOrExit = newMenuOrExit;

			} while (!menuOrExit.equals(exit) && !menuOrExit.equals(menu));

		}
		/*
		 * if to exit / not going to the menu
		 */
		if (menuOrExit.equals(exit)) {

			System.out.println("\nThank for your oparation. Goodye!!");

		}
		/*
		 * Enter the menu to condition
		 */
		else if (menuOrExit.equals(menu)) {

			/*
			 * method call for an authentication of username and password with an argument
			 * of the previous information of creating an account
			 */

			passwordAuthentication(userName, password);

			/*
			 * menu with first 1% interest in the initial amount
			 */

			double rate1Balance, rate1 = 0.01;
			rate1Balance = balance + (balance * rate1);

			System.out.println("\n          Welcome " + userName);

			Thread.sleep(2000);

			System.out.println("\n\nyou earned 1% on your stating balance.");

			Thread.sleep(3000);

			System.out.println("\nThe new balance will appear in the menu");

			balance = rate1Balance;

			/*
			 * menu replay loop start/ output balance and option also option choice request
			 */

			do {

				Thread.sleep(2000);

				String choice;

				System.out.println("\n\n            MENU");

				Thread.sleep(2000);

				System.out.println("\n      Your Balanc: $" + balance);

				Thread.sleep(2000);

				System.out.println("\nEnter:" + "\n\nW ----> Withdrawn" + "\nD ----> Deposit"
						+ "\nI ----> Interest Accured" + "\nE ----> Exit");

				Scanner objecChoice = new Scanner(System.in);
				choice = objecChoice.nextLine().toUpperCase();

				/*
				 * try catch for inside menu option error option relate to enum pointed by an
				 * object( option choice) switch case for the option I added an uppercase
				 * function to turn input to the correct format
				 */

				try {
					exitChoice = null;
					Option choiceOption = Option.valueOf(choice);

					switch (choiceOption) {

					/*
					 * W as withdraw option, a method call with argument ( balance ) return new
					 * balance after operation
					 * 
					 */
					case W: {

						balance = withdrawn(balance);

						break;
					}
					/*
					 * D as deposit option, a method call with argument ( balance ) return new
					 * balance after operation
					 * 
					 */
					case D: {

						balance = depositeOfAmount(balance);

						break;
					}

					/*
					 * I as Interest option, a method call with argument ( balance ) no return/
					 * output the number of yearly interest
					 * 
					 */
					case I: {

						interestCalculation(balance);

						break;
					}

					/*
					 * E as exit option, a method call with argument ( yes and no ) return the
					 * choice to exit or go back to the menu
					 * 
					 */
					case E: {

						exitChoice = exitMenu(Yes, No);

						break;
					}

					}

				} catch (IllegalArgumentException e) {

					System.out.println("\noups!!! Somthing went wrong!!  ");
					Thread.sleep(2000);
					System.out.println("\n*******Input Incorrect********   ");

				}
				/*
				 * exit option after action method call with argument ( yes and no ) return the
				 * choice to exit or go back to the menu only work if the user didnt exit from
				 * the "E" option"
				 */

				if (exitChoice == null) {

					exitChoice = exitAfterAction(Yes, No);
				}

			} while (exitChoice.equals(No));

		}

	}

	/*
	 * password authentication method/ no return but a loop until correct
	 * information are input. /error message for incorrect information
	 */
	private static void passwordAuthentication(String userName, String password) throws InterruptedException {

		String requestUserNam, requestPassWord;

		do {

			System.out.println("\nEnter your Usernam: \n");

			Scanner objecRrequestUserNam = new Scanner(System.in);
			requestUserNam = objecRrequestUserNam.nextLine();

			System.out.println("\nEnter uour Password:  \n");

			Scanner objecRequsttPassword = new Scanner(System.in);
			requestPassWord = objecRequsttPassword.nextLine();

			if (!requestUserNam.equals(userName) || !requestPassWord.equals(password)) {
				System.out.println("\n Error !!! Please enter the correct Usernam" + " or Password\n");

				Thread.sleep(1500);
			}

		} while (!requestUserNam.equals(userName) || !requestPassWord.equals(password));
	}

	/*
	 * withdraw private method with argument ( balance) and return new balance
	 * contain a method pointed to the constructor to get initial values
	 */
	private static double withdrawn(double balance) throws InterruptedException {

		System.out.println("\nAvalable Balance $" + balance);

		Thread.sleep(2000);

		System.out.println("\n     Get Cash   " + "\nEnter the amount you want: $");

		try {

			Finalpj objectfinlaprojet = new Finalpj();

			double newBalance = objectfinlaprojet.initialNewBalance;

			final int ZEROOFLOOP = objectfinlaprojet.INITIALZEROFORLOOP;
			double getCash = objectfinlaprojet.initialGetCash;
			Scanner objectGetCash = new Scanner(System.in);
			getCash = objectGetCash.nextDouble();

			if (getCash >= ZEROOFLOOP && getCash <= balance) {

				newBalance = balance - getCash;

				System.out.println("\nYour successfully get $" + getCash + "\nyour new balance is $" + newBalance);

				balance = newBalance;

			}

			else if (getCash < ZEROOFLOOP) {

				System.out.println("\nNegatif amount not allowed ");

			}

			else if (getCash > balance) {

				System.out.println("\n*****Insufficent Funds****");

				Thread.sleep(1500);
				System.out.println("\nYou don't have enought money to perform this operation ");
			}

		} catch (InputMismatchException e) {
			System.out.println("\n           Invalid Value  "); // try to find out specific reason.
		}

		return balance;
	}

	/*
	 * DEPOSIT private method with argument ( balance) and return new balance
	 * contain a method pointed to the constructor to get initial values
	 */
	private static double depositeOfAmount(double balance) throws InterruptedException {

		Finalpj objectfinlaprojet = new Finalpj();
		double newBalance = objectfinlaprojet.initialNewBalance;
		final int ZEROOFLOOP = objectfinlaprojet.INITIALZEROFORLOOP;

		System.out.println("\nYour balance: $" + balance);
		System.out.println("\n       Deposite Cash   " + "\nEnter the amount: $");

		try {
			double depositCash = objectfinlaprojet.initialDepositCash;
			Scanner objectDepositCash = new Scanner(System.in);
			depositCash = objectDepositCash.nextDouble();

			if (depositCash >= ZEROOFLOOP) {

				newBalance = balance + depositCash;

				System.out.println("\nYou have successfully Deposit  $" + depositCash);

				Thread.sleep(2000);

				System.out.println("\nYour new balance is $" + newBalance);
				balance = newBalance;
			}

			if (depositCash < ZEROOFLOOP) {

				System.out.println("\n*****Negatif amount not allowed*****");

			}

		} catch (InputMismatchException e) {
			System.out.println("           Invalid Value  "); // try to find out specific reason.
		}

		return balance;
	}

	/*
	 * interest public method with argument ( balance) / no return new contain a
	 * method pointed to the constructor to get initial values
	 */
	private static void interestCalculation(double balance) throws InterruptedException {

		Finalpj objectfinlaprojet = new Finalpj();
		final double RATE = objectfinlaprojet.INITIALRATE;

		double interestRate, rateBalance;
		System.out.println("\nYour balance: $" + balance);

		Thread.sleep(2000);

		System.out.println("\nInterst rate is 2% yearly");

		interestRate = balance * RATE;
		rateBalance = balance + interestRate;

		Thread.sleep(2000);

		System.out.println("\nBalance now: $" + balance + "\nInterest you will earned: $" + interestRate
				+ "\nYour balance will be: $" + rateBalance + " at the end of this year");

	}

	/*
	 * E as exit option, a method call with argument ( yes and no ) return the
	 * choice to exit or go back to the menu
	 * 
	 */
	public static String exitMenu(String Yes, String No) {

		String exitChoice;

		do {

			System.out.println("\nAre You sur you want to exit? " + "\n\nY for yes            " + " N for No");
			Scanner objectExitChoice = new Scanner(System.in);
			exitChoice = objectExitChoice.nextLine().toUpperCase();

			if (exitChoice.equals(Yes)) {
				System.out.println("Thank for your operations. Goodye!!");
				exitChoice = Yes;
			}

			else if (exitChoice.equals(No)) {
				System.out.println("Back to the menu");
				exitChoice = No;
			}

			else {
				System.out.println("\n Error !!! Please enter a corect value \n");
			}

		} while (!exitChoice.equals(Yes) && !exitChoice.equals(No));

		return exitChoice;
	}

	/*
	 * exit method after action method call with argument ( yes and no ) return the
	 * choice to exit or go back to the menu only work if the user didnt exit from
	 * the "E" option"
	 */
	public static String exitAfterAction(String Yes, String No) throws InterruptedException {
		String exitChoice;

		do {

			Thread.sleep(3000);
			System.out.println("\nDo you have another Operation? " + "\nY for yes            " + " N for No");
			Scanner objectExitChoice = new Scanner(System.in);
			exitChoice = objectExitChoice.nextLine().toUpperCase();

			if (exitChoice.equals(No)) {
				System.out.println("Thank for your operations. Goodye!!");
				exitChoice = Yes;
			}

			else if (exitChoice.equals(Yes)) {
				System.out.println("Back to the menu");
				exitChoice = No;
			}

			else {
				System.out.println("\nError !!! Please enter a corect value \n");
			}

		} while (!exitChoice.equals(Yes) && !exitChoice.equals(No));

		return exitChoice;

	}
}
