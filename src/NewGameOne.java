import java.util.Scanner;

public class NewGameOne 
{ 
	public static void main(String[] arguments) 
	{ 
		DiceMain die1 = new DiceMain();
		DiceMain die2 = new DiceMain();
		Scanner in = new Scanner(System.in);
		
		int roll1 = die1.roll();
		int roll2 = die2.roll();
		int value = roll1 + roll2;

		String method;
		System.out.println("Do you want to play craps? (type yes or no)");
		method = in.next();
		in.nextLine();
		
		while(!method.equals("yes") && !method.equals("no"))
		{
			System.out.println("Invalid. Please try again");
			method = in.next();
			in.nextLine();
		}
		
		if(method.equals("no"))
		{
			System.out.println("Ok, bye");
		}
		else
		{
			roll1 = die1.roll();
			roll2 = die2.roll();
			value = roll1 + roll2; 
			System.out.println("Press enter to roll");
			in.nextLine();
		}
while(method.equals("yes"))
{
		
	System.out.println("Your die1 rolled a... " + roll1 + "\tYour die2 rolled a... " + roll2);
	System.out.println("The sum for the two dice rolls is " + value); 
	
	if (value == 7 || value == 11) 
	{
		
		System.out.println("You win!"); 
		System.out.println("Would you like to play again? (yes or no)");
		method = in.next();
		roll1 = die1.roll();
		roll2 = die2.roll();
		value = roll1 + roll2; 
		in.nextLine();
	}
	else if (value == 2 || value == 12) 
	{
		System.out.println("You lose!"); 
		System.out.println("Would you like to play again? (yes or no)");
		method = in.next();
		roll1 = die1.roll();
		roll2 = die2.roll();
		value = roll1 + roll2; 
		in.nextLine();
	}
	else 
	{ 
		int point = value; 
		System.out.println("Keep rolling, your point is " + point); 
		roll1 = die1.roll();
		roll2 = die2.roll();
		value = roll1 + roll2;
		System.out.println("Press Enter to roll");
		in.nextLine();
		
		if (value == point) 
		{
			System.out.println("You win!"); 
			System.out.println("Would you like to play again? (yes or no)");
			method = in.next();
		
		}
		else if (value == 7) 
		{
			System.out.println("You lose!"); 
			System.out.println("Would you like to play again? (yes or no)");
			method = in.next();
		
		}
		else
		{
			
			while(value != point && value != 7) 
			{
				
				System.out.println("Your die1 rolled a... " + roll1 + "\tYour die2 rolled a... " + roll2);
				System.out.println("The sum for the two dice rolls is " + value); 
				
				System.out.println("Keep rolling to try to get your point"); 
				System.out.println("Press enter to roll");
				in.nextLine();
				roll1 = die1.roll();
				roll2 = die2.roll();
				value = roll1 + roll2;
			
			}	
			
			System.out.println("Your die1 rolled a... " + roll1 + "\tYour die2 rolled a... " + roll2);
			System.out.println("The sum for the two dice rolls is " + value); 
			
			if (value == point) 
			{
				System.out.println("You win!"); 
				System.out.println("Would you like to play again? (yes or no)");
				method = in.next();
			
			}
			else if (value == 7) 
			{
				System.out.println("You lose!"); 
				System.out.println("Would you like to play again? (yes or no)");
				method = in.next();
			}
		}
		roll1 = die1.roll();
		roll2 = die2.roll();
		value = roll1 + roll2;
	}
}
	}
}

