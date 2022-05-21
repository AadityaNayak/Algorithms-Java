package algorithms;

import java.util.Scanner;
//import java.math.*;

public class A1SieveOfEratostgenes {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		boolean arr[];
		arr = new boolean[n + 1];
		
		// Initializing values of 0, 1, 2 by their prime status
		arr[0] = false;
		arr[1] = false;
		arr[2] = true;
		
		// Initializing all others prime status as true
		for (int i = 3; i < n + 1; i++) {
			arr[i] = true;
		}
		
		// Implementing SieveOfEratostgenes logic
		for (int i = 2; i*i <= n + 1; i++) {

			if (arr[i] == true) {
				for (int j = i+1; j < n+1; j++) {
					if (j % i == 0) {
						arr[j] = false;
					}
				}
			}
			else {
				continue;
			}
		}
		
		// Printing result
		for (int i = 0; i < n + 1; i++) {
			if (arr[i] == true) {
				System.out.print(i + " ");
			}
		}
		
		in.close();

	}
}
