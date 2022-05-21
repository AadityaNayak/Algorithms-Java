package algorithms;

import java.util.Scanner;
import java.lang.Math;

public class A9BoothMultiplication {

	public static String accordingly(String x, char MSB, int len) {
		if (MSB == '0') {
			for (int i = 0; i < len - x.length(); i++) {
				x = MSB + x;
			}
		} else {
			for (int i = 0; i < len - x.length(); i++) {
				x = MSB + x;
			}
		}

		return x;
	}

	public static String twosComplement(String x, int sign) {

		if (sign == -1) {
			int initial_l = x.length();
			for (int i = 0; i < x.length(); i++) {
				if (x.charAt(i) == '0') {
					x = x.substring(0, i) + '1' + x.substring(i + 1);
				} else {
					x = x.substring(0, i) + '0' + x.substring(i + 1);
				}
			}
			x = Integer.toBinaryString(Integer.parseInt(x, 2) + 1);
			if (x.length() < initial_l) {
				int l = initial_l - x.length();
				for (int i = 0; i < l; i++) {
					x = "0" + x;
				}
			}

			return x;
		} else {
			int initial_l = x.length();
			for (int i = 0; i < x.length(); i++) {
				if (x.charAt(i) == '0') {
					x = x.substring(0, i) + '1' + x.substring(i + 1);
				} else {
					x = x.substring(0, i) + '0' + x.substring(i + 1);
				}
			}
			x = Integer.toBinaryString(Integer.parseInt(x, 2) + 1);
			if (x.length() < initial_l) {
				int l = initial_l - x.length();
				for (int i = 0; i < l; i++) {
					x = "0" + x;
				}
			}

			return x;
		}

	}

	public static String boothMultiplication(int x /* Multiplicand */, int y /* Multiplier */) {
		String m;
		String n;
		if (x >= 0 && y < 0) {
			m = "0" + Integer.toBinaryString(x);/* Multiplicand */
			n = "1" + twosComplement(Integer.toBinaryString((-1) * y), -1); /* Multiplier */

		} else if (x < 0 && y >= 0) {
			m = "1" + twosComplement(Integer.toBinaryString((-1) * x), -1); /* Multiplicand */
			n = "0" + Integer.toBinaryString(y); /* Multiplier */
		} else {
			if (x < 0) {
				x = Math.abs(x);
				y = Math.abs(y);
			}
			m = "0" + Integer.toBinaryString(x); /* Multiplicand */
			n = "0" + Integer.toBinaryString(y); /* Multiplier */
		}

		if (n.length() > m.length()) {
			m = accordingly(m, m.charAt(0), n.length());
		} else if (m.length() > n.length()) {
			n = accordingly(n, n.charAt(0), m.length());
		} else {
		}

		int len = n.length();

		String mComplement = twosComplement(m, 1);
		String nComplement = twosComplement(n, 1);

		String a = "";
		String q = n;
		char q_ = '0';

		for (int i = 0; i < len; i++) {
			a = a + "0";
		}

		for (int i = 0; i < len; i++) {
			String a_ = a;
			String q__ = q;
			if (q.charAt(len - 1) == q_) {
				char temp = a.charAt(len - 1);

				for (int j = 1; j < len; j++) {
					a = a.substring(0, j) + a_.charAt(j - 1) + a.substring(j + 1);

				}
				q_ = q__.charAt(len - 1);
				for (int j = 1; j < len; j++) {
					q = q.substring(0, j) + q__.charAt(j - 1) + q.substring(j + 1);

				}
				q = temp + q.substring(1);

			} else if (q.charAt(len - 1) == '1' && q_ == '0') {

				int initial_l = a.length();
				a = (Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(mComplement, 2)));
				
				if (initial_l < a.length()) {
					a = a.substring(a.length()-initial_l);
					}

				if (initial_l > a.length()) {
					int l = initial_l - a.length();
					for (int k = 0; k < l; k++) {
						a = "0" + a;
					}
				}
				a_ = a;
				q__ = q;
				char temp = a.charAt(len - 1);

				for (int j = 1; j < len; j++) {
					a = a.substring(0, j) + a_.charAt(j - 1) + a.substring(j + 1);

				}
				q_ = q__.charAt(len - 1);
				for (int j = 1; j < len; j++) {
					q = q.substring(0, j) + q__.charAt(j - 1) + q.substring(j + 1);

				}

				q = temp + q.substring(1);


			} else {
				int initial_l = a.length();
				a = (Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(m, 2)));
				if (initial_l < a.length()) {
					a = a.substring(a.length()-initial_l);
					}
				if (initial_l > a.length()) {
					int l = initial_l - a.length();
					for (int k = 0; k < l; k++) {
						a = "1" + a;
					}
				}
				a_ = a;
				q__ = q;

				char temp = a.charAt(len - 1);
				for (int j = 1; j < len; j++) {
					a = a.substring(0, j) + a_.charAt(j - 1) + a.substring(j + 1);

				}
				q_ = q__.charAt(len - 1);
				for (int j = 1; j < len; j++) {
					q = q.substring(0, j) + q__.charAt(j - 1) + q.substring(j + 1);

				}
				q = temp + q.substring(1);

			}
		}

		return a + q;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int multiplicand = in.nextInt();
		int multiplier = in.nextInt();
		String result = boothMultiplication(multiplicand, multiplier);

		if (multiplicand < 0 && multiplier >= 0 || multiplier < 0 && multiplicand >= 0) {
			System.out.println(result);
			System.out.println(-1 * (Integer.parseInt(twosComplement(result, -1), 2)));
		} else {
			System.out.println(result);
			System.out.println(Integer.parseInt(result, 2));
		}
	}

}
