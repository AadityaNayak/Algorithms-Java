package algorithms;

import java.util.*;
import java.io.*;

public class A7SwapTwoNibbles {

	public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        String ai=Integer.toBinaryString(a);
        String r="";
        if(ai.length()<=4){
            for (int i=0;i<(4-ai.length());i++) {
                ai = "0" + ai;
            }
            ai="0000"+ai;
        }
        else if (ai.length()%4!=0){
            int n =(4-ai.length()%4);
            for (int i=0;i<n;i++) {
                ai = "0" + ai;
            }


        }

        int n= ai.length()/4;
        String k[]= new String[n];
        for (int i=0;i<n;i++){
            k[i]=ai.substring(0+(i*4),4+(i*4));
        }
        for (int i=0;i<n;i++){
            r=k[i]+r;
        }
        System.out.println(r);
    }

}

