import java.util.Scanner;

public class project2
{
	public static void main(String[] args)
	{
		
		System.out.println("GUESS THE NUMBER GAME") ;
		System.out.println("ENTER YOUR USER NAME\n");
	
		String userName;
		Scanner objectName = new Scanner(System.in);
		userName = objectName.nextLine();
		
		System.out.println("Player: " + userName);
		System.out.println("To win this game, you must choose the correct number between 0 and 100.");
		System.out.println("You have 10 Chances");
		System.out.println("Let start ");
		
		int random = (int)(Math.random() * 100 ); // random number
		
		int yourNumber;
		Scanner objectYN = new Scanner(System.in);
		
		int tryaccount = 10;              //  try account decreasing
		final int LIMIT = 0;
		while(tryaccount > LIMIT)        //  loop
			{
			final int ENTERMINI = 0;
			final int ENTERMAX = 100;
			
			do                             // enter error
				{		
				System.out.println("ENTER YOUR NUMBER (0-100)");     
				yourNumber = objectYN.nextInt();       // player enter request 
			
				if (yourNumber < ENTERMINI || yourNumber > ENTERMAX)
					{
					System.out.println("ERROR!!!; the number you enter is not between 0 and 100.");	
					}
				} while(yourNumber < ENTERMINI || yourNumber > ENTERMAX);
			
			tryaccount--;              //  decrementing
			
			if(yourNumber == random)
				
				{
				System.out.println("CONGRADULATION!!! YOU WIN");
				break;
				}
			
			else if (yourNumber < random)
				
				{
				System.out.println("Oup! the number is higher than " + yourNumber + ". Guess again.\n"+ tryaccount + " chance left");
				}
			     
			else
				 {
				 System.out.println("Oup! the number is lower than " + yourNumber + ". Guess again.\n"+ tryaccount + " chance left");
				 }
			
			if (tryaccount == LIMIT)
				{
				 System.out.println(userName + " loses this time. GAME OVER.");
				}
			}
			
		
	}
	
}


