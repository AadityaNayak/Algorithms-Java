package algorithms;
import java.util.*;

public class A13PrefixSuffix {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = in.nextInt();
        System.out.println("Enter elements of array: ");

        int arr[] = new int[size];
        int prefix[] = new int[size];
        int suffix[] = new int[size];
        int sum = 0;

        for(int i = 0; i<size; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i<size; i++){
            sum = sum + arr[i];
            prefix[i] = sum;
        }
        sum = 0;
        for(int i = size-1; i>=0; i--){
            sum = sum + arr[i];
            suffix[i] = sum;
        }

        boolean foundflag = false;

        for(int i = 0; i<size; i++){
            if(prefix[i] == suffix[i]){
                System.out.println(prefix[i]);
                foundflag = true;
            }
        }

        if(foundflag == false){
            System.out.println("No common element at same index");
        }

        in.close();
    }
}