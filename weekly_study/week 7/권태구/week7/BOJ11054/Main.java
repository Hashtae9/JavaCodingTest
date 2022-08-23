package week7.BOJ11054;

import java.util.Scanner;

public class Main {
    //LIS DP
    static Integer[] r_dp;
    //LDS DP
    static Integer[] l_dp;
    static int[] seq;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        r_dp = new Integer[n];	// LIS dp
        l_dp = new Integer[n];	// LDS dp
        seq = new int[n];


        for (int i = 0; i < n; i++) {
            seq[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            LIS(i);
            LDS(i);
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(r_dp[i] + l_dp[i], max);
        }
        System.out.println(max - 1);

    }

    static int LIS(int n) {

        // 만약 탐색하지 않던 위치의 경우
        if (r_dp[n] == null) {
            r_dp[n] = 1; // 1로 초기화

            // n 이전의 노드들을 탐색
            for (int i = n - 1; i >= 0; i--) {
                // 이전의 노드 중 seq[n]의 값보다 작은 걸 발견했을 경우
                if (seq[i] < seq[n]) {
                    r_dp[n] = Math.max(r_dp[n], LIS(i) + 1);
                }
            }
        }
        return r_dp[n];
    }

    static int LDS(int n) {

        // 만약 탐색하지 않던 위치의 경우
        if (l_dp[n] == null) {
            l_dp[n] = 1; // 1로 초기화

            // n 이후의 노드들을 탐색
            for (int i = n + 1; i < l_dp.length; i++) {
                // 이후의 노드 중 seq[n]의 값보다 작은 걸 발견했을 경우
                if (seq[i] < seq[n]) {
                    l_dp[n] = Math.max(l_dp[n], LDS(i) + 1);
                }
            }
        }
        return l_dp[n];
    }
}


//예를들어 i번째 인덱스 기준으로 왼쪽 오른쪽으로 LIS와 LDS를 구한값을 더하면
//바이토닉 부분 수열이 나오게 됨(이때, i번째 인덱스는 LIS, LDS 모두 쓰이기에 2번 들어간 것이라 마지막에 -1 해줘야함)