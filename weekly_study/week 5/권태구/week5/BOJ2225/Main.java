package week5.BOJ2225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        long[][] dp = new long[n+1][k+1]; //나와야 하는 숫자 n, 더할 횟수 k
        for(int i = 0; i<=n; i++){
            dp[i][1] = 1;
        }

        for(int i = 0; i<=n; i++){
            for(int j = 1; j<=k; j++){
                for(int m = 0; m<=i; m++){
                    dp[i][j] += dp[i-m][j-1];
                }
                dp[i][j] %= 1000000000;
            }
        }
        System.out.println(dp[n][k]);
    }
}

// dp[n][4] = dp[n-1][3] + dp[n-2][3] + dp[n-3][3] ...