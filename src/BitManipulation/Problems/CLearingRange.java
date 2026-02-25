package BitManipulation.Problems;
import java.util.*;


public class CLearingRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//
//        n = 100111010011
//        i = 2
//        j = 7
//        Bit indexing (RIGHT se, 0-based):
//
//        yaml
//        Copy code
//        Index: 11 10 9 8 7 6 5 4 3 2 1 0
//        Bits :  1  0 0 1 1 1 0 1 0 0 1 1
//👉 Hume index 2 se 7 tak bits ko 0 banana hai.
//
//🧠 Step 1: Left mask banao (~0 << (j+1))
//        nginx
//        Copy code
//        j + 1 = 8
//        bash
//        Copy code
//        ~0        = 111111111111
//        ~0 << 8   = 1111111100000000
//        (Left side 1s, right side 0s)
//
//🧠 Step 2: Right mask banao ((1 << i) - 1)
//        ini
//        Copy code
//        i = 2
//        bash
//        Copy code
//        1 << 2 = 000000000100
//                - 1    = 000000000011
//        (Right ke 2 bits = 1)
//
//🧠 Step 3: Final mask (OR)
//                less
//        Copy code
//        Left mask : 1111111100000000
//        Right mask: 0000000000000011
//                --------------------------------
//        Mask      : 1111111100000011
//👉 i–j range = 0
//👉 baaki sab = 1
//
//🧠 Step 4: AND with number
//                markdown
//        Copy code
//        Number: 100111010011
//        Mask  : 1111111100000011
//                ------------------------
//        Result:1001110000000011


        System.out.print("Enter  i:");
        int i=sc.nextInt();
        System.out.print("\nEnter  j:");
        int j=sc.nextInt();
        System.out.println("\nEnter the number: ");
        int n=sc.nextInt();

        int bitleft=(~0)<<(j+1);
        int bitright=(1<<i)-1;

        int mask=bitleft|bitright;
        int ans=n&mask;

        System.out.print("\nThe answer after clearing range of bits: "+ans);


    }
}
