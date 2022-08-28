import java.util.Scanner;

public class BOJ6064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = -1;
            int targetY = y == N ? 0 : y;
            for (int j = 0; j <= N; j++) {
                int cur = j * M + x;

                if (cur % N == targetY) {
                    result = cur;
                    break;
                }
            }

            System.out.println(result);
        }
    }


}
