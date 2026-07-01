package Backtracking;
import java.util.Scanner;
public class Nqueens {

    static void Queens(char[][] arr,int row){

        // base case
        if(row==arr.length){
            printarray(arr);
            System.out.println("--------------");
            count ++;
            return;
        }

        //recursion
        for(int i=0;i<arr.length;i++){
            if((isSafe(arr,row,i))){
                arr[row][i]='Q';
                Queens(arr,row+1);
                arr[row][i]='.';
            }

        }

    }

    static  boolean isSafe(char [][]arr,int row,int col){

        //check  vertical Top
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]=='Q'){
                return false;
            }
        }

        // check vertical top left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }

//        check vertical top right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    static void printarray( char [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.print("\n");

    }
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        char arr[][]=new char[n][n];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] ='.';
            }
        }
        Queens(arr,0);
        System.out.println("No of posssible solutions are: "+count);

    }
}
