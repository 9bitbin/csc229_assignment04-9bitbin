package org.example; // Declare the package name for this Java class

/**
 * Author: Himal Shrestha
 * Student ID: R01955141
 * Course: CSC 229 - Data Structure and Algorithms
 * Lab: 04
 * Task: HelloWorld
 * Description: Write a function that prints "Hello World" n times recursively.
 */
public class HelloWorld { // Declare the class HelloWorld
    public static void main(String[] args) { // Define the main method that serves as the entry point for the program
        int n = 10; // Declare an integer variable n and initialize it to 10.
        printHelloWorld(n); // Call the printHelloWorld method with the value of n to print "Hello World" n times
    }
    public static void printHelloWorld(int n) { // Define a static method printHelloWorld that takes an integer n as argument
        if (n <= 0) { // Check if n is less than or equal to 0
            return; // If true, return from the method to stop the recursion
        }//ends the if statement
        System.out.println("Hello World"); // Print "Hello World" to the console
        printHelloWorld(n - 1); // Recursively call printHelloWorld with n decremented by 1
    }
}//end class
