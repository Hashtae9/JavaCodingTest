import java.util.Scanner;
// d[i][j] : i 번째 색상이 j(0: 빨강, 1: 초록, 2: 파랑)일 때, 이전 집과 색이 겹치지 않는 최소비용
// 첫 집이 빨강, 초록, 파랑일 때를 나누어 계산
// 첫 집이 빨강이면 마지막 집이 초록 또는 파랑일 때 최소비용과 비교
// 첫 집이 초록이면, 마지막 집이 빨강 또는 파랑일 때 최소비용과 비교
public class BOJ17404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] values = new int[n][3];
        int[][] d = new int[n][3];

        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();

            values[i] = new int[]{r, g, b};
        }


        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (j == i) d[0][j] = values[0][j];
                else d[0][j] = Integer.MAX_VALUE;
            }

            for (int j = 1; j < values.length; j++) {
                d[j][0] = Math.min(d[j - 1][1], d[j - 1][2]) == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(d[j - 1][1], d[j - 1][2]) + values[j][0];
                d[j][1] = Math.min(d[j - 1][0], d[j - 1][2]) == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(d[j - 1][0], d[j - 1][2]) + values[j][1];
                d[j][2] = Math.min(d[j - 1][0], d[j - 1][1]) == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(d[j - 1][0], d[j - 1][1]) + values[j][2];
            }

            for (int j = 0; j < 3; j++) {
                if (j != i) answer = Math.min(answer, d[n - 1][j]);
            }

        }

        System.out.println(answer);

    }
}
