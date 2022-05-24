package algorithms;

import java.util.*;
import java.io.*;

public class A21ManacherAlgorithm {

    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                continue;
            }
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.next();

        int current_count = 0;
        int final_count = 0;
        String temp;
        int mi = 0;
        int mj = 0;

        for (int i = 0; i < str.length(); i++) {
            current_count = 0;
            temp = "";
            for (int j = i + 1; j < str.length(); j++) {
                temp += str.charAt(j);
                current_count++;
                if (isPalindrome(temp)) {
                    if (current_count > final_count) {
                        final_count = current_count;
                        mi = i + 1;
                        mj = j+1;
                    }
                }
            }

        }

        for (int i = mi; i < mj; i++) {
            System.out.print(str.charAt(i));
        }
    }
}
