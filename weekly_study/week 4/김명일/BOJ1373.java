import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class BOJ1373 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = sc.nextLine();
        int start = input.length() - 3;
        int end = input.length();

        Stack<Character> s = new Stack<>();
        while (end > 0) {

            if (start < 0) {
                start = 0;
            }

            String sub = input.substring(start, end);

            int dec = Integer.parseInt(sub, 2);
            String oct = Integer.toOctalString(dec);

            s.push(oct.charAt(0));

            end = start;
            start -= 3;
        }

        while(!s.isEmpty()){
            bw.write(s.pop());
        }

        bw.flush();


    }
}
