package week5.BOJ1912;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        dp[0] = arr[0];

        int ans = dp[0];
        for (int i = 1; i < N; i++) {
            // (이전까지의 합 + 현재 합)과 현재 합 중에 더 큰 값을 dp에 할당한다.
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            ans = Math.max(ans, dp[i]);
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
