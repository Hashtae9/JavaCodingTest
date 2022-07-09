import java.util.Scanner;

/**
 * BOJ11655 ROT13
 */
public class BOJ11655 {
    private static final int ADD_VALUE = 13;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char cur = input.charAt(i);

            if ('a' <= cur && cur <= 'z') {
                sb.append(changeOfLowerCase(cur));
            } else if ('A' <= cur && cur <= 'Z') {
                sb.append(changeOfUpperCase(cur));
            } else {
                sb.append(cur);
            }
        }

        System.out.println(sb);
    }

    static char changeOfLowerCase(char a) {
        int changedValue = a + ADD_VALUE;
        if (changedValue > 'z') {
            changedValue = changedValue - 'z' + 'a' - 1;

        }
        return (char) changedValue;
    }

    static char changeOfUpperCase(char a) {
        int changedValue = a + ADD_VALUE;
        if (changedValue > 'Z') {
            changedValue = changedValue - 'Z' + 'A' - 1;

        }
        return (char) changedValue;
    }
}
