package algorithms;

import java.util.Scanner;

// Method 1

/*public class A6EuclidianAlgorithm {
	
	public static int euclidianGCD(int m, int n) {
		if(m == 0) {
			return n;
		}
		return euclidianGCD(n%m, m);
	}
	
	
	public static void main(String args[]) {
		System.out.println(euclidianGCD(10, 7));
	}
}*/

// Method 2

/*public class A6EuclidianAlgorithm {

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;

		if (a < b)
			return gcd(b, a);
		return gcd(b, a % b);
	}

	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter two numbers");
        int a1=sc.nextInt();
        int a2=sc.nextInt();

        System.out.println(gcd(a1,a2));
}*/