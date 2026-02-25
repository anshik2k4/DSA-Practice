package Array;
import java.util.*;
import java.util.Scanner;

public class insertion {

    static void printarray(int[] arr){
        System.out.println("The sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    static void insertion(int[] arr){

        int sorted=0;
        int j=sorted+1;
        while(j<arr.length){
            int i=sorted;
            while(i>=0 && arr[j]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j=i;
                i--;
            }
            sorted++;
            j=sorted+1;
        }

        printarray(arr);

    }

    static void selectionsort(int[] arr){
        int idx=0;

        while(idx<arr.length){
            int smallest=arr[0];
            int count=0;
             for(int i=idx;i<arr.length;i++){
                 if(smallest<arr[i]){
                     smallest=arr[i];
                     count=1;
                 }
                 }

            if(count==1){
                int temp=smallest;
                smallest=arr[idx];
                arr[idx]=temp;
                idx++;
             }

        }

        printarray(arr);

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        insertion(arr);
        selectionsort(arr);
    }
}
