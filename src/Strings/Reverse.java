package Strings;
import java.util.Scanner;

public class Reverse {

    static void reverse(String str){
        StringBuilder ans =new StringBuilder("");
        int length=str.length();
        int count=0;
        while(count<length){
            StringBuilder sb=new StringBuilder("");
            while(count<length && str.charAt(count)!=' '){
                sb.append(str.charAt(count));
                count++;
            }
            ans.append(sb.reverse());
            ans.append(" ");
            count++;

        }
        System.out.print("\nThe reversed string is "+ans);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str= sc.nextLine();
        reverse(str);
    }
}
