
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
//import static java.util.Arrays.fill;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        int n = Integer.parseInt(in.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = in.nextInt();
        in.nextLine();
        int m = Integer.parseInt(in.nextLine());
        int[] b = new int[m];
        for (int i = 0; i < m; i++) 
            b[i] = in.nextInt();
        in.close();
        int[][] l = new int[n + 1][m + 1];
//        for(int[] arr : l)
//            fill(arr, 0);
        for (int i = n - 1; i >= 0; i--) 
            for (int j = m - 1; j >= 0; j--) 
                if (a[i] == b[j])
                    l[i][j] = l[i + 1][j + 1] + 1;
                else 
                    l[i][j] = Math.max(l[i + 1][j], l[i][j + 1]);
        pw.println(l[0][0]);
        pw.flush();
        pw.close();
    }
}
