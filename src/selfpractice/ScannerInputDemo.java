package selfpractice;
import java.io.*;
import java.util.Scanner;


public class ScannerInputDemo {
	public static void main(String args[]) {
		
		// By using System.in to give standard input device
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println(a + b);
		
		// To take int value ==> nextInt()
		// To take float value ==> nextFloat()
		// To take double value ==> nextDouble()
		// To take String value ==> next()
		// To take char value ==> nextChar()
		
		// To give line as an input ==> nextLine()
		
		// To extract a character from input
		char ch = in.next().charAt(0);
		
		in.close();
	}
}