
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine()), i = 0;
        ArrayList<LinkedList<String>> arr = new ArrayList<LinkedList<String>>(n);
        for (int k = 0; k < n; k++) 
            arr.add(new LinkedList<String>());
        while (n-- > 0) {
            int j = 1;
            for (String ns : in.nextLine().split("\\s+")) {
                if ("1".equals(ns)) 
                    arr.get(i).addLast(String.valueOf(j));                
                j++;
            }
            i++;
        }
        for (int j = 0; j < arr.size(); j++) {
            System.out.printf("%d ", arr.get(j).size());
            Iterator x = arr.get(j).listIterator();
            while (x.hasNext()) 
                System.out.printf("%s ", x.next());
            System.out.printf("\n");  
        }
    }
}
