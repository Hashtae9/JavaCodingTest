package week7.BOJ13398;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        //배열값 저장
        int[] arr = new int[n];
        int[][] dp = new int[n][2]; //한개 숫자를 뺀 경우와 안뺀경우 구분

        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        dp[0][0] = dp[0][1] = arr[0];

        int count = 0;
        int max = arr[0];

        for(int i = 1; i<n; i++){
            dp[i][0] = Math.max(dp[i-1][0] + arr[i], arr[i]);
            //이번 arr[i]를 빼는 경우와 이미 이전에 arr[i]를 제외한 다른숫자를 뺀 값을 비교
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1]+arr[i]);
            //이전의 최댓값과 비교하여 수가 더 작아지면 이전의 숫자가 max값이므로 max를 따로 기록하면서 저장
            max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
        }
        System.out.println(max);
    }
}
