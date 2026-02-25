package Array;
import java.util.*;

    public class Problem1 {

         static int[][] prefixsumRowWise(int[][] arr, int r, int c) {
            int[][] prefixarr = new int[r][c];
            for (int i = 0; i < r; i++) {
                prefixarr[i][0] = arr[i][0];
                for (int j = 1; j < c; j++) {
                    prefixarr[i][j] = prefixarr[i][j - 1] + arr[i][j];
                }
            }
            return prefixarr;
        }

       static int[][] prefixsumColWise(int[][] arr, int r, int c) {
            int[][] prefixarr2 = new int[r][c];
            for (int i = 0; i < c; i++) {
                prefixarr2[0][i] = arr[0][i];
                for (int j = 1; j < r; j++) {
                    prefixarr2[j][i] = prefixarr2[j - 1][i] + arr[j][i];
                }
            }


            return prefixarr2;
        }

        static void findrectangleSum(int arr[][], int r, int c, int row1, int col1, int row2, int col2) {
            int[][] prefixarr1 = prefixsumRowWise(arr, r, c);
            int[][] totalsumarr = prefixsumColWise(prefixarr1, r, c);
            int rectanglesum = 0;


            if (row1>=1&& col1 >=1) {
                rectanglesum = totalsumarr[row2][col2] - totalsumarr[row1 - 1][col2] - totalsumarr[row2][col1 - 1] + totalsumarr[row1 - 1][col1 - 1];
            } else if (row1 >=1) {
                rectanglesum = totalsumarr[row2][col2] - totalsumarr[row1 - 1][col2];
            } else if (col1 >=1) {
                rectanglesum = totalsumarr[row2][col2] - totalsumarr[row2][col1 - 1];
            } else { // row1 = 0 && col1 = 0
                rectanglesum = totalsumarr[row2][col2];
            }
            System.out.println("the  rectangle sum is :"+rectanglesum);

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the row size:");
            int r = sc.nextInt();

            System.out.print("Enter the column size:");
            int c = sc.nextInt();

            int[][] arr = new int[r][c];

            System.out.print("Enter the elements: ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();

                }
                System.out.print("\n");
            }

            System.out.println("The elements are:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.print("\n");
            }

            System.out.println("Enter the coordinaters size:");
            System.out.print("\nEnter the row1: ");
            int row1 = sc.nextInt();

            System.out.print("\nEnter the col1: ");
            int col1 = sc.nextInt();

            System.out.print("\nEnter the row2: ");
            int row2 = sc.nextInt();

            System.out.print("\nEnter the col2 :");
            int col2 = sc.nextInt();

            findrectangleSum(arr, r, c, row1, col1, row2, col2);
        }
    }




