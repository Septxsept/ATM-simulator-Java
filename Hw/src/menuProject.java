import java.util.Scanner;

public class menuProject {
	
	menuProject()                                   // constructor for the values
	{
		int number =0;
		int typeOfFigure =0;
		  int pA = 0;         
		  int pB = 0 ;                   
						
		  int pm = 0;
						
		  int pA2 = 0 ;             
		  int pB2 = 0 ; 
	
	}

	public static void main(String[] args) {
		
		
		
		int replay= 0;                              // exit loop variable 
		final int EXIT = 5;                         // exit loop value
		
do {	                                            //loop to replay the menu
	
		System.out.println("\nTo choose the shape you want, you have to enter: \n");
		System.out.println(" * 1 for a triangle\n" + " * 2 for an inverted triangle");
		System.out.println(" * 3 for a square\n" + " * 4 for a Bow tie shape\n");
		System.out.println(" # 5 to Exit\n");
		System.out.println("Enter your choice:");
		
		int typeOfFigure;                           // choice of shape of the user                       
		final int LIMITCHOICE = 5;                  // error message loop higher values  
		final int LIMITCHOICE2 = 0;                  // error message loop lower values
		
		do {	                                     // error Message loop 
			
			Scanner objectfigure = new Scanner(System.in);
			typeOfFigure = objectfigure.nextInt();            // shape choice 
			
			if (typeOfFigure > LIMITCHOICE ||typeOfFigure <= LIMITCHOICE2  )       // Error message 
			{
				System.out.println("\nERROR!!!; you enter an incorect value.");
				System.out.println("Enter your choice between 1 and 5.\n");
				System.out.println("Re-enter your choice:");
			}
			
			}while(typeOfFigure > LIMITCHOICE ||typeOfFigure <= LIMITCHOICE2);   // condition of the error loop
			
		
		
		switch (typeOfFigure){                                         // different type of shape condition
		
			case 1: {                                                  // Triangle shape
				System.out.println("\nYou choose TRIANGLE ");
				triangleA();                                           // triangle method call
				
			break;}
			
			case 2:{                                                    // Inverted triangle shape
				System.out.println("\nYou choose INVERTED TRIANGLE ");
				triangleB();                                            // Inverted triangle Method call
			break;}
				
			case 3:{                                                    // Square shape
				System.out.println("\nYou choose SQUARE ");
				square();                                               // Square method call
			break;}
			
			case 4:{                                                    // Bow tie shape
				System.out.println("\nYou choose BOW TIE ");
				bowtie();                                               // Bow tie method call
			break;}
			
			case 5:{                                                    // Exit
				
					System.out.println("\nGoodbye and See you Soon ;)  .");

				replay = typeOfFigure;                                  // replay loop exit key
				break;}
			}
	
		
		} while(EXIT != replay );                                       // replay loop condition
		
	}
	
	
	
	
	
	public static void triangleA() {                                   // Triangle method
		System.out.println("Enter the height of the triangle (the amount of rows )");
		
		
		int number;  
		Scanner objectNumber = new Scanner(System.in);
		number = objectNumber.nextInt();                              // height value(number of line)
		
		
		System.out.println();            
					
						
		  int pA2 =( 1 / number )  ;                                  // initiate inverse of height 
		  int pB2  = number  ;                                        // height 
			
		    for(int q = 0 ; q < number ; q++)                        // loop of the number of line        
			 {
				
					for ( int s = pB2; s > 0; s--)                    // loop for the first space before the triangle
					{
								System.out.printf("%s","  ");
								}
					
					for(int n = pA2 ; n > 0 ; n--)                    // loop for the left part of the triangle ( left right triangle)
							{
							System.out.printf("%s","+ ");
							}
						
				
					for(int w = pA2+1 ; w > 0 ; w--)                // loop for the right part of the triangle ( right right triangle)
						{
						System.out.printf("%s","+ ");
						}
	
					pA2++;     
					pB2--;
				
					
					System.out.println();
				}
		    
	System.out.println("\n You can try another one :) \n");
}
	
		
	
	public static void triangleB() {                           // inverted Triangle method  
		
		System.out.println("Enter the height of the triangle (the amount of rows )\n ");

		int number;                                  
		Scanner objectNumber = new Scanner(System.in);
		
		number = objectNumber.nextInt();                       // height value(number of line)
		
		
		  int pA=( 1 / number );           
		  int pB = number  ;                   
						
						
		  for(int i = 0 ; i < number ; i++)                       // loop of the number of line 
					 {
					
						for(int t = pA; t > 0 ; t--)              // loop for the first space before the triangle
							{
								System.out.printf("%s","  ");
							}
							
							
						for (int v = pB-1; v > 0; v--)              // loop for the left part of the triangle ( left right triangle)
							{
								System.out.printf("%s","+ ");
							}
						
						for (int e= pB; e> 0; e--)                   // loop for the right part of the triangle ( right right triangle)
							{
								System.out.printf("%s","+ ");
							}
						
						
					pA++;
					pB--;
					
						System.out.println();
						
					 }
		  System.out.println("\n You can try another one :) \n");
	}
	
	
	
	public static void square() {                                 // square  method 
		
		System.out.println("Enter the height of the square (the amount of rows )\n");

		int number;                                  
		Scanner objectNumber = new Scanner(System.in);
	
		number = objectNumber.nextInt();                         // height value(number of line)
	           
		
		System.out.println(); 
		
		    int pA = number  ;            
			
		for(int i = 0 ; i < number ; i++)                        // loop of the number of line 
		 {
		
			for(int t = pA; t > 0 ; t--)                         // loop for the print of the square
				{
				System.out.printf("%s","+ ");
				}
				
			System.out.println();
			
		 }
		
		System.out.println("\n You can try another one :) \n");

	}
	
	
	public static void bowtie() {                                  // bow tie method  
		
		System.out.println("To see a nice shape, enter a number higher than (5)");
		System.out.println("Enter the height of the bow tie (Half the amount of rows )\n");
		


		int number;                                   
		Scanner objectNumber = new Scanner(System.in);
		
		number = objectNumber.nextInt();                         //  half of height of the bow tie shape  
				
			
		System.out.println(); 
				
	  int pA=( 1 / number ) + 1 ;                            // function of top left triangle on the bow tie 
	  int pB = number  ;                                     // function of too right triangle on the bow tie 
					
	  int pm = 2 * (number );                            // function of middles lines on the bow tie 
					
	  int pA2 =( 1 / number ) + 1 ;                         // function of down left triangle on the bow tie 
	  int pB2  = number  ;                                  // function of down right triangle on the bow tie 
					
	  for(int i = 0 ; i < number ; i++)                      // loop for the tops' triangles on the shape
				 {
				
					for(int t = pA; t > 0 ; t--)            // top left triangle 
						{
							if (t <=2) {                    
								System.out.printf("%s","");
							}
							
							else {	
							System.out.printf("%s","+ ");
							}
						
						}
			
					
					for (int v = pB +1; v > 0; v--)       // first spacing
						{
							System.out.printf("%s","  ");
						}
					
					for (int e= pB+1; e> 0; e--)         // second spacing
						{
							System.out.printf("%s","  ");
						}
					
					for(int o = pA; o > 0 ; o--)        // loop for top right triangle
						{
						if (o <= 2) {
							System.out.printf("%s","");
							}
						else {
							System.out.printf("%s","+ ");
							}
						
						}	
					
				pA++;
				pB--;
				
					System.out.println();
					
				 }
				
				
				
		final int NUMBERLOOP = 4;                    // 3 as 3 middles lines
		
		for ( int g = 0; g < NUMBERLOOP; g++)        //loop for the 3 lines
			{	
				for(int z = 0; z < pm; z++)  
				 { 
					System.out.printf("%s","+ ");
					
				 }
					System.out.println();
			}
				
			
				
				
		for(int q = 0 ; q < number ; q++)                  // loop for the downs' triangles on the shape
			 {
				
					for ( int s = pB2; s > 0; s--)         // down left triangle 
						{
							if (s <= 2) {
								System.out.printf("%s","");
								}
							
							else {
								System.out.printf("%s","+ ");
								}
						}
					
					for(int n = pA2+1 ; n > 0 ; n--)        // spacing 1
							{
							System.out.printf("%s","  "); 
							}
						
				
					for(int w = pA2+1 ; w > 0 ; w--)         // spacing 2
						{
						System.out.printf("%s","  ");
						}
			
				
					for ( int u = pB2; u > 0; u--)               // down right triangle   
						{
							if (u <=2) {
								System.out.printf("%s","");
							}
						
							else {
								System.out.printf("%s","+ ");
							}
						}
	
					pA2++;
					pB2--;
				
					System.out.println();
		 }
				
		System.out.println("\n You can try another one :) \n");
	}
	
	
}                                                                                                            // sept:)