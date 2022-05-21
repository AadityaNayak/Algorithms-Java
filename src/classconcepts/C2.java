package classconcepts;

import java.io.*;
import java.util.*;
import java.lang.Math;

// Example of using for loop

/*public class C2 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println(a + " x " + (i + 1) + " = " + a * (i + 1));
		}
	}
}*/

// To count number of digits in input

/*public class C2 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int count = 0;
		
		// Using do while since input can also be 0
		do {
			count++;
			a = a / 10;
		} while (a != 0);
		System.out.println(count);
	}
}*/

// Operating on matrix (matrix addition)

/*public class C2 {

	public static void main(String args[]) {
		int a[][];
		int b[][];
		int c[][];

		a = new int[3][3];
		b = new int[3][3];
		c = new int[3][3];
		
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
		}
		
		in.close();

	}
}*/

// Factorial of a number

/*public class C2 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int fact = 1;
		
		for(int i = n; i>1; i--) {
			fact *= i;
		}
		
		System.out.println("The fact of " + n + " is " + fact);
	}
}*/

// Printing patterns

/*public class C2 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println();
			for(int j =0; j<i+1; j++) {
				System.out.print(j+1 + " ");
			}
		}
		
		System.out.println();
		
		for(int i = n; i>0; i--) {
			System.out.println();
			for(int j = 0; j<i; j++) {
				System.out.print(j+1 + " ");
			}
		}
		
	}
}*/

// To print 1/x + 1/x^2 + ......................

/*public class C2 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		float sum = 0;
		
		for(int i = 0; i<4; i++) {
			sum += (float)(1/Math.pow(n, i+1));		}	
		System.out.println(sum);
		}
	
}*/