package week6.BOJ2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] str) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        int[] q = new int[n+1];

        //포도주 양을 quantity안에 넣기
        for(int i = 1; i<=n; i++){
            int a = Integer.parseInt(br.readLine());
            q[i] = a;
        }

        //초기값 설정
        dp[1] = q[1];
        if(n>1){
            dp[2] = q[1]+q[2];
        }

        for(int i = 3; i<=n; i++){

            //비교 1. q[i]를 먹을지 안먹을지 비교
            //비교 2. i번째를 먹는다 가정하면 i-2번째랑 먹는게 좋은지 i-1번째부터 연속해서 먹는게 좋은지
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + q[i], dp[i-3]+ q[i-1] + q[i]));
        }
        System.out.println(dp[n]);

    }
}
