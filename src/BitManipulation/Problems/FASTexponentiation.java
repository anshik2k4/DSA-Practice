package BitManipulation.Problems;
import java.util.Scanner;

public class FASTexponentiation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter pow: ");
        int pow=sc.nextInt();
        System.out.print("\nEnter number: ");
        int number=sc.nextInt();

        int n=pow;
        int a=number;
        int ans=1;

        while(n>0){
            if((n&1)==1){ //checking if n is odd or even at that time
                ans*=a;
            }
             // if even means bit is 0 then just multiply ans with 1 in place of 0; which is not necessary to do
            a*=a; //
            n=n>>1;// right shift n by one  means n=n/2
        }

        System.out.println("The exponentiation of "+number+"^"+pow+ " is: "+ans);
    }
}

