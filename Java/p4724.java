import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        int lastIndex = str.length();
        System.out.println(str.charAt(2)); //1
        System.out.println(str.charAt(lastIndex - 2)); //2
        System.out.println(str.substring(0, 5)); //3
        System.out.println(str.substring(0, lastIndex - 2));//4
        for (int i = 0; i < str.length(); i += 2)  //5
            System.out.print(str.charAt(i));
        System.out.println();
        for (int i = 1; i < str.length(); i += 2)  //6
            System.out.print(str.charAt(i));
        System.out.println();
        System.out.println(new StringBuilder(str).reverse().toString());//7
        for (int i = lastIndex - 1; i > -1; i -= 2) //8
            System.out.print(str.charAt(i));
        System.out.println();
        System.out.println(str.length()); //9
    }

}
