package Recursion;
import java.util.Scanner;

public class BinaryStringsProblem {

    //To print all binary strings without consecutive zeros

    static void binarystrings(int n,int lastused,String str){

        //base case
        if(n==0){
            System.out.println(str);
            return;

        }

        //Working
        if(lastused==1){
            binarystrings(n-1,1,str+"1");
            binarystrings(n-1,0,str+"0");

        }
        else{
            binarystrings(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        binarystrings(2,1, "");
        
    }
}
