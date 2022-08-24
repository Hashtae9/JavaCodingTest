import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// d[i] : 1, 2, 3을 합해서 i 가 되는 경우의 수
// d[i] : i - 1만드는 경우에 뒤에 + 1 하는 경우 + i - 2만드는 경우에 뒤에 + 2 하는 경우 + i - 3만드는 경우에 뒤에 + 3 하는 경우
// d[i] = d[i - 1] + d[i - 2] + d[i - 3]
public class BOJ9095 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        int[] d = new int[11];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        for (int i = 4; i < d.length; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }

        for (int i = 0; i < n; i++) {
            bw.write(d[sc.nextInt()] + "\n");
        }

        bw.flush();
        bw.close();
    }

}
