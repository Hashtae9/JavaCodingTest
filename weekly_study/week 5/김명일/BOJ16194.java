import java.util.Scanner;

// d[i] : i 개 카드를 구매시 최소값
public class BOJ16194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] packs = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            packs[i] = sc.nextInt();
        }

        int[] d = new int[n + 1];
        d[1] = packs[1];

        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + packs[1];
            for (int j = 2; j <= n; j++) {
                if(i - j < 0) break;
                d[i] = Math.min(d[i], d[i - j] + packs[j]);
            }
        }

        System.out.println(d[n]);
    }
}
