import java.util.Scanner;

/**
 * BOJ 10808 알파벳 개수
 */
public class BOJ10808 {
    private static final int MAX_ALPHABET_COUNT = 'z' - 'a' + 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String input = sc.nextLine();

        int[] values = new int[MAX_ALPHABET_COUNT];

        for (int i = 0; i < input.length(); i++) {
            values[input.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < MAX_ALPHABET_COUNT; i++) {
            sb.append(values[i]).append(' ');
        }

        System.out.println(sb);
    }
}
