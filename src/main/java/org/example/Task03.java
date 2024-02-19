package org.example; // Declare the package org.example

/**
 * Author: Himal Shrestha
 * Student ID: R01955141
 * Course: CSC 229 - Data Structure and Algorithms
 * Lab: 04
 * Task: 03
 * Description: the Fibonacci number at a specific position.
 */
public class Task03 { // Define a public class named Task03

    public static void main(String[] args) { // Main method entry point of the program

        int n = 10; // Initialize n to 10,
        // Print the Fibonacci number at position n, calling the fib method with n as argument
        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
    }

    public static int fib(int n) { // Define a static method fib to calculate the nth Fibonacci number
        if (n <= 0) // Check if n is less than or equal to 0, base case for termination
            return 0; // Return 0 for n <= 0 as per Fibonacci definition
        else if (n == 1) // Check if n is equal to 1, another base case
            return 1; // Return 1 for n = 1 as per Fibonacci definition
        else // If n is greater than 1
            // Calculate Fibonacci number recursively, sum of the two preceding numbers
            return fib(n - 1) + fib(n - 2);
    }
} // Ends the Task03 class

/**
 * the time complexity of this implementation is 10 but this can be analyzed by understanding the number of function
 * calls it makes. For each call to the fib(n), except for the base cases where n≤0 or n = 1, the function makes two
 * recursive called: one to fib(n-1) and another to fib (n-2).
 * Why: The algorithm's high complexity comes from repeatedly calculating the same Fibonacci numbers.
 * For instance, when finding the 4th Fibonacci number, it calculates the 2nd Fibonacci number twice.
 * As the target number increases, these repeated calculations grow rapidly,
 * leading to a huge number of unnecessary steps. This makes the algorithm very slow for larger numbers.
 *
 */