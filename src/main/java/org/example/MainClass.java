public class MainClass {
    public static void main(String[] args) {
        countDown(10); // Start countdown from 10
    }

    static void countDown(int num) {
        if (num == 0) {
            System.out.println("Blastoff!");
        } else {
            if (num % 2 == 0) { // Check if num is even
                System.out.println(num);
            }
            countDown(num - 1); // Recursive call
        }
    }
}

//Task 01:
/**
 * Since the countdown method is never called within main the code will not produce output when executed
 * the countdown emthod is defined but not invoked so the prgram will terminate without printing
 * anything
 */
/**
 * printd only even numbers
 */
/**
 * In the countDown() method, the algorithm iterates recursively from the given number (num) down to 0.
 * In each recursive call, it performs constant-time operations (comparisons and printing),
 * and it reduces the value of num by 1 in each step. Since the algorithm linearly decrements num by 1 in each recursive call until it reaches 0,
 * the number of recursive calls is proportional to the value of num.
 * Therefore, the time complexity is linear and is expressed as O(n), where n is the value of the input number num.
 */

