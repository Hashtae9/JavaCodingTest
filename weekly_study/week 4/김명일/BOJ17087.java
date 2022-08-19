import java.util.Scanner;

public class BOJ17087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(s - values[i]);
        }

        int prev = diff[0];

        for (int i = 1; i < n; i++) {
            prev = gcd(prev, diff[i]);
        }

        System.out.println(prev);
    }

    static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
