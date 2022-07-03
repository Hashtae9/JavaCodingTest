import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * BOJ10845 큐
 */
public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String operation = st.nextToken();

            switch (operation){
                case "push":{
                    int val = Integer.parseInt(st.nextToken());
                    q.offer(val);
                    break;
                }
                case "pop":{
                    if(!q.isEmpty()) System.out.println(q.pop());
                    else System.out.println(-1);
                    break;
                }
                case "size":{
                    System.out.println(q.size());
                    break;
                }
                case "empty":{
                    if(q.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                }
                case "front":{
                    if(!q.isEmpty()) System.out.println(q.peek());
                    else System.out.println(-1);
                    break;
                }
                case "back":{
                    if(!q.isEmpty()) System.out.println(q.getLast());
                    else System.out.println(-1);
                    break;
                }
            }
        }
    }
}
