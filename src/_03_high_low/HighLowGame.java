//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100) + 1;
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			int UserGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100. Plese only respond with a number (Ex: 4.) \nNumber of guesses remaining: " + (10 -i)));
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
			if (UserGuess == random) {
				JOptionPane.showMessageDialog(null, "You won.");
			
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
				System.exit(0);
			} else if (UserGuess > random) {
			// 7. if the guess is high
			
				// 8. Tell them it's too high
				JOptionPane.showMessageDialog(null, "Your guess is too high.");
			} else if (UserGuess < random) {
				
			// 9. if the guess is low
			
				// 10. Tell them it's too low
				JOptionPane.showMessageDialog(null, "Your guess is too low.");
			}
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lose.");
		
	}

}


