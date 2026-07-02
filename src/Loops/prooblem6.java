package Loops;
import java.util.*;

public class prooblem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;


        for (int i=1;i<=n;i++){
            int count=1;
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.print("\n");
        }
    }
}
