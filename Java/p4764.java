import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(n-- > 0){
            int cnt = 0;
            for(String c:in.nextLine().split("\\s+"))
                if("1".equals(c)) cnt++;
            System.out.println(cnt);
        }
       
    }

   
}
