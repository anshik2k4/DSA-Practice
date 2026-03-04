package Backtracking;
import java.util.Scanner;

public class Permutation {

    static void permutate(String str, String ans) {

        // base case
        if ( str.length()==0) {
            System.out.print(ans+" ");
            return; // iske baad wps call permutate(c,ab) ko gya phir waha se bhi back jaayga kuki lloop khtm ho jaayega
            // phir wps bc , a pe jaayega aur ish baar i=1 rhega to c choose hoga aur a+c hoga aur b bch jaayega
            // phir b ch bn  jaayega aur wo add ho jaaeyga to cb bn jaayega aur remaining empty aur phir base case hit
        }

        //work
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           // left
           String left=str.substring(0,i); //pahle wala choe ke kuki wo to ch me store ho rhaa
           String right=str.substring(i+1); //bacha hua choice
           String remaining=left +right;

           permutate(remaining,ans+ch);
       }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "abc";
        permutate(str, "");
    }
}
