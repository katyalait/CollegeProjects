import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class IncrementalStatistics {
	
	public static void main(String[]args) {
		// while not exit do this
		boolean exit = false;
		double average = 0;
		double numberCounter = 0;
		double variance = 0;
		try {
		while (exit != true) {
			String userInput = JOptionPane.showInputDialog(null, "So far the average is " + average
					+ " and the variance is " + variance +". Enter another number to compute new average or simply type exit.");
			Scanner scanner = new Scanner(userInput);
			if (scanner.hasNextDouble()) {
				double number = scanner.nextDouble();
				numberCounter += 1;
				double averageTemp = (number - average);
				averageTemp = averageTemp/numberCounter;
				averageTemp = average + averageTemp;
				
				variance = ((variance * (numberCounter-1)) + ((number - average) * (number - averageTemp)))/(numberCounter);
				average = averageTemp;
			} else if (scanner.hasNext("exit")) {
				exit = false;
				
			} 
			
	}
		} catch (NullPointerException exception) {
			JOptionPane.showMessageDialog(null, "You pressed cancel, please type exit if you want to leave the program");
		}
}
}