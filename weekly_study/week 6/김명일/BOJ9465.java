import java.util.Scanner;

// d[i][0] : i 번째 첫번째 스티커를 뜯는 경우, 점수 최대값 = d[i-1][1] 와 d[i-1][2] 중 큰 값 + stickers[0][i]
// d[i][1] : i 번째 두번째 스티커를 뜯는 경우, 점수 최대값 = d[i-1][0] 와 d[i-1][2] 중 큰 값 + stickers[0][i]
// d[i][2] : i 번째 스티커를 안 뜯는 경우, 점수 최대값 = d[i-1][0], d[i-1][1], d[i-1][2] 중 가장 큰 값
public class BOJ9465 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[][] stickers = new int[2][n];
            int[][] d = new int[n + 1][3];

            for (int j = 0; j < n; j++) {
                stickers[0][j] = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                stickers[1][j] = sc.nextInt();
            }

            d[1][0] = stickers[0][0];
            d[1][1] = stickers[1][0];

            for (int j = 2; j <= n; j++) {
                d[j][0] = Math.max(d[j - 1][1], d[j - 1][2]) + stickers[0][j - 1];
                d[j][1] = Math.max(d[j - 1][0], d[j - 1][2]) + stickers[1][j - 1];
                d[j][2] = Math.max(Math.max(d[j - 1][0], d[j - 1][1]), d[j - 1][2]);
            }

            System.out.println(Math.max(Math.max(d[n][0], d[n][1]), d[n][2]));
        }
    }
}
