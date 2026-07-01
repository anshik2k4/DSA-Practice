package Loops;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //we have to print reverse of this
        while (n>0){
            int num=n%10;
            n=n/10;
            System.out.print(num+" ");
        }
    }
}