package xyz.ethane.calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String [] args) {
		Scanner ethane = new Scanner(System.in); // Creates a scanner which recognizes user input.
		
		float val1, val2, answer; // Creates 3 float variables.
		
		System.out.println("Value #1: ");
		val1 = ethane.nextFloat(); // Stores first value (float) as the first input.

		
		System.out.println("Value #2: ");
		val2 = ethane.nextFloat();	 // Stores second value (float) as the second input.
		
		answer = val1 + val2; // Sums the values of the two floats.

		if (val1 < 10 | val2 < 10) { // If any of the inputed floats are values less than 10,
			System.out.println("You can easily do that!"); // Print to console.
		} else {
			System.out.println("The sum of these values is equal to: " + answer); // If not less than 10, print this.
		}

	}
	
}
