package algorithms;

import java.util.Scanner;

public class A17SelectionSort {

    public static int[] selection_sort(int[] arr, int size)
    {
        int indexofmin,j,temp;

        for (int i = 0; i < size - 1; i++)
        {// Iterates through passes

            indexofmin = i; // Initial index assumed for minimum element
            j = i+1;

            for(j = i+1; j<size; j++){
                // Iterates through comparision of a pass

                if(arr[j]<arr[indexofmin]){
                    indexofmin = j; // Index of minimum element updates as condititon for comparsion satisfies
                }
            }
            // Now assigning the value min_value_at_index or indexofmin to arr[i]
            temp = arr[i];
            arr[i] = arr[indexofmin];
            arr[indexofmin] = temp;
        }
        return arr;
    }

    public static void disp(int [] arr, int size)
    {

        for (int i = 0; i < size ; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
    }


    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = in.nextInt();
        System.out.println("Enter elements of array: ");

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = in.nextInt();
        }

        arr = selection_sort(arr, size);
        disp(arr, size);
    }

}
