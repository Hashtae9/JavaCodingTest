import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * BOJ 17298 오큰수
 */
public class BOJ17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] values = new int[n];
        Stack<Integer> s = new Stack<>();


        // 1. 스택이 비었으면 스택에 인덱스 추가
        // 2. 스택에 있는 인덱스에 해당하는 값과 비교하여 현재 값이 크다면 꺼낸 인덱스의 값을 현재 값으로 변경 및 인덱스 pop
        // 3. 현재 값의 인덱스 스택에 추가
        // 4. 2 ~ 3을 n번 반복
        // 5. 스택에 남아있는 모든 인덱스의 값을 -1로 변경

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            values[i] = val;

//            if(s.isEmpty()) s.push(i);
//            else {
//                while(values[s.peek()] < val){
//                    values[s.pop()] = val;
//                }
//                s.push(i);
//            }

            while (!s.isEmpty() && values[s.peek()] < val) {
                values[s.pop()] = val;
            }


            s.push(i);
        }

        while (!s.isEmpty()) {
            values[s.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int value : values) {
            sb.append(value).append(' ');
        }

        System.out.println(sb);
    }
}
