import java.util.Scanner;

// d[i] : 합쳐서 i 가 되는 제곱수들의 최소 개수
public class BOJ1699 {
    static int[] d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        d = new int[100001];
        d[1] = 1;
        d[2] = 2;
        d[3] = 3;

        for (int i = 1; i*i <= n; i++) {
            d[i * i] = 1;
        }

        System.out.println(process(n));
    }

    static int process(int n) {
        if (d[n] != 0) return d[n];

        d[n] = 100001;
        int sqrt = (int) Math.sqrt(n);

        for (int i = sqrt; i >= 0; i--) {
            int diff = n - (int) Math.pow(i, 2);
            d[n] = Math.min(1 + process(diff), d[n]);
        }

        return d[n];
    }
}
