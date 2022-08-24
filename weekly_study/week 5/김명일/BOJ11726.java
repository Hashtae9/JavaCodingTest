import java.util.Scanner;
// d[i] : 길이가 i 일 때, 채울수 있는 경우의 수
// d[i] : i - 1 채우는 경우의 수 + i - 2 채우는 경우의 수
// 1개전에서 세로로 하나 추가 또는 2개전에서 가로로 2개 추가
public class BOJ11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] d = new int[1001];
        d[1] = 1;
        d[2] = 2;

        for (int i = 3; i < d.length; i++) {
            d[i] = (d[i - 1] + d[i - 2]) % 10007;
        }

        System.out.println(d[n]);
    }
}
