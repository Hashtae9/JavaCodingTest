package week5.BOJ1463;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] dp = new int[x+1];

        dp[0] = dp[1] = 0;

        for(int i = 2; i<x+1; i++){
            dp[i] = dp[i-1] + 1;
            if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3] + 1); //dp[i/3] 에서 i/3이 이미 한번 프로그래밍을 한것이기에 +1
            if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
        }

        System.out.println(dp[x]);
    }
}
