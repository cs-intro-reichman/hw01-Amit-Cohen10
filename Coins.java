/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
        // Get the amount of coins and print the number of quaters and cents it represents
        int quarters = Integer.parseInt(args[0]) / 25;
        int cents = Integer.parseInt(args[0]) % 25;
        System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}
}