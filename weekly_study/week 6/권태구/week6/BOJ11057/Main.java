package week6.BOJ11057;

import java.util.Scanner;

public class Main {
    final static int MOD = 10007;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] dp = new int[n+1][10]; //[수의 길이][0 ~ 9]

        //초기값 세팅
        for(int i = 0; i<10; i++){
            dp[1][i]=1;
        }

        for(int i=2; i<=n; i++){
            //수의 길이가 i일때 0~9까지 올 수 있는 숫자 구하기
            for(int j=0; j<10; j++){
                //dp[n][k] = dp[n-1][k]+dp[n-1][k-1]+ ... +dp[n-1][0]
                for(int k=0; k<=j; k++){
                    dp[i][j] += dp[i-1][k];
                }
                dp[i][j] %= MOD;
            }
        }

        int result = 0;
        for(int i = 0; i<10; i++){
            result += dp[n][i];
        }
        System.out.println(result%MOD);
    }
}
