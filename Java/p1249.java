
public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        while (in.hasNextInt()) 
            System.out.println(getFirstNumber(in.nextInt()));
    }

    private static long getFirstNumber(int n) {
        double len = Math.floor(n * Math.log10(n)) + 1;
        double ost = n * Math.log10(n) + 1.0 - len;
        return (long) Math.pow(10.0, ost);
    }

}
