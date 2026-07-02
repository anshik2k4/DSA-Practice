package Loops;
import java.util.*;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;

        while(n>0){
            int num=n%10;
            if(num%2==0){
                even+=num;
            }
            else{
                odd+=num;
            }
            n=n/10;

        }

        System.out.println("sum of even no is "+even );
        System.out.println("sum of odd no is "+odd );
    }

}
