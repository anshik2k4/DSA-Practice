package Loops;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int original=sc.nextInt();
        int n=original;
        int rev=0;
        //we have to print reverse of this
        while (n>0){
            int num=n%10;
            rev = rev * 10 + num;
            n=n/10;

        }
        if(original==rev){
            System.out.println("the num is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}