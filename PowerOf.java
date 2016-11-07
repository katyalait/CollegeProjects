import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PowerOf{
	public static void main(String[]args)	{
		try{
			String userInput = JOptionPane.showInputDialog(null, "Please enter a base value: ");
			Scanner base = new Scanner(userInput);
			int inputBase = base.nextInt();
			userInput = JOptionPane.showInputDialog(null, "Please enter an exponent value: ");
			Scanner exponent = new Scanner(userInput);
			
			int inputExponent = exponent.nextInt();
			if (inputExponent < 0)	{ JOptionPane.showMessageDialog(null, "Please enter a positive value for the integer");} else {
			int outputValue = inputBase;
			 for (int counter=0; counter<inputExponent-1; counter += 1) {
				if (inputExponent == 0) {
					inputBase = 1;
				}
				else {
					outputValue = outputValue*inputBase;
				}
				 
			 }	
			
			JOptionPane.showMessageDialog(null, "The answer is " + outputValue);
		}
		}	catch(NullPointerException exception){
			JOptionPane.showMessageDialog(null, "You pressed cancel, please select a valid option or type exit to leave the program");
		}
		catch (NoSuchElementException exception){
			JOptionPane.showMessageDialog(null, "Please enter a value in order to continue");
		}
	}
}