import java.util.Scanner;

// d[i] : 길이가 i 일때 경우의 수
public class BOJ2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] d = new int[n + 1];
        d[0] = 1; // 곱셈 처리 위해 설정

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // 길이가 홀수 인경우, 짝수 블록들로 홀수 칸들을 채울 수 없음
                d[i] = 0;
            } else if (i == 2) {
                d[i] = 3;
            } else if (i == 4) {
                d[i] = 11;
            } else {
                d[i] = d[i - 2] * 3;
                int j = 2;
                while (i - 2 * j >= 0) {
                    d[i] += d[i - 2 * j] * 2;
                    j += 1;
                }
            }
        }

        System.out.println(d[n]);
    }
}
