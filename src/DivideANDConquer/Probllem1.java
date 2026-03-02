package DivideANDConquer;
import java.util.Scanner;


// we have given the array we have to sort this by applying merge sort
   public class Probllem1 {
    static void merge(String[] arr, int strt,int end){
        if (strt >= end) {
            return;
        }
        int mid = strt + (end - strt) / 2;
        //dividing left side
        merge(arr, strt, mid);
        // dividing right side
        merge(arr, mid + 1, end);
        //merging the parts
        merge(arr, strt, mid, end);
    }

    static void merge(String[] arr, int strt, int mid, int end) {
        int i = strt;
        int j = mid + 1;
        int k = 0;
        String[] temp = new String[end - strt + 1];
        // sorting the left and right part in a temprorary array
        while (i <= mid && j <= end) {
            if (arr[i].compareTo(arr[j])<=0) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        // for remiaing left aprt
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
//            for remaining right part
        while (j <= end) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        //coping the temp array into original jse jse sorting hoga

        for (i = strt, k = 0; i <= end; i++, k++) {
            arr[i] = temp[k];
        }
    }

    // for printing the final sorted array
    static void printarray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr={ "sun", "earth", "mars", "mercury"};
        merge(arr,0,arr.length-1);
        printarray(arr);
    }
}
