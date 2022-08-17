import java.util.Scanner;

public class BOJ1149 {
    // n 번째집 [r,g,b] 칠했을 때 최소값
    static int[][] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        d = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();

            d[i][0] = Math.min(d[i - 1][1], d[i - 1][2]) + r;
            d[i][1] = Math.min(d[i - 1][0], d[i - 1][2]) + g;
            d[i][2] = Math.min(d[i - 1][0], d[i - 1][1]) + b;
        }

        System.out.println(Math.min(Math.min(d[n][0], d[n][1]), d[n][2]));
    }
}
