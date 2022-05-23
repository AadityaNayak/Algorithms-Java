package algorithms;
import java.util.*;

public class A16LexicographicalPalindrome {
    public static String toString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);

        return string;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String w = in.next();

        char[] arr = w.toCharArray();
        String temp = "";
        int size = arr.length;


        Arrays.sort(arr);

        if(arr.length % 2 != 0) {
                char[] arr_temp = new char[size-1];
                char[] arr_lexio = new char[size-1];
                int count = 0;
                boolean found = false;
                boolean conflict = false;
                int target = 0;

                for (int i = 0; i < size; i++) {

                    count = 0;
                    if (i + 1 < size && arr[i] == arr[i + 1]) {
                        int j = i;
                        for (j = i; j < size && arr[j] == arr[i]; j++) {
                            count++;
                        }
                        i = j-1;

                    }
                    if (((count == 0 || count % 2 != 0) && i != size - 1)) {

                        if (found == false) {
                            target = i + 1;
                            found = true;
                        } else {
                            conflict = true;
                            break;
                        }
                    }
                    if((i == size-1 && arr[i] != arr[i-1]) || (i== size-1 && count%2 != 0)){
                        if (found == false) {
                            target = i;
                            found = true;
                        } else {
                            conflict = true;
                            break;
                        }
                    }

                }

                if (conflict == true) {
                    System.out.println("Is is not a lexiographical palindrome");
                } else {
                    System.out.println("Is is a lexiographical palindrome");
                }

                temp = toString(arr);

                if(target == size-1){

                temp = temp.substring(0,target);}
                else{
                    temp = temp.substring(0,target) + temp.substring(target + 1, size);
                }

                arr_temp = temp.toCharArray();

                for(int i = 0; i<size-1; i++) {

                    if (i % 2 == 0) {
                        arr_lexio[i] = arr_temp[i];
                    } else {
                        arr_lexio[size - 1 - i] = arr_temp[i];
                    }
                }
                temp = toString(arr_lexio);
                temp = temp.substring(0, (size-1)/2) + arr[target] + temp.substring((size-1)/2, size-1);
                System.out.println(temp);

        }
        else{
            char[] arr_lexio = arr;
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
                    i = j-1;
                }
                if((count == 0 || count % 2 !=0) && i != size-1){
                    System.out.println(arr[i]);
                        found = true;
                        break;
                }
                if(i == size-1 && arr[i] != arr[i-1] ){
                    if (found == false) {
                        target = i;
                        found = true;
                    } else {
                        break;
                    }
                }
            }

            if(found == false){
                System.out.println("Is is a lexiographical palindrome" );
            }
            else{
                System.out.println("Is is not a lexiographical palindrome");
            }
            for(int i = 0; i<size; i++){

                if(i%2 == 0){
                    arr_lexio[i] = arr[i];
                }
                else{
                    arr_lexio[size-1-i] = arr[i];
                }
            }
            for(int i = 0; i<size; i++){
                System.out.print(arr_lexio[i]);
            }
        }

    }
}
