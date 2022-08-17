package week6.BOJ15988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 0; i<t; i++){
            int n = Integer.parseInt(br.readLine());

            for(int j = 4; j<=n; j++){
                if(dp[j] ==0) dp[j] = (dp[j-1] + dp[j-2] + dp[j-3])%1000000009;
            }
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
    }
}
