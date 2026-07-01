package Loops;
import java.util.*;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isprime=false;
                System.out.println("It's a composite number ");
                break;
            }
        }
        if(isprime){
            System.out.println("The number is a prime number");
        }

    }
}