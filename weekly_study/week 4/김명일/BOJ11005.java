import java.util.Scanner;
import java.util.Stack;

public class BOJ11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(convertNotation(N, B));
    }

    static String convertNotation(int n, int radix) {
        Stack<Integer> s = new Stack<>();

        int cur = n;
        while(true){
            int r = cur % radix;
            int q = cur / radix;

            s.push(r);

            if (q == 0) {
                break;
            }

            cur = q;
        }
        StringBuilder sb = new StringBuilder();

        while (!s.isEmpty()) {
            sb.append(convert(s.pop()));
        }

        return sb.toString();
    }

    static Character convert(int n){
        if (n <= 9) {
            return (char) ('0' + n);
        }

        return (char) ('A' + n - 10);
    }
}
