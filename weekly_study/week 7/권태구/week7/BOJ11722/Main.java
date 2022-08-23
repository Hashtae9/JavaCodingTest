package week7.BOJ11722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];

        for(int i = 0; i<str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        //개수 카운트
        int[] seq = new int[str.length];
        Arrays.fill(seq, Integer.MIN_VALUE);

        //기저값
        seq[0] = arr[0];
        int idx = 0;

        //점화식
        for(int i = 1; i<n; i++){
            if (seq[idx] > arr[i]) {
                seq[++idx] = arr[i];
                // 그렇지 않고 작다면 이진 탐색(Binary Search)를 통해 교체를 수행한다.
            } else {
                int target_index = reverseBinarySearch(seq, arr[i]);
                seq[target_index] = arr[i];
            }
        }
        System.out.print(idx+1);
    }

    // 반복문을 이용한 이진 탐색 방식
    public static int reverseBinarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        // 현재 탐색한 위치가 찾고자 하는 값보다 크냐 작냐에 따라 중간 index 계산을 위한 start / end 값을 변경함
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // 일치값을 찾지 못했을 때, -1이 아니라 그 적절한 위치를 반환해야 함
        return start;
    }
}
