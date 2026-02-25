package Recursion;
import java.util.Scanner;


// to remove the duplicates form a string
// eg-- apnacollege = apncoleg
public class Duplicates {

    static void remove(String str,boolean map[],int idx,StringBuilder sb){
        //base case
        if(idx==str.length()){
            System.out.print("The new String is: "+sb);
            return;
        }

        char ch=str.charAt(idx);
        int i =ch-'a';
        if(map[i]==true){
            remove(str,map,idx+1,sb);
        }
        else{
            map[i]=true;
            sb.append(ch);
            remove(str,map,idx+1,sb);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str="apnacollege";
        boolean[] map=new boolean[26];
        StringBuilder sb=new StringBuilder();
        int idx=0;
        remove(str,map,idx,sb);

    }
}
