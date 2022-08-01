package week5.BOJ1699;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i = 2; i<=n; i++){
            dp[i] = i;
            for(int j = 1; j*j <= i; j++){ //대칭의 형태로 찾기
                if(j*j == i) dp[i] = 1; //제곱이 될 경우 1
                else if(dp[i] > dp[i - j*j]+1) dp[i] = dp[i - j*j]+1;
            }
        }
        System.out.println(dp[n]);
    }
}
// dp[15] = dp[15-1]+1
// dp[15] = dp[15-4]+1
// dp[15] = dp[15-9]+1


//Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        int[] dp = new int[n+1];
//        dp[1] = 1;
//        for(int i = 2; i<=n; i++){
//            dp[i] = 100000;
//            for(int j = 1; j<=i/2; j++){ //대칭의 형태로 찾기
//                if(j*j == i) dp[i] = 1; //제곱이 될 경우 1
//                else dp[i] = Math.min(dp[i], dp[j]+ dp[i-j]);
//            }
//        }
//        System.out.println(dp[n]);