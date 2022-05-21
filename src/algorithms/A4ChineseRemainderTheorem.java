package algorithms;
import java.util.*;

// Initialized inputs
/*public class A4ChineseRemainderTheorem {
	// x = 2(mod 3) ==> x % 3 = 2 ==> x mod m1 = a1
	// x = 3(mod 5)
	// x = 2(mod 7)
	
	// x = (a1*M1*M1' + a2*M2*M2' + a2*M2*M2' + .............)
	
	// M = m1 * m2 * m3 * m4 ....................
	
	// M1 = M/m1
	
	// M1 * M1' = 1(mod m1) ==> M1 * M1' % m1 = 1
	
	public static void main(String args[]) {
		int a1 = 2;
		int a2 = 3;
		int a3 = 2;
		int m1 = 3;
		int m2 = 5;
		int m3 = 7;
		
		int M = m1 * m2 * m3;
		
		int M1 = M/m1;
		int M2 = M/m2;
		int M3 = M/m3;
		
		int M1_;
		int M2_;
		int M3_;
		
		int i = 1;
		while((i*M1)%m1 != 1) {
			i++;
		}
		M1_ = i;
		i = 1;
		while((i*M2)%m2 != 1) {
			i++;
		}
		M2_ = i;
		i= 1;
		while((i*M3)%m3 != 1) {
			i++;
		}
		M3_ = i;
		
		int X = (a1* M1 *M1_ + a2* M2 *M2_  +a3* M3 *M3_ );
		
		System.out.println(X%M);
	}
	
}*/

// Taking user inputs
/*public class A4ChineseRemainderTheorem {
	// x = 2(mod 3) ==> x % 3 = 2 ==> x mod m1 = a1
	// x = 3(mod 5)
	// x = 2(mod 7)

	// x = (a1*M1*M1' + a2*M2*M2' + a2*M2*M2' + .............)

	// M = m1 * m2 * m3 * m4 ....................

	// M1 = M/m1

	// M1 * M1' = 1(mod m1) ==> M1 * M1' % m1 = 1

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size: ");
		int size = sc.nextInt();

		System.out.println("a: ");
		int a[] = new int[size];
		for (int i = 0; i < size; i++)
			a[i] = sc.nextInt();

		System.out.println("m: ");
		int m[] = new int[size], M = 1;
		for (int i = 0; i < size; i++) {
			m[i] = sc.nextInt();
			M = M * m[i];
		}
	}

}*/