package org.example;

import static org.example.BinarySearch.binarySearch;
import static org.example.HelloWorld.printHelloWorld;
import static org.example.SumMultiplesOfSeven.sumMultiplesOfSeven;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 01: Hello World");
        System.out.println();
        int n = 10; // Declare an integer variable n and initialize it to 10.
        printHelloWorld(n); // Call the printHelloWorld method with the value of n to print "Hello World" n times

        System.out.println();
        System.out.println("Homework 02: Sum Multiples of Seven");
        System.out.println();
        int n1 = 1; // Define the start of the range
        int n2 = 50; // Define the end of the range

        // Call the sumMultiplesOfSeven method with n1 and n2 and store the result in 'sum'
        int sum = sumMultiplesOfSeven(n1, n2);

        // Print out the result
        System.out.println("The sum of all numbers between " + n1 + " and " + n2 + " that are multiples of 7 is: " + sum);

        System.out.println();
        System.out.println("Homework 03: Binary Search");
        System.out.println();

        // Initialize an array of integers
        int arr[] = { 2, 3, 4, 10, 40 };
        // Calculate the length of the array
        int o = arr.length;
        // Define the value to search for
        int x = 10;
        // Call the binary search method and store the result
        int result = binarySearch(arr, 0, n - 1, x);
        // Check if the result is -1, which means the element is not found
        if (result == -1)
            System.out.println("Element not present"); // Print element not present
        else
            // Otherwise, print the index where the element was found
            System.out.println("Element found at index " + result);


    }
}
