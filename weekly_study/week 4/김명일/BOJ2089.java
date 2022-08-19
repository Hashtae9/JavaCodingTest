import java.util.Scanner;

public class BOJ2089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        if (n == 0) {
            sb.append("0");
        } else {
            int cur = n;
            while (cur != 0) {
                sb.append(Math.abs(cur % -2));
                cur = (int) Math.ceil((double) cur / -2);
            }

        }

        System.out.println(sb.reverse());
    }
}
