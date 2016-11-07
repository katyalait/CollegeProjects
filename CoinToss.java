import java.util.Random;

import javax.swing.JOptionPane;

public class CoinToss{
	public static void main(String[]args) {
		//create random generator with the interval  0 to 1
		//create a count loop for 10,000 times of toss created
		//store in variables for tailcount and headcount
		//store last toss 
		
		//Initiate the program
		int coinTosses = 10000;
		int tailCount = 0;
		int headCount = 0;
		int lastToss = 0;
				for (int i=1; i<=coinTosses; i++) {
					int coin = new Random().nextInt(2);
						if (coin==0) {
							tailCount = tailCount + 1;
							lastToss = 0;
						}
						else {
							headCount = headCount + 1;
							lastToss = 1;
					
					}
				}
			System.out.println(headCount);
			JOptionPane.showMessageDialog(null, 
					"The number of heads is " + headCount + ".");
			JOptionPane.showMessageDialog(null, 
					"The number of tails is "+ tailCount + ".");
			JOptionPane.showMessageDialog(null, 
					"The last toss was " + ((lastToss==1) ? "heads" : "tails") + ".");
			
		}
	}