import java.util.Scanner;

// 세개 전 뒤에 3 + 두개 전 뒤에 2 + 1개전 뒤에 1
public class BOJ15988 {
    static long[] d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        d = new long[1000001];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        for (int i = 0; i < n; i++) {
            System.out.println(process(sc.nextInt()));
        }
    }

    static long process(int n) {
        if(n == 0){
            return 0;
        }

        if (d[n] != 0) {
            return d[n];
        }

        d[n] = (process(n - 1) + process(n - 2) + process(n - 3)) % 1000000009;


        return d[n];
    }
}
