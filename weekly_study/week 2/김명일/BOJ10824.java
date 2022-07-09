import java.util.Scanner;

/**
 * BOJ10824 네 수
 */
public class BOJ10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();

        System.out.println(Long.parseLong(a + b) + Long.parseLong(c + d));
    }
}
