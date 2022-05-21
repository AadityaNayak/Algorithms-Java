package algorithms;

import java.util.*;

// Logic 1

public class A3StrobogrammaticNumber {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String n = in.next();

		boolean flag = true;

		for (int i = 0; i < n.length(); i++) {
			if ( n.charAt(i) == '2' || n.charAt(i) == '3' || n.charAt(i) == '4'
					|| n.charAt(i) == '5' || n.charAt(i) == '7') {
				flag = false;
				break;
			}
		}

		if (flag == true) {

			if (n.length() % 2 == 0) {

				for (int i = 0; i <= n.length() / 2 -1; i++) {
					if(n.charAt(i) == '1' && n.charAt(n.length()-1-i) == '1') {
//						System.out.println("Executed");
						continue;
					}
					if(n.charAt(i) == '0' && n.charAt(n.length()-1-i) == '0') {
//						System.out.println("Executed");
						continue;
					}
					if(n.charAt(i) == '8' && n.charAt(n.length()-1-i) == '8') {
						continue;
					}
					if(n.charAt(i) == '6' && n.charAt(n.length()-1-i) == '9') {
						continue;
					}
					if(n.charAt(i) == '9' && n.charAt(n.length()-1-i) == '6') {
						continue;
					}
						flag = false;
						break;
				}
			} else {
				for (int i = 0; i <= (int)(n.length() / 2); i++) {
					if(n.charAt(i) == '1' && n.charAt(n.length()-1-i) == '1') {
						continue;
					}
					if(n.charAt(i) == '0' && n.charAt(n.length()-1-i) == '0') {
						continue;
					}
					if(n.charAt(i) == '8' && n.charAt(n.length()-1-i) == '8') {
						continue;
					}
					if(n.charAt(i) == '6' && n.charAt(n.length()-1-i) == '9') {
						continue;
					}
					if(n.charAt(i) == '9' && n.charAt(n.length()-1-i) == '6') {
						continue;
					}
						flag = false;
						break;
				}
			}
			
		}
		System.out.println(flag);

	}
}

// Logic 2

/*public class A3StrobogrammaticNumber {


    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int g =n;
        int k=0;

        while(n!=0){
            int r=n%10;
            if (r==2 || r==3 || r==4 || r==5 || r==7){
                System.out.println("not strobogrammatic number");
                return;
            }
            else if (r==6){
                r=9;
            }
            else if (r==9){
                r=6;
            }
            k=k*10+r;
            n=n/10;
        }
        System.out.println(k);
        if (k==g){
            System.out.println("it is strobogrammatic number");
        }
        else{
            System.out.println("it is not strobogrammatic number");
        }

    }

}*/