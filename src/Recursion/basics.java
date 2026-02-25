package Recursion;
import java.util.Scanner;

public class basics {

    //Printing number form n to 1 in decreasing

    static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }

        System.out.println(n);
        printdec(n-1);
    }


    static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return;

        }
        printinc(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=10;
//        printdec(n);


        printinc(n);

    }
}
