package week7.BOJ2133;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n + 1];

        int answer = 0;
        if (n % 2 == 1) {
            answer = 0;
        } else {
            dp[0] = 1;
            dp[2] = 3;
        }

        for (int i = 4; i <= n; i += 2) {
            dp[i] = dp[i - 2] * dp[2];
            for (int j = i - 4; j >= 0; j -= 2) {
                dp[i] += dp[j] * 2;
            }
        }
        answer = dp[n];

        System.out.print(answer);
    }
}
//https://yabmoons.tistory.com/536
//F[N] = ( F[N - 2] * F[2] ) + ( F[N - 4] * 2 ) + ( F[N - 6] * 2) + ( F[N - 8] * 2 ) + ... + ( F[0] * 2 )