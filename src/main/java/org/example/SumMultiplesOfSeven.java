// Declare the package name for this Java class
package org.example;

/**
 * Author: Himal Shrestha
 * Student ID: R01955141
 * Course: CSC 229 - Data Structure and Algorithms
 * Lab: 04
 * Task: SumMultiplesOfSeven
 * Description: Write a function that returns the sum of all numbers between
 * n1 and n2 that are multiples of 7 using recursion.
 */
public class SumMultiplesOfSeven {

    // Declare a static method that calculates the sum of numbers between n1 and n2 that are multiples of 7
    public static int sumMultiplesOfSeven(int n1, int n2) {
        // Check if the starting point (n1) is greater than the ending point (n2) to end recursion
        if (n1 > n2) {
            return 0; // Return 0 as there are no more numbers to process
        }

        // Determine if the current number (n1) is a multiple of 7 and store it in 'current'
        // If it is, 'current' will be n1; otherwise, it will be 0
        int current = (n1 % 7 == 0) ? n1 : 0;

        // Recursively call the function with the next number (n1 + 1) and add it to 'current'
        // This continues until n1 is greater than n2
        return current + sumMultiplesOfSeven(n1 + 1, n2);
    }

