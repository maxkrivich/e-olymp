import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(fib(new Scanner(System.in).nextByte()));
    }

    public static long fib(int n) {
        if (n <= 0) {
            return 0L;
        } else if (n == 1) {
            return 1L;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}