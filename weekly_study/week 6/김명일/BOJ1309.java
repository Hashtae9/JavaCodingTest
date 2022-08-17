import java.util.Scanner;

// RGB 거리에서 풀었던 방식을 응용
// d[i][0]은 i 번째에서 좌측에 놓는 경우 = d[i-1][1] + d[i-1][2] (이전에 우측 또는 놓지 않은 경우)
// d[i][1]은 i 번째에서 우측에 놓는 경우 = d[i-1][0] + d[i-1][2] (이전에 좌측 또는 놓지 않은 경우)
// d[i][2]은 i 번째에서 놓지 않는 경우 = d[i-1][0] + d[i-1][2] + d[i-1][2] (이전에 좌측 또는 우측 또는 놓치 않은 경우 - 모든 경우)
public class BOJ1309 {
    static int[][] d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        d = new int[n + 1][3];
        d[1][0] = 1;
        d[1][1] = 1;
        d[1][2] = 1;

        for (int i = 2; i <= n; i++) {
            d[i][0] = (d[i - 1][1] + d[i - 1][2]) % 9901;
            d[i][1] = (d[i - 1][0] + d[i - 1][2]) % 9901;
            d[i][2] = (d[i - 1][0] + d[i - 1][1] + d[i - 1][2]) % 9901;
        }

        System.out.println((d[n][0] + d[n][1] + d[n][2]) % 9901);
    }
}
