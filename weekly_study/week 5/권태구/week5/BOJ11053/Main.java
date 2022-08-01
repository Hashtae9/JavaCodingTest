package week5.BOJ11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[n+1]; // 숫자
        int[] dp = new int[n+1]; //길이 계산

        dp[0] = 1; //index가 1부터 시작

        for(int i = 0; i<str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int result = 1;

        for(int i = 1; i<n; i++){
            dp[i] = 1;
            for(int j = 0; j<i; j++){
                if(arr[i]>arr[j] && dp[i] <= dp[j]) dp[i] = dp[j] + 1;
            }
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
    }
}
// dp[i] <= dp[j]를 만족해야하는 이유.
// 만약, arr = {10, 10, 30}에 경우
// dp[1] = 1, dp[2] = 1이 된다.
// 이때, dp 조건을 추가하지 않으면, 단순히 arr만 비교를 하게 되어
// dp[3] = 3이 되어 버린다.
// 따라서 초기화를 하면서 dp끼리 비교를하여 중복하여 증가하는 일을 막아야 한다