import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BOJ1212 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            String cur = input.substring(i, i + 1);
            int dec = Integer.parseInt(cur, 8);
            String bin = Integer.toBinaryString(dec);

            if (i != 0) {
                bin = pad(bin);
            }

            bw.write(bin);
        }

        bw.flush();
    }

    static String pad(String a){
        if (a.length() >= 3) {
            return a;
        }

        return pad("0" + a);
    }
}
