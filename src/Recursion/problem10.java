package Recursion;
import java.util.Scanner;

public class problem10 {
    static int[] put( int[] arr ,int i){

        // base case
        if(i==arr.length){

            printarray(arr);
           return arr;
        }
        arr[i]=i+1;
        put(arr,i+1);
        arr[i]=arr[i]-2;
        return arr;
    }

    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i]+" ");

        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
      printarray( put(arr,0));
    }
}
