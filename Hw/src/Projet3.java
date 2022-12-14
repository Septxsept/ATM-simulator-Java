import java.util.Scanner;

 public class Projet3{ 
	 
	public int totalHead;                          // global variable for total head
	public int totalTail;                          // global variable for total tail
	
	 Projet3()                                     // constructor (no parameter)
	{ 
		 totalHead = 0;                            // initialization of global total head
		 totalTail = 0;                            // initialization of global total head
	}
	
	public static void main(String[] args) {        // main F with number of Toss chose by player
		
		System.out.println("Cointoss Game\n" + "\nChose head or tail\n");
		System.out.println("How many times do you want the coin to be tossed?\n" + "Enter your number: ");
		int tossNumber;
		Scanner objNumbTossr = new Scanner(System.in);
		tossNumber = objNumbTossr.nextInt();
		
		Projet3 objectp3 = new Projet3();           // new object"object3" oriented in the construction p3
		int tHead = objectp3.totalHead;             // global "totalHead" initiate to "0" with the constructor "p3" 
		int tTail = objectp3.totalTail ;		    // transfer into "objectp3" get by "objectp3.totalHead" put into "tHead"
													// global "totalTail" initiate to "0" with the constructor "p3" 
													// transfer into "objectp3" get by "objectp3.totalTail" put into "tTail"
		                                            // because of the static variant of this main method, i can not us directly
													// the global variable.
		
		final int HEAD = 1;                         // value of head
		final int TAIL = 2;                         // value of tail
		
		for (int i = 0; i < tossNumber; i++)        // loop of the number of time that the player want to toss the coin
		{
		
			int randomNumber;                      // variable to get back the random number generate
			
			randomNumber = randomGenerator();      // argument of random number Method with return values in "int randomGenerator()"
			
			if(randomNumber == HEAD)               // total head increment
			{ 
				tHead++;
			}
			else if( randomNumber == TAIL)         // total tail increment
			{ 
				tTail++;
			}
		}
		
		winer(tHead , tTail);                     // argument of Wining result Method static with multiple parameters 
		
		
//		project2 object2 = new project2();      // Method 
//		object2.valu();                         // with object ( need object if it's not static)
//		project2.valu();                        // without object (don't need object if it's static)
	}	
	
	
	
	public static int randomGenerator() {          // random number Method with one return value in "int randomGenerator()"
							
		int random = (int)( Math.random() * 2 + 1 );
		return random;
	}
	
	
	
	public static void winer(int tHead , int tTail) {      // Winning method static with parameter 
		                                                   //to compare and display the winer
				
		System.out.println("The total number of heads is: " + tHead);
		System.out.println("The total number of tails is: " + tTail);
		
				
			if (tHead > tTail )                           // head winer display
				{
					System.out.println("\nHeads win");
				}
					
			else if (tHead < tTail )                       // Tail winer display
				{
					System.out.println("\nTails win");
				}
			else                                            // tie dispolay
				{
					System.out.println("\nThe game is a tie. No one win this time.");
				}
					
	}

}
 // only God know how i made this work