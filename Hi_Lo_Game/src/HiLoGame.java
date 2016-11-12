import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class HiLoGame {

	public static void main(String[] args) {
		int initialiseAnswer = JOptionPane.showConfirmDialog(null, "To begin game press YES, otherwise press NO or CANCEL.");
		boolean initialise = (initialiseAnswer == JOptionPane.YES_OPTION);
		try { 
			if (initialise == true) {
		
			// generate a number between 1-14
			Random generator = new Random();
			int cardValue = (generator.nextInt(13) + 2);
			int rightAnswerCounter = 0;
			int numberOfGuesses = 0;
			while (rightAnswerCounter < 4 && initialise ==true) {
				int currentCard = generator.nextInt(13) + 2;
				String userResponse = JOptionPane.showInputDialog(null, "Your card is " + ((cardValue < 11) ? "a " + cardValue + ". "
							: (cardValue == 11) ? "a Jack. "
									: (cardValue == 12) ? "a Queen. " : (cardValue == 13) ? 
											"a King. " : "an Ace. ") + "\nDo you think "
											+ "your next card is Higher (hi), Lower (lo) or Equal (eq) to the next one? "
												+ "\nIf you want to exit the game, type 'exit'");
				
				Scanner responseScanner = new Scanner(userResponse);
				if ( responseScanner.hasNext("hi") && (currentCard > cardValue)) {
					rightAnswerCounter += 1;
					cardValue = currentCard;
					numberOfGuesses += 1;
					JOptionPane.showMessageDialog(null,
							"Correct! You have guessed right " + rightAnswerCounter + " times!");
				} else if (responseScanner.hasNext("lo") && (currentCard < cardValue)) {
					rightAnswerCounter += 1;
					cardValue = currentCard;
					numberOfGuesses += 1;
					JOptionPane.showMessageDialog(null,
							"Correct! You have guessed right " + rightAnswerCounter + " times!");
				} else if (responseScanner.hasNext("eq") && (currentCard == cardValue)){
					rightAnswerCounter += 1;
					cardValue = currentCard;
					numberOfGuesses += 1;
					JOptionPane.showMessageDialog(null,
							"Correct! You have guessed right" + rightAnswerCounter + " times!");
				} else if (responseScanner.hasNext("eq") || responseScanner.hasNext("lo") || responseScanner.hasNext("hi")){
					rightAnswerCounter  = 0;
					cardValue = currentCard;
					numberOfGuesses += 1;
					JOptionPane.showMessageDialog(null,
							"Incorrect! You number of successive correct answers has decreased to " + rightAnswerCounter + ".");
					} else if (responseScanner.hasNext("exit")){
						initialise = false;	
					} else {
						JOptionPane.showMessageDialog(null, "Please enter a valid response");
					}
				}

					if (rightAnswerCounter == 4){
						JOptionPane.showMessageDialog(null, "Congratulations! You have 4 correct answers in a row. \n" 
								+ "It took you a total of " + numberOfGuesses + " times. ");
					}
			}	
		} catch(NullPointerException exception) {
			JOptionPane.showMessageDialog(null, "Thank you for playing, good-bye.");
		}
	}	
}