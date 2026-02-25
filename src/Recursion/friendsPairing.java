package Recursion;
import java.util.Scanner;

// friends Pairing problem

public class friendsPairing {

    static int ways(int n){
        //base case
        if(n==1||n==2){
            return n;
        }

        int fn1=ways(n-1); // for single no pairing means ek single rhega to ab bach kitne gy n-1
        int fn2=ways(n-2); // double pairng jb ek ne ppais bnaa liya kisi ke saa th ko bch gy n-2
        int pairways=(n-1)*fn2; // how many ways to pair means ek kitne ways se pair bnaa skta hai (n-1) * means itne logo ke saath bn sktah hai ye n-2 wala pair(n-2)

        int totalways=fn1+pairways; // total kitne bne pair 

        return totalways;
    }
    public static void main(String[] args) {
       int n= ways(4);
        System.out.println("The number of ways to pair: "+n);

    }
}
