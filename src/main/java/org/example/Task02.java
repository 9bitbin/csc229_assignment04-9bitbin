package org.example; // Declare the package org.example
/**
 * @author Himal Shrestha - R01955141
 * CSC 229 - Data Structure and Algorithims
 * Lab 04 - Task002
 */

public class Task02 { // Define a public class named Task02
    //    public static void main(String[] args) {
    //        // Define the gcd method
    //         int result = gcd(24, 18);
    //        System.out.println("GCD: " + result );
    //    }
    //    static int gcd(int x, int y) { // Define a static method named gcd that takes two integer arguments: x and y
    //        if (x % y == 0) // Check if y divides x evenly
    //            return y; // Return y if it divides x evenly (base case)
    //        else
    //            return gcd(y, x % y); // Return the result of a recursive call with arguments y and the remainder of x divided by y
    //    }

    //substraction instead of %
    public static void main(String[] args) {
        // Define the gcd method
        int result = gcd(36, 20);
        System.out.println("GCD: " + result);
    }

    static int gcd(int x, int y) { // Define a static method named gcd that takes two integer arguments: x and y
        while (x != y) { // Loop until x equals y
            if (x > y) { // If x is greater than y
                x = x - y; // Subtract y from x
            } else { // If y is greater than x
                y = y - x; // Subtract x from y
            }
        }
        return x; // Return the GCD (x or y since x equals y)
    }

}
/**TASK 02
 * there is no output of the code because we have not called GCD numbers
 */
/**
 * modified to have values of GCD: the ourput was 6, when GCD x: 24 and y: 18
 */
/**
 * using subtraction to find GCD i got 4 when x: 36 and y:20
 */