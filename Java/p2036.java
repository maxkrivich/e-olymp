
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year >= 10 && year <= 20) {
            System.out.println(year + " rokiv");
        }
        else {
            if(year%10==1)
                System.out.println(year + " rik");
            if(year%10==2||year%10==3||year%10==4)
                System.out.println(year +" roki");
            if(year%10==0||year%10==5||year%10==6||year%10==7||year%10==8||year%10==9)
                System.out.println(year +" rokiv");
        }
        in.close();
    }

}
