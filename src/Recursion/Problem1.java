package Recursion;
import java.util.Scanner;

import java.util.Scanner;

public class Problem1 {
// factorial number
    static int printfact(int n){

        if(n==1){
            return 1;
        }
        return n*printfact(n-1);

    }

    // sum of first n natural number

    static int naturalsum(int n){
        // base case
        if(n==1){
            return n;
        }

        return n+naturalsum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;

       

//        int num= printfact(n);
        int num=naturalsum(n);
        System.out.println(num);
    }
}
