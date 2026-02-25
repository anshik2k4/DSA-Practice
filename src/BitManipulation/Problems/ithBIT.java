package BitManipulation.Problems;
import java.util.Scanner;

public class ithBIT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Get ith bit
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("\nEnter the value of i: ");
        int i=sc.nextInt();
        int Bitmask=1<<i; // jitne ke position ka bit jaanan hai left shift se 1 ko utne postion ke saamne daal ke
        // And operator lgaa denge to 0 aayega sb to o hoga wo poistion be bit nhi to 1 hoga
//        if((n&Bitmask)==0){
//            System.out.println("The ith bit is 0") ;
//        }
//        else{
//            System.out.println("The ith bit is 1");
//        }





        // to set ith bit means always 1 hi set krna hai
//        n=n|Bitmask;
//        System.out.println(n);





        // to clear ith bit = usko zero krdo us bit ko bs baaki bit same rhnhi chaaie
//        two methods
        //   1>> bitmask= ~(1<<i) ith postion pe shift krke reverse kr do aur and operator lgaa fo number ke saath
//        int reverse= ~(Bitmask);
//        n=n& reverse;
//        System.out.println(n);

//        2>> hum Xor operator lgaa denge
//        n= n^Bitmask;
//        System.out.println(n);


        // to update ith bit= 0 agr value bnaana hai to 0 waha
        // 1 bnaana hai to 1 waha ith bit pe

//        jb 0 bnana hai to
//          clearbit wala function call kr denge jo 0 bnaa dega
        // jb 1 bnaana hai to hum set bit wala function call kr denge
        // jo 1 bnaa dega


// to clear the last it bits i.e 1111 ->> agr 2 bits tk tkrns hai to hoga 1100

// hum iske liye (-1) or (0) ko left shift krnege i times and then use AND operator with number

//        int bitlast=(-1)<<i;
//        n=bitlast&n;
//        System.out.println("clearing  last i bit: "+n);

        // yaha -1 ya 0 jb shift hota hai to shifting me zero lgte hai and
        // usse pahle 1 lgta hai except that number

        // Clearing a range of bits


    }
}





