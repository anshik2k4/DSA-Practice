package Loops;
import java.util.*;
 //keep print until the number is a multiple of 10
public class problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while( n==0|| n%10!=0){
            System.out.println("Try again!!");
            n=sc.nextInt();

        }
        System.out.println("The number "+n+" is multiple of 10");
    }
}
