package Recursion;
import java.util.Scanner;

public class NumbertoString {

    // to convert from number to string form of that number
    static void Conversion(String[] str, int num) {

        if (num == 0) {
            return;
        }

        Conversion(str, num / 10);

        int digit = num % 10;
        System.out.print(str[digit] + " ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String[] str={"Zero","One","Two","Three","Four","five","Six","Seven","Eight","Nine"};
        Conversion(str,2019);
    }
}
