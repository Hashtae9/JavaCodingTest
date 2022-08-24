import java.util.Scanner;

// d[i][j] : 자리수가 i 인 수 중 j로 끝나는 경우의 수
public class BOJ10844 {
    static final int DIVIDER = 1000000000;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[][] d = new long[101][10];
        d[1][0] = 0;
        d[1][1] = 1;
        d[1][2] = 1;
        d[1][3] = 1;
        d[1][4] = 1;
        d[1][5] = 1;
        d[1][6] = 1;
        d[1][7] = 1;
        d[1][8] = 1;
        d[1][9] = 1;

        for (int i = 2; i < d.length; i++) {
            d[i][0] = d[i - 1][1];
            d[i][1] = (d[i - 1][0] + d[i - 1][2]) % DIVIDER;
            d[i][2] = (d[i - 1][1] + d[i - 1][3]) % DIVIDER;
            d[i][3] = (d[i - 1][2] + d[i - 1][4]) % DIVIDER;
            d[i][4] = (d[i - 1][3] + d[i - 1][5]) % DIVIDER;
            d[i][5] = (d[i - 1][4] + d[i - 1][6]) % DIVIDER;
            d[i][6] = (d[i - 1][5] + d[i - 1][7]) % DIVIDER;
            d[i][7] = (d[i - 1][6] + d[i - 1][8]) % DIVIDER;
            d[i][8] = (d[i - 1][7] + d[i - 1][9]) % DIVIDER;
            d[i][9] = d[i - 1][8];
        }

        long result = 0;
        for (int i = 0; i <= 9; i++) {
            result = (result + d[n][i]) % DIVIDER;
        }

        System.out.println(result);
    }
}
