import java.util.Scanner;
// d[i][j] : i 를 j 개의 수로 만들수 있는 경우의 수
// d[0][0] = 0 : 계산의 편의성을 위해 초기화
// d[0][j] = 1 : 0을 j개로 만들 수 있는 경우의 수 : 0+0+0+...+0 뿐임
// d[i][0] = 0 : 계산의 편의성을 위해 초기화
// d[i][j] = d[i-1][j] + d[i][j-1]
// j번 더해서 i-1을 만든 경우들 가장 마지막 더하기에 1추가 하는 경우 + j-1번 더해서 i를 만든 경우의 수 가장 뒤에 + 0 추가

// ex. d[2][3]
// d[2][2] => 0 + 2, 2 + 0, 1 + 1
// => 0 + 2 + 0, 2 + 0 + 0, 1 + 1 + 0
// d[1][3] => 0 + 0 + 1, 0 + 1 + 0, 1 + 0 + 0
// => 0 + 0 + 2, 0 + 1 + 1, 1 + 0 + 1
// => 6가지

public class BOJ2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        long[][] d = new long[N + 1][K + 1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if(i == 0 && j == 0) d[i][j] = 0;
                else if(i == 0) d[i][j] = 1;
                else if(j == 0) d[i][j] = 0;
                else {
                    d[i][j] = (d[i - 1][j] + d[i][j - 1]) % 1000000000;
                }

            }
        }

        System.out.println(d[N][K]);
    }
}
