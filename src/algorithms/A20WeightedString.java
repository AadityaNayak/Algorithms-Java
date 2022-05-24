package algorithms;
import java.util.*;
import java.io.*;
public class A20WeightedString {
    static int find(String s[],int q[],String a) {
        int j=0;
        for (int i=0;i<26;i++){
            if (s[i]==a){
                j=i;
                break;
            }
        }
        return q[j];
    }
    public static void main(String[] args) {
        String s[] ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};
        int q[] ={1,2,3,0,0,0,4,5,6,0,0,0,7,8,9,0,0,0,1,2,3,4,5,0,0,0};
        Set<String> Set = new HashSet<String>();

        int k= 2;
        int c = 10;
        String p[]={"a","a","c","b","a","c","b","a","c","a","a"};


        int count=0;

        for(int i =0;i<c;i++){
            int f=find(s,q,p[i]);
            for(int l =i+1;l<c;l++){
                f+=find(s,q,p[l]);
                if(f<=k){
                    count++;
                }
            }
        }
        for(int i =0;i<c;i++) {

            Set.add(p[i]);
        }
        String[] Aset = Set.toArray(new String[Set.size()]);

        for(int i=0;i<Aset.length;i++){
            if (find(s,q,Aset[i])<=k){
                count++;
            }
        }

        System.out.println(count);
    }


}
