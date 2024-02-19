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


