package week6.BOJ9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            long[][] dp = new long[n+1][2]; //[n번째 줄][지금까지 각각 위, 아래 가격합]
            long[][] cost = new long[n+1][2]; //[n번째 줄][위, 아래의 가격]

            //각 스티커의 값을 cost에 넣기
            //2줄입력
            for(int j = 0; j<2; j++){
                String[] str = br.readLine().split(" ");
                for(int k = 0; k<str.length; k++){
                    cost[k+1][j] = Integer.parseInt(str[k]);
                }
            }

            //초기값(첫번째 줄은 무조건 그 스티커의 값이 최댓값
            dp[1][0] = cost[1][0];
            dp[1][1] = cost[1][1];

            for(int j = 2; j<=n; j++){
                dp[j][0] = Math.max(dp[j-1][1]+ cost[j][0], dp[j-2][1]+ cost[j][0]);
                dp[j][1] = Math.max(dp[j-1][0]+ cost[j][1], dp[j-2][0]+ cost[j][1]);
            }

            System.out.println(Math.max(dp[n][0], dp[n][1]));
        }
    }
}
