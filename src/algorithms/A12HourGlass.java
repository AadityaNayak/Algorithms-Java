package algorithms;

import java.util.Scanner;

public class A12HourGlass {

	public static void disp(int A[][], int size, int size1)
	{

	    for (int i = 0; i < size; i++)
	    {
	        for (int j = 0; j < size1; j++)
	        {
	            System.out.print(A[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

	public static void hour(int A[][], int size, int size1)
	{

	    int max = -99999;

	    int i = 0, j = 0;

	    for ( i = 0; i < size - 2; i++)
	    {
	        for ( j = 0; j < size1 - 2; j++)
	        {
	            if (max < A[i][j] + A[i][j + 1] + A[i][j + 2] + A[i + 1][j + 1] + A[i + 2][j] + A[i + 2][j + 1] + A[i + 2][j + 2])
	            {
	                max = A[i][j] + A[i][j + 1] + A[i][j + 2] + A[i + 1][j + 1] + A[i + 2][j] + A[i + 2][j + 1] + A[i + 2][j + 2];
	            }
	        }
	    }

	    System.out.println(max);
	}

	public static void main(String args[])
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter sizes of 2D Array: ");
		int x = in.nextInt();
		int y = in.nextInt();

	    int arr[][] = new int[x][y];
	    
	    System.out.println("Enter ements of 2D array: ");
	    for (int i = 0; i < x; i++)
	    {
	    	System.out.println("Enter row "+i);
	        for (int j = 0; j < y; j++)
	        {
	            arr[i][j] = in.nextInt();
	        }
	    }

	    hour(arr, x, y);
	}
}
