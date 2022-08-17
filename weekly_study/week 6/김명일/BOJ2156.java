import java.util.Arrays;
import java.util.Scanner;

// d[i] : i 번째 까지 최대 마실수 있는 포도주 양
// = 세번째 전까지 최대 + 이전 포도주 + 이번 포도주, 두번째 전까지 최대 + 이번 포도주, 이번포도주 안마심 중 가장 큰 값
// d[i-2] + wines[i], d[i-3] + wines[i-1] + wines[i], d[i-1] 중 가장 큰 값
public class BOJ2156 {
    static int[] d;
    static int[] wines;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        d = new int[n + 1];
        Arrays.fill(d, -1);

        wines = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            wines[i] = sc.nextInt();
        }

        // 없으면 ArrayIndexOutOfBounds Exception 발생
        if (n == 1) {
            System.out.println(wines[1]);
        } else {
            d[1] = wines[1];
            d[2] = d[1] + wines[2];

            System.out.println(process(n));
        }
    }

    static int process(int n) {
        if (n <= 0) return 0;
        if (n == 1) return d[n];
        if (n == 2) return d[n];
        if (d[n] != -1) return d[n];

        d[n] = Math.max(Math.max(process(n - 2), process(n - 3) + wines[n - 1]) + wines[n], process(n - 1));

        return d[n];
    }
}
