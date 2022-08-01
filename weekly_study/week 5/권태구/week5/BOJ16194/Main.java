package week5.BOJ16194;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] cost = new int[n+1]; // 카드 n개 든 팩의 가격
        int[] dp = new int[n+1];

        for(int i = 1; i<=n; i++){
            cost[i] = Integer.parseInt(str[i-1]);
        }

        for(int i = 1; i<=n; i++){
            dp[i] = cost[i];
            for(int j = 1; j<=i; j++){
                dp[i] = Math.min(dp[i], dp[i-j]+cost[j]);
            }
        }
        System.out.println(dp[n]);
    }
}
