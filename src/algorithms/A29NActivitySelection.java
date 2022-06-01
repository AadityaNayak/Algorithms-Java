package algorithms;

import java.util.*;
import java.io.*;

public class A29NActivitySelection {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of activities: ");
        int size = in.nextInt();
        Element e[] = new Element[size];
        for (int i = 0; i < size; i++) {
            e[i] = new Element();
        }

        System.out.println("Enter start times: ");
        for (int i = 0; i < size; i++) {
            e[i].set_name(i);
            e[i].set_start(in.nextInt());
        }
        System.out.println("Enter end times: ");
        for (int i = 0; i < size; i++) {
            e[i].set_end(in.nextInt());
        }

        Element copy[] = e;

        Arrays.sort(e);


        for(int i = 0; i<size; i++){
            if(i == 0){
                System.out.print(e[i].name + " ");
            }
            for(int j = i + 1; j<size; j++){
                if(e[j].start >= e[i].end){
                    System.out.print(e[j].name + 1 + " ");
                    i = j - 1 ;
                    break;
                }
            }
        }

    }
}

class Element implements Comparable<Element> {

    public int name = 0;
    public int start = 0;
    public int end = 0;

    public void set_name(int name) {

        this.name = name;

    }

    public void set_start(int start) {

        this.start = start;

    }

    public void set_end(int end) {

        this.end = end;
    }

    @Override
    public int compareTo(Element e) {
        if (this.end > e.end) {

            // if current object is greater,then return 1
            return 1;
        } else if (this.end < e.end) {

            // if current object is greater,then return -1
            return -1;
        } else {

            // if current object is equal to o,then return 0
            return 0;
        }
    }
}
