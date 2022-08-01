package week5.BOJ11726;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[1001]; //1001로 안하고 n+1로 하면 오류남

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2])%10007; //10007을 넘어가는 경우는?
        }

        System.out.println(dp[n]);
    }
}
