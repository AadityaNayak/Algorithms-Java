package algorithms;
import java.util.*;
import java.io.*;

public class A22Maneuvering {

    static int numberOfPaths(int m, int n)
    {

        if (m == 1 || n == 1)
            return 1;

        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m and n");
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(numberOfPaths(5, 5));

    }

    // Method 2

    /* public class maneauring {
        static int factorial(int n){
            if (n == 0){
                return 1;
            }
            else{
                return(n * factorial(n-1));
            }

        }
        public static void main(String[] args) {
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter no of rows:");
            int a=Sc.nextInt();
            System.out.println("Enter no of columns:");
            int b=Sc.nextInt();
//        int h=factorial(a+b);
//        int c= factorial(a);
//        System.out.println(c);
            int k=b-1;
            int d= factorial(b-1);
            int g=(b+a-2);
            int e=factorial(g);
            int h=factorial(g-k);
            int f= e/(h*d);
            System.out.println(f);
        }
    }*/
}
