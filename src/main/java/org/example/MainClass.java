public class MainClass {
    public static void main(String[] args) {

    }

    static void countDown(int num) {
        if (num == 0)// test
            System.out.println("Blastoff!");
        else {
            System.out.println("..");
            countDown(num - 1);// recursive call
        }
    }
}
//Task 01:
/**
 * Since the countdown method is never called within main the code will not produce output when executed
 * the countdown emthod is defined but not invoked so the prgram will terminate without printing
 * anything
 */

