package org.example; // Declare the package org.example

public class Task02 { // Define a public class named Task02

    // Define the gcd method
    static int gcd(int x, int y) { // Define a static method named gcd that takes two integer arguments: x and y
        if (x % y == 0) // Check if y divides x evenly
            return y; // Return y if it divides x evenly (base case)
        else
            return gcd(y, x % y); // Return the result of a recursive call with arguments y and the remainder of x divided by y
    }
}
