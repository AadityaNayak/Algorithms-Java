package classconcepts;
import java.util.*;
import java.io.*;
public class Comparator {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Enter The String");
        s=br.readLine();
        String a[]=s.split(" ",0);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        String s1="";
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].compareTo(a[j])>=0){
                    String t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        String end="",start="";
        for(int i=0;i<a.length;i++){
            char ch=a[i].charAt(0);
            start=start+a[i]+" ";
        }
        System.out.println(start+end);
    }
}
