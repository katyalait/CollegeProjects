import java.util.Scanner; 
import javax.swing.JOptionPane;
import java.lang.Math;

public class main {
	//define constants to aid in converting from old pounds to new pounds
	public static final double OLD_PENNIES_IN_POUNDS = 0.67;
	public static final double SHILLINGS_IN_POUNDS = 12*OLD_PENNIES_IN_POUNDS;
	public static final double OLD_POUND_IN_NEW_POUNDS = 20*SHILLINGS_IN_POUNDS;
	
	public static void main(String[] args) {
		//take in values from console
		String input = JOptionPane.showInputDialog("Enter the value of old pennies (1 old pennies = 1)");
		Scanner inputScanner = new Scanner(input);
		double poundCounter = inputScanner.nextDouble(); //create counter of overall value
		poundCounter *= OLD_PENNIES_IN_POUNDS;
		
		input = JOptionPane.showInputDialog("Enter the value of shillings (1 shilling = 1");
		inputScanner = new Scanner (input);
		double shillingCounter = inputScanner.nextDouble();
		shillingCounter *= SHILLINGS_IN_POUNDS;
		poundCounter += shillingCounter;
		
		input = JOptionPane.showInputDialog("Enter the value of old pounds (1 old pound = 1");
		inputScanner = new Scanner (input);
		double oldPoundCounter = inputScanner.nextDouble();
		oldPoundCounter *= OLD_POUND_IN_NEW_POUNDS;
		poundCounter += oldPoundCounter;
		
		//convert double to two decimal places
		poundCounter *= 100;
		poundCounter = Math.floor(poundCounter); //cut off the unnecessary decimals and round
		poundCounter /= 100; //return to actual value
		
		
		JOptionPane.showMessageDialog(null, "Your entered value adds up to " + "£" + poundCounter);
		
		
				
	}
}