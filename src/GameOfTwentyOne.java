import java.util.Scanner;

/**
 * @author ryley
 *
 */
public class GameOfTwentyOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int playerScore = 0;
		int comScore = 0;
		int comTotal = 0;
		
		Scanner key = new Scanner(System.in);
		
		while(playerScore <= 21 && comTotal <= 21)
		{
			String choice;
			System.out.println("Do you want to hit (Yes or No)");
			choice = key.nextLine();
			
			Die roll = new Die();
			
			comScore = roll.getValue();
			comTotal = comTotal + comScore;
			
			System.out.println(comTotal);
			
			if(choice == "Yes")
			{
				
				
				
			} else {
				
			}
		}
	}

}
