
public class Main {

    public static void main(String[] args) {
        System.out.println(getCounts(new java.util.Scanner(System.in).nextInt()));
    }

    private static int getCounts(int n) {
        int cnt = 0, i = 9;
        while (++i < 1e2) 
            if (sumDigit(i) == sumDigit(i * n)) 
                cnt++;
        return cnt;
    }

    private static int sumDigit(int n) {
        return n < 10 ? n : sumDigit(n % 10 + sumDigit(n / 10));
    }
}
