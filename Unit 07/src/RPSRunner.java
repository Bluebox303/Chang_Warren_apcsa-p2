//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		do{
			System.out.print("Rock-Paper-Scissors - select your weapon[R,P,S]::");
			String player = keyboard.next();
			RockPaperScissors test = new RockPaperScissors(player);
			//test.RockPaperScissors(player);
			test.setPlayers(player);
			
			System.out.println("player had "+ player);
			System.out.println("computer had "+  );
			System.out.println(test.determineWinner()+"\n");
			 //System.out.println(test);
			
			System.out.print("Do you want to play again? ");
			response = keyboard.next().charAt(0);
			
			//String player = "";
			//out.print("type in your prompt [R,P,S] :: ");
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
		}while(response=='Y'||response=='y');
			
	}
}



