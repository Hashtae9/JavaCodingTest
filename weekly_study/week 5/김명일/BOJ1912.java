import java.util.Scanner;

// d[i] : i 번째까지 가장 큰 연속 합

// d[i] = 이전 까지 가장 큰 연속합 + 자기자신 과 자기자신중 큰 값
public class BOJ1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] values = new int[n];
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        d[0] = values[0];

        int result = d[0];
        for (int i = 1; i < d.length; i++) {
            d[i] = Math.max(d[i - 1] + values[i], values[i]);
            result = Math.max(result, d[i]);
        }

        System.out.println(result);
    }
}
