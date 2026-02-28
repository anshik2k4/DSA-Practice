package DivideANDConquer;
import java.util.Scanner;

public class Mergesort {

    static void mergesort(int[] arr, int strt, int end) {
        //base case
        if (strt >= end) {
            return;
        }
        int mid = strt + (end - strt) / 2;
        //dividing left side
        mergesort(arr, strt, mid);
        // dividing right side
        mergesort(arr, mid + 1, end);
        //merging the parts
        merge(arr, strt, mid, end);
    }

    static void merge(int[] arr, int strt, int mid, int end) {
        int i = strt;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[end - strt + 1];
        // sorting the left and right part in a temprorary array
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
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
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,4,1,3,8,9,4,2};
        mergesort(arr, 0, arr.length - 1);
        printarray(arr);
    }
    }


