package Recursion;
import java.util.Scanner;

// we have to print the all occurances of the key value form an array

public class Problem3 {
    static void occurances(int[] arr,int key,int idx){
        if(idx==arr.length){
            return ;
        }

        if(arr[idx]==key){
            System.out.println(idx);
        }
        occurances( arr, key,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] arr=new int[1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        occurances(arr,2,0);

    }
}
