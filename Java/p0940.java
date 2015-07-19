
public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt(), x3 = in.nextInt(), y3 = in.nextInt();
        System.out.printf(java.util.Locale.US, "%.1f\n", getArea(getLength(x1, y1, x2, y2),getLength(x1, y1, x3, y3),getLength (x2, y2, x3, y3)));
    }

    public static double getLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public static double getArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
