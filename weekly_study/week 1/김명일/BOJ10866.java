import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * BOJ10866 deque
 */
public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String operation = st.nextToken();

            switch (operation) {
                case "push_front": {
                    int value = Integer.parseInt(st.nextToken());
                    deque.addFirst(value);
                    break;
                }
                case "push_back": {
                    int value = Integer.parseInt(st.nextToken());
                    deque.addLast(value);
                    break;
                }
                case "pop_front": {
                    if (!deque.isEmpty()) System.out.println(deque.pollFirst());
                    else System.out.println(-1);
                    break;
                }
                case "pop_back": {
                    if (!deque.isEmpty()) System.out.println(deque.pollLast());
                    else System.out.println(-1);
                    break;
                }
                case "size": {
                    System.out.println(deque.size());
                    break;
                }
                case "empty": {
                    if(deque.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                }
                case "front": {
                    if(!deque.isEmpty()) System.out.println(deque.peekFirst());
                    else System.out.println(-1);
                    break;
                }
                case "back":{
                    if(!deque.isEmpty()) System.out.println(deque.peekLast());
                    else System.out.println(-1);
                    break;
                }
            }
        }
    }
}
