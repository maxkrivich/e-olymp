import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String str = new Scanner(System.in).next();
		char[] c = str.toCharArray();
		if(c[0]>c[2])
			System.out.println(c[0]);
		else if(c[0]<c[2])
			System.out.println(c[2]);
		else 
			System.out.println("=");
	}

}
