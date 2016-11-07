import javax.swing.JOptionPane;
import java.util.Random;
public class HiLoGame{
	
	public static void main (String[] args) {
		//begin game by giving them a JOPtionPane with message to initialise
			int initialiseAnswer = JOptionPane.showConfirmDialog(null,"To begin game press YES, to cancel press NO");
			boolean initialise = (initialiseAnswer == JOptionPane.YES_OPTION);
	if (initialise == true){
				//generate a number between 1-14 
		Random generator = new Random();
		int cardValue = (generator.nextInt(13) + 2);
			JOptionPane.showMessageDialog(null, "Your initial card is " + 
									((cardValue < 11) ? "a " + cardValue : (cardValue == 11) ? "a Jack." : (cardValue == 12) ? "a Queen." :
											(cardValue == 13) ? "a King" : "an Ace." )
					);
			
			int rightAnswerCounter = 0;
				while (rightAnswerCounter < 4) {
					Random generatorTwo = new Random();
					int currentCard = generatorTwo.nextInt(13)+1;
					int userPrompt = JOptionPane.showConfirmDialog(null, "Is the next card greater than the previous card?");
					boolean userAnswer = (userPrompt == JOptionPane.YES_OPTION);
					if (userAnswer==true && (currentCard > cardValue))  {
						rightAnswerCounter += 1;
						cardValue = currentCard;
						JOptionPane.showMessageDialog(null, "Correct! You have guessed right " + rightAnswerCounter + " times!");
						
					} else if (userAnswer == false && (currentCard < cardValue)) {
						rightAnswerCounter += 1;
						cardValue = currentCard;
						JOptionPane.showMessageDialog(null, "Correct! You have guessed right " + rightAnswerCounter + " times!");
					}
					else {
						rightAnswerCounter = 0;
						cardValue = currentCard;
						JOptionPane.showMessageDialog(null, "Incorrect, please guess again. Your number of successively correct guesses has decreased to 0");
					}
				}
				
			}
			
			
				
		//once an initial card has been created begin counter of guesses and counter of correct answers and counter of 
		//cards 
		//create a while loop that creates random values between 2 and 14
		//for every correct answer store a right answer in a counter
		//for every wrong answer set the right answer counter to zero
		//make a tester for the right or wrong by checking if the random current value is lower than or greater thant the next value
		//make an if statement that transfers any value between 11 and 14 to its respective card names i.e. king, queen, etc.
	}
}