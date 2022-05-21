package algorithms;

import java.util.Scanner;

public class A8LongestSequenceOf1s {

	public static int longestSequence(String x) {

		int len = x.length();
		String y = x;
		String result = x;
		int count_final = 0;
		int count_current = 0;
		boolean zeroflag = false;
		int j = len - 1;
		

		while (j >= 0) {
			
			y = x;
			count_current = 0;
			zeroflag = false;

			for (int i = j; i >= 0; i--) {
				
				if(y.charAt(i) == '0' && zeroflag == true) {
					break;
				}
				
				if (y.charAt(i) == '0' && zeroflag == false) {
					y = y.substring(0, i) + '1' + y.substring(i + 1);
					zeroflag = true;
					count_current++;
					continue;
				}

				if (y.charAt(i) == '1') {
					count_current++;
					continue;
				}

			}
			
			if(count_current>count_final) {
				count_final = count_current;
				result = y;
			}
			
			j--;
		}
		
		System.out.println(result);

		return count_final;

	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String b = Integer.toBinaryString(n);
		System.out.println(b);
		
		System.out.println(longestSequence(b));

	}
}
