package week5.BOJ11052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[n+1]; //카드 개수에 따른 팩당 가격

        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(str[i-1]);
        }

        int[] dp = new int[n+1]; //최대 금액 구하기

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                dp[i] = Math.max(dp[i], dp[i-j] + arr[j]);
            }
        }
        System.out.println(dp[n]);

    }
}
//i개의 카드를 구매하는 경우

//카드팩 1개가 들어있는 팩 구매, 카드 i-1개를 구입
//카드팩 2개가 들어있는 팩 구매, 카드 i-2개를 구입
//카드팩 3개가 들어있는 팩 구매, 카드 i-3개를 구입
//...
//카드팩 j개가 들어있는 팩 구매, 카드 i-j개를 구입 (단 j<=i)
//dp[i] = arr[j] + dp[i-j];
