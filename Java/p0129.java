
public class Main {

    public static void main(String[] args) {
        int r = new java.util.Scanner(System.in).nextInt(), cnt = 0;
        for(int i = 1; i < r; i++)
          cnt += (int) Math.sqrt(r*r-i*i);
        cnt *= 4;  
        System.out.println(cnt);
    }

}
