import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a=BigInteger.ONE;
		a=a.add(BigInteger.ONE);
		a=a.pow(in.nextInt());
		a=a.subtract(BigInteger.ONE);
		System.out.println(a.toString());
		
	}

}
