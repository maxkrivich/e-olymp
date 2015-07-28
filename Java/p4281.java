
public class Main {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        while (in.hasNextLine()) 
            System.out.println(getConvertString(in.nextLine().toCharArray()));
        in.close();

    }

    private static String getConvertString(char[] arr) {
        StringBuilder str = new StringBuilder();
        for (char c : arr) {
            if (Character.isUpperCase(c)) 
                c = Character.toLowerCase(c);
             else 
                c = Character.toUpperCase(c);
            str.append(c);
        }
        return str.toString();
    }

}
