package classconcepts;

import java.util.Scanner;

// Apples Problem

public class C4 {
	
	/*Given,
	 * 
	 * Possible values for apple color = red and green.
	 * 
	 * Number of tree to the south have no green apples
	 * Number of tree to the north have no red apples
	 * Number of tree to the west have some red apples and others are geeen
	 * Number of tree to the east have some green apples and others are red
	 * */

	// S --> Number of trees in south
	// N --> Number of trees in north
	// E --> Number of trees in east
	// W --> Number of trees in west
	// K --> Number of trees on each tree
	// M --> M red apples

	/* Task is to find minimum number of apples to be collected from the trees to
	guarantee m red apples if it is not possible print -1*/

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		int n = in.nextInt();
		int e = in.nextInt();
		int w = in.nextInt();

		if (m <= s * k) {
			System.out.println(m);
		}
		// Assumed every tree in east and west direction have atleast one red apple
		else if (m <= s * k + e + w) {
			System.out.println(s * k + (m - s * k) * k);
		} else {
			System.out.println(-1);
		}
	}
}


