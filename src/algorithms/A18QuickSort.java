package algorithms;

import java.util.Scanner;

public class A18QuickSort {

    public static int partition(int[] a, int low, int high) {

        int temp;
        int pivot = a[low];
        int i = low + 1;
        int j = high;

        do // This do while loops comes handy when only two elements are there in subarray.
        {
            while (a[i] <= pivot && i < j)// Finding element greater than pivot
            {
                i++;
            }

            while (a[j] > pivot)// Finding element less than or equal to pivot
            {
                j--;
            }
            if (i < j)
            {// If i<j then we will swap elements at those index
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        } while (i < j);// If i>j then loop will be exited

        // When j<i swaping pivot value with value at index j

        temp = a[j];
        a[j] = a[low];
        a[low] = temp;

        // Returning new index of pivot

        return j;

    }

    public static int[] quick_sort(int[] a, int low, int high) {
        int partition_index;
        if (low < high)// It is very important !!!!!! this if condition Stops executing statements if there is no element in subarray
        {
            partition_index = partition(a, low, high);

            a = quick_sort(a, low, partition_index - 1); // Applying quick sort in left subarray
            a = quick_sort(a, partition_index + 1, high); // Applying quick sort in right subarray

        }
        return a;
    }

    public static void disp(int[] arr, int size) {

        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = in.nextInt();
        System.out.println("Enter elements of array: ");

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        arr = quick_sort(arr, 0, size - 1);
        disp(arr, size);
    }

}
