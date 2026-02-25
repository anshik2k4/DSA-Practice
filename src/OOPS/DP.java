package OOPS;

public class DP {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 4, 3, 1, 2};

        int[] dp = new int[100]; // DP frequency table

        for (int x : arr)
            dp[x]++;

        for (int i = 0; i < dp.length; i++)
            if (dp[i] > 0)
                System.out.println(i + " = " + dp[i]);
    }
}

