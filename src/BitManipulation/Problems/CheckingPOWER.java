package BitManipulation.Problems;
import java.util.Scanner;

public class CheckingPOWER {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

//        ✅ Final Condition
//        if (n > 0 && (n & (n - 1)) == 0)
//    → power of 2
//else
//    → not power of 2
//
//🧪 Example Dry Run
//                n = 8
//        8  = 1000
//        7  = 0111
//                ------------
//                &  = 0000  ✔
//
//        n = 10
//        10 = 1010
//        9  = 1001
//                ------------
//                &  = 1000 ❌
//
//⚠️ Important Edge Case
//                n = 0 ❌ (not power of 2)

//        if(n>0 && (n&(n-1))==0){
//            System.out.println("The number is a power of 2");
//        }
//        else{
//            System.out.println("No, the number is not the power of 2");
//        }


//        to count  the left significant digit of the bit

        // hum right shit kr kr ke check krenge ki left shift pe kitne o hai
//        int count=0;
//        int temp=n;
//        while(temp>0){
//            int bit=temp&1;
//            if(bit!=0){
//                count++;
//            }
//            temp=temp>>1;
//
//        }
//
//        System.out.print("\nThe number of bits are: "+count);


    }
}
