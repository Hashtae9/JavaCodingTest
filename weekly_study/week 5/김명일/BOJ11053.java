import java.util.Scanner;

// LIS(Longest Increase Sequence)
public class BOJ11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] values = new int[n];
        int[] lis = new int[n];

        int result = 1;
        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            values[i] = cur;
            lis[i] = 1;

            for (int j = i - 1; j >= 0 ; j--) {
                if (values[j] < values[i]) {
                    lis[i] = Math.max(lis[j] + 1, lis[i]);
                    result = Math.max(result, lis[i]);
                }
            }
        }

        System.out.println(result);
    }
}
