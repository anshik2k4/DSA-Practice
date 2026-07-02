package Loops;
import java.util.*;

public class problem7 {
    public static boolean prime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting value : ");
        int strt=sc.nextInt();

        System.out.println("Enter the last value : ");
        int lst=sc.nextInt();

        System.out.println("The prime numbers from "+strt+" to "+lst+" are : ");
        for(int i=strt;i<lst;i++){
           boolean isPrime=prime(i);
           if(isPrime){
               System.out.print(i+" ");

            }

        }


    }
}
