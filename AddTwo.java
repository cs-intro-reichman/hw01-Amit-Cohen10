/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Created a variable named sum and sum in it the two arguments we want tp add
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println(args[0] + " + " + args[1] + " = " + sum);
	}
}
