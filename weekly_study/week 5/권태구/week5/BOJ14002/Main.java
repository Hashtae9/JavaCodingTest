package week5.BOJ14002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n + 1];
        int dp[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = 1;
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
            ans = Math.max(ans, dp[i]);
        }


        // 역추적

        // 최장길이값
        int value = ans;
        Stack<Integer> stack = new Stack<>();

        for (int i = n; i >= 1; i--) {
            if (value == dp[i]) {
                stack.push(arr[i]);
                value--;
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }

        System.out.println(ans);
        System.out.println(sb);

    }
}
//https://hianna.tistory.com/582

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//        String[] str = br.readLine().split(" ");
//        int[] arr = new int[n+1];
//        int[] dp = new int[n+1];
//        List<Integer> result = new ArrayList<>();
//        dp[0] = 1;
//        int index = 1;
//
//        for(int i = 0; i<str.length; i++){
//            arr[i] = Integer.parseInt(str[i]);
//        }
//
//        result.add(arr[0]);
//        for(int i = 1; i<n; i++){
//            dp[i] = 1;
//            for(int j = 0; j<i; j++){
//                if(arr[i] > arr[j] && dp[i] <= dp[j]){
//                    dp[i] = dp[j] + 1;
//                    result.add(arr[i]);
//                }
//            }
//            index = Math.max(index, dp[i]);
//        }
//        System.out.println(index);
//        Collections.sort(result);
//        List<Integer> answer = result.stream().distinct().collect(Collectors.toList());
//        for(int i : answer){
//            System.out.print(i + " ");
//        }
//    }