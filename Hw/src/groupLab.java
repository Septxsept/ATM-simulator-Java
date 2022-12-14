import java.util.Scanner;

public class groupLab {

	
	public static void main(String[] args) {
		

		int number;                                    // Variable of the number of line
		Scanner objectNumber = new Scanner(System.in);
		System.out.println("Enter the number of line ");
		number = objectNumber.nextInt();
		
		int dash1 = number + 10;                      // variable for the first line and 
		for( int o = 0 ; o < dash1 ; o++)             // 10 as constant number of line
			{
			System.out.printf("%s","__");
			}
		
		System.out.printf("\nPattern A");            
		
		int spacing = number;                     // variable for the space between A and B notation
		for( int r = 0 ; r < spacing ; r++)
			{
				System.out.printf("%s"," ");
			}
		
		System.out.printf("Pattern B\n");
		
		int dash2 = number + 10;                    // variable for the second line and
		for( int p = 0 ; p < dash2 ; p++)           // 10 as constant number of line
			{
			System.out.printf("%s","__");
			}
		
		System.out.println(); 
		
		    int pA =( 1 / number ) + 1 ;          // pattern A       
			int pB = number  ;                    // pattern B
			
		for(int i = 0 ; i < number ; i++)         //loop of the hall notation
		 {
		
			for(int t = pA; t > 0 ; t--)          // loop of pattern A on each line 
				{
				System.out.printf("%s","+");
				}
			
			System.out.printf("%8s"," ");          // Initial space between the patterns
			
			for ( int v = pB; v > 0; v--)         // loop to increasing the between the patterns
				{
				System.out.printf("%s"," ");
				}
			
			for(int u = pB; u > 0 ; u--)          // loop of pattern B on each line 
				{
				System.out.printf("%s","+");       // 10 as constant number of line
				}

		pA++;
		pB--;
		
			System.out.println();
			
		 }
		
		int dash3 = number + 10;                 // variable for the second line and
		for( int d = 0 ; d < dash3 ; d++)
			{
			System.out.printf("%s","__");
			}
	}

}


