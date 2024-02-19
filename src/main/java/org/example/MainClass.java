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
