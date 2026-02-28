package Recursion;
import java.util.Scanner;

// tower of hanoi problem
// three rods will be given src ,helper, dest //
// we have to move n no of disks from src to dest
// such that the disck ar arranged in descending order//
 // during shiftt we have to keep in mind that the smaller disk caa't pe placed below the greater the disk
// the order should be maintained
public class problem5 {

    static void hanoi(int n,String src,String help,String dest){
        // base case
        if(n==1){
            System.out.println("Moving  disk "+n+" from "+src+" to "+dest);
            return;
        }

        hanoi(n-1,src,dest,help);
        System.out.println("Moving  disk "+n+" from "+src+" to "+dest);
        hanoi(n-1,help,src,dest);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        hanoi( 3,"A","B","C");

    }
}
