//First
public class Main {

    public static void main(String[] args) {
        System.out.println(getNumberOfSetBits(new java.util.Scanner(System.in).nextInt()));

    }

    private static int getNumberOfSetBits(int i) {
        i = i - ((i >> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
        return (((i + (i >> 4)) & 0x0F0F0F0F) * 0x01010101) >> 24;
    }
}

//Second

public class Main {

    public static void main(String[] args) {
        System.out.println(Integer.bitCount(new java.util.Scanner(System.in).nextInt()));

    }

}
