package week6.BOJ1309;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long[][] dp;// int[줄 수][0:사자x, 1:왼쪽 사자, 2: 오른쪽 사자]
        dp = new long[n+1][3];

        dp[1][0] = dp[1][1] = dp[1][2] = 1;

        for(int i = 2; i<=n; i++){
            dp[i][0] = (dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%9901;
            dp[i][1] = (dp[i-1][0]+dp[i-1][2])%9901;
            dp[i][2] = (dp[i-1][0]+dp[i-1][1])%9901;
        }

        System.out.print((dp[n][0]+dp[n][1]+dp[n][2])%9901);
    }
}
