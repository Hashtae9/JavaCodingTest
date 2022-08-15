package week6.BOJ11055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int[] score = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 0; i < n; i++){
            score[i+1] = Integer.parseInt(str[i]);
            dp[i+1] = score[i+1];
        }

        int result = dp[1];
        //증가하는 수열 찾기
        for(int i = 1; i<=n; i++){
            //i번부터 수열 체크
            for(int j = 1; j<i; j++){
                if(score[j]<score[i]){
                    dp[i] = Math.max(dp[j]+score[i], dp[i]);
                    result = Math.max(result,dp[i]);
                }
            }
        }
        System.out.println(result);

    }
}
