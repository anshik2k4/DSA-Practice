package Backtracking;
import java.util.Scanner;
public class subset {

    static void subset(String str, String ans, int idx) {

        // base case
        if (idx == str.length()) {

            if(ans.length()==0){
                System.out.print("null");
                return;
            }
            else{
                System.out.print(ans + " ");
                return;
            }
        }

        //work
        subset(str, ans + str.charAt(idx), idx + 1);
        subset(str, ans, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "ab";
        subset(str, "", 0);
    }
}

