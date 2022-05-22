package algorithms;
import java.util.*;

public class A14LeadersInArray {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = in.nextInt();
        System.out.println("Enter elements of array: ");

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[size - 1];

        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
        in.close();
    }
}
