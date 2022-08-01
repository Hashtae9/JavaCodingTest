package week5.BOJ15990;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scan.nextInt();

        long[][] dp = new long[100001][4];
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for(int i=4; i<=100000; i++){
            dp[i][1] = (dp[i-1][2] + dp[i-1][3])%1000000009;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3])%1000000009;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2])%1000000009;
        }

        for(int j = 0; j<n; j++){
            int k = scan.nextInt();
            long result = (dp[k][1]+dp[k][2]+dp[k][3])%1000000009;
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}

//n = 끝이 1인 수 + 끝이 2인 수 + 끝이 3인 수
//4 = [1]로 끝나는 경우 = 1+2+1, 3+1 (2)
//  = [2]로 끝나는 경우 = (0)
//  = [3]로 끝나는 경우 = 1+3 (1)
//dp[n][1] = dp[n-1][2] + dp[n-1][3] //n인데 1로 끝나는 경우 = ...+2+1, ...+3+1
//https://lotuslee.tistory.com/44
