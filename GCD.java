import java.util.Scanner;

 /**
 * Problem Set 1
 * GCD.java
 * 
 * @author Ira Goldstein
 * @version Spring 2025
 * 
 * A recursive application that calculates the greatest
 * common denominator
 */
public class GCD {

    /**
     * Calculates GCD ecursively 
     *
     * @param int x The first of two numbers used to find the GCD
	 * @param int y The second of two numbers used to find the GCD
	 * @return Once GCD is found int containing the GCD of x and y
	 * @return else a call to GCD
     */    
    public static int GCD(int x, int y) {
		// Base Case if y is zero, GCD=x
        if(y == 0) {
            return x;
		// Recursive Step GCD(a, b) = GCD(b, a % b)
        } else {
            return GCD(y, (x % y));
        }
    }
    
    /**
    *
    * Reads in two integers and then prints the GCD
    * 
    * @param args are not used or checked
    * 
    */ 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // Create an input scanner from the standard input
		// Get two integers
        int first = scanner.nextInt();
        int second = scanner.nextInt();

		// Find and print the GCD
		System.out.println( GCD(first, second));
	}
}