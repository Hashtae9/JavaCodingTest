import java.util.Arrays;
import java.util.Scanner;

/**
 * BOJ 10809 알파벳 찾기
 */
public class BOJ10809 {
    private static final int MAX_ALPHAPET_COUNT = 'z' - 'a' + 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String input = sc.nextLine();

        int[] values = new int[MAX_ALPHAPET_COUNT];
        Arrays.fill(values, -1);

        for (int i = 0; i < input.length(); i++) {
            int idx = input.charAt(i) - 'a';
            if (values[idx] == -1) {
                values[idx] = i;
            }
        }

        for (int i = 0; i < MAX_ALPHAPET_COUNT; i++) {
            sb.append(values[i]).append(' ');
        }

        System.out.println(sb);
    }
}
