package week5.BOJ2193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[][] dp = new long[n+1][2];

        dp[1][0] = 0;
        dp[1][1] = 1; //1

        for(int i = 2; i<=n; i++){
            for(int j = 0; j<2; j++){
                if(j==0) dp[i][j] = dp[i-1][0] + dp[i-1][1];
                else dp[i][1] = dp[i-1][0];
            }
        }

        long result = dp[n][0]+dp[n][1];
        System.out.println(result);
    }
}
