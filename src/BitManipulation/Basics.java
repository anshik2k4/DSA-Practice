package BitManipulation;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//                | Decimal | Binary |
//                | ------: | ------ |
//                |       1 | 1      |
//                |       2 | 10     |
//                |       3 | 11     |
//                |       4 | 100    |
//                |       5 | 101    |





                // And Operator
        // Phle 5 ko binary me convert phir 7 ko
        // then uspe and wala operator ka jo hota hai wo
        // like 1*1=1 & 0*1=0 etc
        System.out.println(5&7);

        // or operator
        System.out.println(5|7);
        // XOR operator
        // isme 1 aur 1 =0 and 0aur 0=0 hota hai baaki sb 1
        System.out.println(5^7);

//        Bitwise NOT (~) of 5 – Explanation
//
//        5 ko pehle 8-bit binary me likhte hain:
//        5 = 00000101
//
//        Bitwise NOT (~) har bit ko flip karta hai (0 → 1, 1 → 0):
//        ~00000101 = 11111010
//
//        Ab 11111010 ka MSB (most significant bit) 1 hai, matlab number negative hai.
//                Computer negative numbers ko Two’s Complement me represent karta hai.
//
//        Two’s Complement nikalne ke steps:
//
//        Bits flip karo:
//        11111010 → 00000101
//
//        1 add karo:
//        00000101 + 1 = 00000110
//
//        00000110 ka decimal value = 6
//        Number negative tha, isliye final answer = -6
//
//        Final Result:
//        ~5 = -6

        // ek trick bhi hai veriy ke liye
        // hamesha kisi number ka binary complement uske ek digit aage hoga minus me
        // like 5 ka -6 ,6 ka -7 , 10 ka -11 etc kisi ka bhi.
        System.out.println(~5);

        //  left shift
//        << 1  → 00001010
//                << 2  → 00010100
//        Binary 00010100 ka decimal value:
//                = 20
//        Final Result:
//        5 << 2 = 20
//        Shortcut Formula:
//        x << n = x × (2^n)
//        Example:
//        5 << 2 = 5 × 2² = 5 × 4 = 20

//        jitna shift rhega utna left ki trf shift krke 0 daalte jaayenge aur phr usko binary me convert =answer

        // Right Shift
//        00000101   (5)
//                >> 1  → 00000010
//                >> 2  → 00000001
//        Binary 00000001 ka decimal value:
//                = 1
//        Final Result
//        5 >> 2 = 1
//        Shortcut Formula (positive numbers ke liye):
//
//        x >> n = x ÷ (2^n)
//        (integer division)
//        Example:
//        5 >> 2 = 5 ÷ 4 = 1


    }
}
