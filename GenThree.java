/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;
public class GenThree {
	public static void main(String[] args) {
        // i.e. greater than or equal to a and less than b, prints them, and then prints the minimal number
        // that was generated
        Random rand = new Random();

        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int rnd1 = rand.nextInt((max - min)) + min;
        int rnd2 = rand.nextInt((max - min)) + min;
        int rnd3 = rand.nextInt((max - min)) + min;

        int minimum = Math.min(rnd1, rnd2);
        minimum = Math.min(minimum, rnd3);
        System.out.println(rnd1 + "\n" + rnd2 + "\n" + rnd3 + "\n" + "The minimal generated number was " + minimum);
        }

}
