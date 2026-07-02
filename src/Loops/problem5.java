package Loops;
import java.util.*;


public class problem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int fact=1;
//        int n=sc.nextInt();
//        for(int i=n;i>=1;i--){
//            fact*=i;
//        }
//        System.out.println("the factorial of "+n+" is "+ fact);

        int n=sc.nextInt();
        int count=1;

        for(int i=n;i<=n*10;i+=n){
            System.out.println( n+" * "+count+" = "+i);
            count++;
        }
    }
}
