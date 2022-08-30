import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ14500 {
    static int[] drow = new int[]{1, -1, 0, 0};
    static int[] dcol = new int[]{0, 0, 1, -1};

    static int N;
    static int M;
    static int result = 0;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        map = new int[N][M];
        for (int i = 0; i <N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[N][M];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                ArrayList<int[]> nodes = new ArrayList<>();
                nodes.add(new int[]{i, j});
                bfs(nodes);
            }
        }

        System.out.println(result);
    }

    static void bfs(ArrayList<int[]> nodes) {
        if (nodes.size() == 4) {
            int sum = 0;
            for (int[] node : nodes) {
                sum += map[node[0]][node[1]];
            }

            result = Math.max(sum, result);
            return;
        }

        ArrayList<int[]> clone = (ArrayList<int[]>) nodes.clone();
        for (int[] node : clone) {
            int curRow = node[0];
            int curCol = node[1];

            for (int i = 0; i < 4; i++) {
                int nextRow = curRow + drow[i];
                int nextCol = curCol + dcol[i];

                if (nextRow < N && nextRow >= 0 && nextCol < M && nextCol >= 0 && !visited[nextRow][nextCol]) {
                    visited[nextRow][nextCol] = true;
                    int[] newNode = new int[]{nextRow, nextCol};
                    nodes.add(newNode);
                    bfs(nodes);
                    nodes.remove(newNode);
                    visited[nextRow][nextCol] = false;
                }
            }

        }
    }
}
