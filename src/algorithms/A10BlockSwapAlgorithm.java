package algorithms;

import java.util.Scanner;

public class A10BlockSwapAlgorithm {
	
		public static void swap(int arr[], int a, int b, int r){ 
	        for(int i = 0 ; i < r ; i++){ 
	            int temp = arr[a + i]; 
	            arr[a + i] = arr[b + i]; 
	            arr[b + i] = temp; 
	        } 
	        
	    }
	
	public static void main(String args[]) {
		int arr[];
		int result[]; 
		
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = in.nextInt();
		
		arr = new int[size];
		result = new int[size];
		
		System.out.println("Enter elements of array: ");
		for(int i=0; i<size; i++) {
			 arr[i] = in.nextInt();
			 result[i] = 0;
		}
		
		System.out.println("Enter point of rotation: ");
		int por = in.nextInt();
		
		int j = 0;
		for(int i = por; i<size; i++) {
			result[j] = arr[i];
			j++;
		}
	
		for(int i = 0; i<por; i++) {
			result[j] = arr[i];
			j++;
		}
		
		System.out.print("The rotated array is as: ");
		for(int i = 0; i<size; i++) {
			System.out.print(result[i]+" ");
		}
		
	}
}
