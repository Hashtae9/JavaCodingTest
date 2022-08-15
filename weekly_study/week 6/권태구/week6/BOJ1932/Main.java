package week6.BOJ1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n+1][n+1];
        int[][] cost = new int[n+1][n+1];

        //값 받아서 배열에 대입하기
        for(int i = 0; i<n; i++){
            String[] str = br.readLine().split(" ");
            for(int j = 0; j<str.length; j++){
                cost[i+1][j+1]=Integer.parseInt(str[j]);
            }
        }

        dp[1][1] = cost[1][1];

        //큰 합 찾기
        for(int i = 2; i<=n; i++){
            for(int j = 1; j<=i; j++){//i번째 줄에는 i개의 숫자가 존재
                if(j==1) dp[i][1] = dp[i-1][1] + cost[i][1];
                else if(j==i) dp[i][i] = dp[i-1][i-1] + cost[i][i];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + cost[i][j];
            }
        }

        int result = 0;
        for(int i = 1; i<=n; i++){
            result = Math.max(result, dp[n][i]);
        }
        System.out.println(result);
    }
}
