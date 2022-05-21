package classconcepts;
import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.io.*;
import java.time.*;

// Time complexity test for sum of first n natural numbers

/*public class C3 {
	public static double brute(double n) {
		double sum = 0;
		for(double i = 1; i<=n; i++) {
			sum+= i;
		}
		return sum;
	}
	
	public static double optimized(double n) {
		double sum = n*(n+1)/2;
		return sum;
	}
	
	public static void main(String args[]) {
	
	Scanner in = new Scanner(System.in);
	double n = in.nextDouble();

	System.out.println(brute(n) + "  " + optimized(n));
	
	}
	
}*/

// Date in java

/*public class C3 {
	
	public static void main(String args[]) {
	
	try {
		Date date = new Date();
		System.out.println(date.toString());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
}*/

// Top find prime numbers upto n. Time complexity --> n * n^1/2

/*public class C3 {
	
	public static boolean isprime(int n) {
		for(int i = (int) Math.sqrt(n); i>=2; i--) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	} 
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 2; i<=n; i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
}*/

