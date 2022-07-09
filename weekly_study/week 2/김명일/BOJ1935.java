import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


/**
 * BOJ 1935 후위표기식2
 * Stack 사용
 */
public class BOJ1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        String formula = st.nextToken();
        double[] values = new double[n];
        Stack<Double> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            values[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < formula.length(); i++) {
            char val = formula.charAt(i);

            // 문자면 값을 스택에 추가
            if ('A' <= val && val <= 'Z') {
                s.push(values[val - 'A']);
                continue;
            }

            // 연산자이면 스택에서 2개를 꺼내어 연산 후 다시 스택에 추가
            double val2 = s.pop();
            double val1 = s.pop();
            switch (val) {
                case '*':
                    s.push(val1 * val2);
                    break;
                case '+':
                    s.push(val1 + val2);
                    break;
                case '-':
                    s.push(val1 - val2);
                    break;
                case '/':
                    s.push(val1 / val2);
                    break;
            }
        }

        // 결과값 소수점 아래 2자리까지 출력
        System.out.println(String.format("%.2f", s.pop()));


    }
}
