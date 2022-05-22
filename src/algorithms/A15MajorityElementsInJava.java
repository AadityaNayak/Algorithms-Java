package algorithms;
import java.util.*;

public class A15MajorityElementsInJava {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = in.nextInt();
        System.out.println("Enter elements of array: ");

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int count = 0;
        boolean found = false;
        int target = 0;

        for(int i = 0; i<size; i++){
            count =0;
            if(i+1<size && arr[i] == arr[i+1]){
                int j = i;
                for( j = i; j< size && arr[j] == arr[i] ; j++){
                    count++;
                }
                i = j;
                if(count > size/2){
                    found = true;
                    target = arr[i-1];
                    break;
                }
            }
        }

        if(found == true){
            System.out.println("Majority element is: " + target);
        }
        else{
            System.out.println("There is no majority element");
        }
    }
}
