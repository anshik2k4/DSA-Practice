package DivideANDConquer;
import java.util.Scanner;

public class Quicksort {


    static void quicksort(int arr[],int strt,int end){

        //base case
        if(strt>=end){
            return;
        }

        //partitioning based on pivot
        int pivot=partition(arr,strt,end);
        //left partitioning
        quicksort(arr,strt,pivot-1); // pivot is already sorted So we have to sort the pivot -1 index
        //right partitioning
        quicksort(arr,pivot+1,end); //simlarly starting will be pivot +1 because pivot index is at correct position
        // it can be later swapped in the partition function if we pass pivot direct



    }

    static int partition(int[] arr,int strt,int end){

        int i=strt-1;
        int j=strt;
        int pivot=arr[end];
        while(j<end){
            if(pivot>=arr[j]){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
            j++;
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
    }

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {7,4,1,3,8,9,4,2};
        quicksort(arr, 0, arr.length - 1);
        printarray(arr);
    }
}
