package week5.BOJ11727;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;

        for(int i = 3; i<=n; i++){
            dp[i] = (dp[i-1] + 2*dp[i-2])%10007;
        }
        System.out.println(dp[n]);
    }
}
