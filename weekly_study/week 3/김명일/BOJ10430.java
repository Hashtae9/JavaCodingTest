import java.util.Scanner;

/**
 * BOJ10430 나머지
 */
public class BOJ10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }

}
