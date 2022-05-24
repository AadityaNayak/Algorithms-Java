package algorithms;
import java.util.*;
public class A19MoveHyphenToBeginning {

    public static String toString(char[] a) {
        // Creating object of String class
        String string = new String(a);

        return string;
    }

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.next();
        String result = "";

        char[]arr = str.toCharArray();

        Arrays.sort(arr);

        int count =0;
        for(int i = 0; i<str.length(); i++){
            if(arr[i] == '-'){
                count++;
            }
        }

        for(int i=0; i<count; i++){
            result += "-";
        }
        for(int i = 0; i<str.length(); i++){

            if(str.charAt(i) != '-'){
                result += str.charAt(i);
            }
        }

        System.out.println(result);

    }

    // Method 2

   /*public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.next();
        String result = "";

        for(int i = 0; i<str.length(); i++){

            if(str.charAt(i) == '-'){
                result = str.charAt(i) + result;
            }else{
                result = result + str.charAt(i);
            }
        }

        System.out.println(result);

    }*/

}
