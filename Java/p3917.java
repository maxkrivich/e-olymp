
public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(new java.util.Scanner(System.in).nextInt()));

    }

    public static String isPrime(int N) {
        if (N < 2) {
            return "False";
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return "False";
            }
        }
        return "True";
    }
}
