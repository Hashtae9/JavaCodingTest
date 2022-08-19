import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BOJ2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();

        System.out.println(convertNotation(N, B));
    }


    static int convertNotation(String N, int radix) {
        int result = 0;
        Queue<Integer> q = new LinkedList<>();

        for (Character cur : N.toCharArray()) {
            q.add(convert(cur));
        }

        while (!q.isEmpty()) {
            int cur = q.poll();

            result += cur * Math.pow(radix, q.size());
        }

        return result;
    }

    static int convert(Character c) {
        if ('0' <= c && c <= '9') {
            return c - '0';
        }

        return c - 'A' + 10;
    }
}
