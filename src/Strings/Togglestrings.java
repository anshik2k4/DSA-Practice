package Strings;
import java.sql.SQLOutput;
import java.util.*;

import java.util.Scanner;
public class Togglestrings {

    static StringBuilder toggle( StringBuilder str){
        for(int i=0;i<str.length();i++) {
            char st = str.charAt(i);
            if (st == ' ') continue;
            if (st >= 'a' && st <= 'z') {
                    int asci = (int) st - 32;
                    char toggle = (char) asci;
                    str.setCharAt(i, toggle);
                } else if(st>='A'&&st<='Z') {
                    int asci = (int) st+32;
                    char toggle = (char) asci;
                    str.setCharAt(i, toggle);
                }
            }
        return str;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);

        StringBuilder st=toggle(str);
        System.out.println("The toggle is "+st);
    }
}
