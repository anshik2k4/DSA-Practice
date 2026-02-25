package Recursion;
import java.util.Scanner;

public class problem2 {

    // Checking if array is sorted or not

//    static boolean checksort(int[] arr,int i ){
//        if (i == arr.length-1 ) {
//            return true;
//        }
//
//        if(arr[i]>arr[i+1]){
//            return false;
//        }
//
//        return checksort(arr,i+1);
//
//    }

    // to return the first occurance

    static int firstoccurances(int [] arr,int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
      return  firstoccurances(arr,i+1,key);
    }


    // to return the last occurance of idx

    static int lastoccur(int [] arr,int i,int key){
        if(i<0){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return  lastoccur(arr,i-1,key);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];

        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
//        System.out.println(checksort(arr,0));

//        int idx=firstoccurances(arr,arr.length-1,5);
//        System.out.println(idx);

        int idx=lastoccur(arr,arr.length-1,5);
        System.out.println(idx);
    }
}
