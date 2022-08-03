import java.util.Scanner;

public class BOJ1463 {
    static int[] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        d = new int[1000001];
        d[1] = 0;
        for (int i = 2; i <= n; i++) {
            // 1 뺀거
            d[i] = d[i - 1] + 1;


            if (i % 3 == 0) {
                // 3나눈거랑 1뺀거 비교
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }

            if (i % 2 == 0) {
                // 2나눈거랑 1뺀거 비교
                d[i] = Math.min(d[i], d[i / 2] + 1);
            }
        }



        System.out.println(d[n]);
    }
}
