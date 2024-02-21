// Declare the package name for this Java class
package org.example;

/**
 * Author: Himal Shrestha
 * Student ID: R01955141
 * Course: CSC 229 - Data Structure and Algorithms
 * Lab: 04
 * homework: BinarySearch
 * Description: this program is a function that implements the binary search algorithm recursively in java
 */
// Declare a public class named BinarySearch
public class BinarySearch {

    /**
     * A recursive binary search function. It returns the location of x in
     * given array arr[l..r] if present, otherwise returns -1.
     *
     * @param arr Array where the search is performed.
     * @param l   Left index of the array to be searched.
     * @param r   Right index of the array to be searched.
     * @param x   The value to be searched in the array.
     * @return The index of x if it is in array arr, otherwise -1.
     */
    // Define a static method for binary search
    public static int binarySearch(int arr[], int l, int r, int x) {
        // Check if the right index is greater than or equal to the left index
        if (r >= l) {
            // Calculate the middle index of the current segment
            int mid = l + (r - l) / 2;

            // Check if the element at the middle index is the search key
            if (arr[mid] == x)
                return mid; // Return the middle index if the search key is found

            // If the element at the middle index is greater than the search key
            if (arr[mid] > x)
                // Recur for the left sub-array
                return binarySearch(arr, l, mid - 1, x);

            // Recur for the right sub-array if the element is smaller than the mid element
            return binarySearch(arr, mid + 1, r, x);
        }

        // Return -1 if the element is not found in the array
        return -1;
    }


    // Main method to run the program
    public static void main(String args[]) {
        // Initialize an array of integers
        int arr[] = { 2, 3, 4, 10, 40 };
        // Calculate the length of the array
        int n = arr.length;
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
