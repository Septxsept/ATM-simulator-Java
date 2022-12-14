import java.util.Scanner;

public class homework21 { 

	public static void main(String[] args) {
	
		
		String userNam;
		Scanner object1 = new Scanner(System.in);        
		System.out.println("Enter the User name");
		userNam = object1.nextLine();
		
		int userAge;
		Scanner object2 = new Scanner(System.in);
		System.out.println('\n' + "Enter your age");
		userAge = object2.nextInt();                      
		 
		System.out.println('\n' + "Thanks for the information. Now let do some calculation. ");
		
		double number1;
		Scanner object3 = new Scanner(System.in);
		System.out.println('\n' + "Please Enter the 1st number ");
		number1 = object3.nextDouble();
		
		double number2;
		Scanner object4 = new Scanner(System.in);
		System.out.println('\n' + "Please Enter the 2nd number ");
		number2 = object4.nextDouble();
		
		double add, subtract, multiply, divide, mod;
		
		add = number1 + number2;
		subtract = number1 - number2;
		multiply = number1 * number2;
		divide = number1 / number2;
		mod = number1 % number2;
		
		System.out.println('\n' + "User: " + userNam + '\n' + "Age: " + userAge);
		System.out.println("First number: " + number1 + '\n' + "Second number: " + number2);
		System.out.println('\n' + "The additin of the first and second nomber is " + add);
		System.out.println('\n' + "The subtraction of the first and second nomber is " + subtract);
		System.out.println('\n' + "The multiplication of the first and second nomber is " + multiply);
		System.out.println('\n' + "The division of the first and second nomber is " + divide);
		System.out.println('\n' + "The mod of the first and second nomber is " + mod);
	
	}
}
