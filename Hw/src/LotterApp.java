import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LotterApp {

	public static void main(String[] args) {
		System.out.println("\n !!!!LOTTERY GAME!!!! \n");

		System.out.println("\nTo win this game, you must gest the correct numbers between 0 and 9.\n");

		final int TG = 4; // TOTALOFGENERATOR as well as limit of my loops

		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

		ArrayList<Integer> pul = new ArrayList<>(); // random number array

		ArrayList<Integer> value = new ArrayList<>(); // user list of number array

		ArrayList<Integer> notJackpot = new ArrayList<>(); // 0 to 4 matching array

		/*
		 * for loop to call the random generator method
		 * 
		 * after getting the random number in to " position", I use the "position" to
		 * locate and get the value(0 to 9) in to "random". i add the value( random) to
		 * the winning number " pul" and finally, I delete the value at the position
		 * already used so that the same value will not aper multiple time in the
		 * winning pull
		 */

		for (int i = 0; i <= TG; i++) {

			int position = getRandom(number);

			int random = number.get(position);

			pul.add(i, random);

			number.remove(position);

		}

		// to see the wining number
		// |
		// v
		// System.out.println(pul);

		// 1st and 4 other request of the user input in the for loop called by a
		// function

		System.out.println("Chose a number  between 0 and 9 ");

		int enter = request();

		value.add(enter);

		for (int o = 0; o < TG; o++) {

			System.out.println("Chose a number between 0 and 9 different from " + value);

			enter = request();

			value.add(enter);

		}

		pul.sort(null);
		value.sort(null);

		System.out.println("\nYour choices are: \n" + value);

		System.out.println("\nThe winning numbers are: \n" + pul);

		// condition of the Jackpot
		if (value.equals(pul)) {

			System.out.println("\nCONGRADULATION!!! All the elements are macthing!!! you win the jackpot ");

		}
		// other than the jackpot
		else {

			for (int p = 0; p <= TG; p++) {

				for (int a = 0; a <= TG; a++) {
					if (value.get(p) == pul.get(a)) {

						notJackpot.add(value.get(p));

					}

				}

			}

			int notJackpotSize = notJackpot.size();

			switch (notJackpotSize) {

			case 0: {

				System.out.println("\nYou have " + notJackpotSize + " matching digits. Better luck the next Time");

				break;
			}

			case 1: {

				System.out
						.println("\nYou win. You have " + notJackpotSize + " matching digits which are " + notJackpot);

				break;
			}
			case 2: {

				System.out
						.println("\nYou win. You have " + notJackpotSize + " matching digits which are " + notJackpot);

				break;
			}
			case 3: {

				System.out
						.println("\nYou win. You have " + notJackpotSize + " matching digits which are " + notJackpot);

				break;
			}
			case 4: {

				System.out.println(
						"\nYou win!!!. You have " + notJackpotSize + " matching digits which are " + notJackpot);

				break;
			}

			}

			int s = 0;
			while (s <= TG && notJackpotSize != 0) {
				for (int d = 0; d <= TG; d++) {

					if (value.get(s) == pul.get(d)) {
						System.out.println("\nThe element " + pul.get(d) + " match at the position " + (s + 1)
								+ " in your elements ,and at the position " + (d + 1) + " in the winning numbers ");

					}

				}

				s++;
			}

		}

	}

	// method for random generator
	public static int getRandom(ArrayList<Integer> number) {

		int index = number.size();
		int random;

		random = (int) (Math.random() * index);

		return random;
	}

	// method for user input
	public static int request() {
		Scanner choice = new Scanner(System.in);
		int enter;

		enter = choice.nextInt();
		return enter;

	}

}

//SEPT :)
