
public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        while(in.hasNextInt())
        System.err.println(Integer.toString(in.nextInt(), 2));
        in.close();
    }


}
