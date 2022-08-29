import java.util.Scanner;

public class BOJ1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;
        int cur = 1; // 현재 자리수: 1 2 3 4 ...
        int temp = 10;// 다음 자리수 최대 값: 10 100 1000 10000 ...
        for (int i = 1; i <= n; i++) {
            if (i >= temp) {
                cur++;
                temp *= 10;
            }
            result += cur;
        }

        System.out.println(result);
    }
}
