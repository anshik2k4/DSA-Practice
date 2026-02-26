package Recursion;

import java.util.Scanner;

public class problem4 {
    static int countstrings(String str) {
        int[] freq = new int[26];
        for (int i = 0; i <str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int total = 0;
        for (int i = 0; i < freq.length; i++) {
            int f = freq[i];
            total += f * (f + 1) / 2;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcaba";
        int total = countstrings(str);
        System.out.println("Total count:" + total);
        //there is a formulae for this question i.e total=f*(f+1)/2
        // isse hume saaare same strings mil jaayenge

        // This problem is withpout recursion

    }
}
