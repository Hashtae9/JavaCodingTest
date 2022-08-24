import java.util.Scanner;

// d[i][0]: 0으로 끝나는 i 자리 이친수 => 이전 이친수 뒤에 0 추가
// d[i][1]: 1으로 끝나는 i 자리 이친수 => 이전 0으로 끝나는 이친수 뒤에 1 추가
public class BOJ2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[][] d = new long[91][2];
        d[1][0] = 0;
        d[1][1] = 1;

        for (int i = 2; i < d.length; i++) {
            d[i][0] = d[i - 1][0] + d[i - 1][1];
            d[i][1] = d[i - 1][0];
        }

        System.out.println(d[n][0] + d[n][1]);
    }
}
