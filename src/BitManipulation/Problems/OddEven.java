package BitManipulation.Problems;
import java.util.*;

public class OddEven {

    static void checkOddEven(int n){
        if((n&1)==1){
            // humne lsb(left significant digit ke base pr ye find kra
            // 1 and operator hai last wale digit ko agr 1 and krenge to 1 aayega mtlb lsb 1 tha to odd
            // nhi to 0 aayega ag to even
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");

    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        checkOddEven(3);
        checkOddEven(4);
        checkOddEven(5);
        checkOddEven(6);


    }
}

