import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3085 {
    static int[][] d = new int[][]{{0, 1}, {1, 0}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        char[][] map = new char[n][n];
        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 현재 위치에 오른쪽 또는 아래 값이 현재 값과 다르면 교체하고 전체를 확인하며 최대개수 확인 후 다시 교체하여 원상복구 시킴
                for (int k = 0; k < 2; k++) {
                    int ni = i + d[k][0];
                    int nj = j + d[k][1];
                    if (ni < n && nj < n && map[i][j] != map[ni][nj]) {
                        swap(i, j, ni, nj, map);
                        for (int l = 0; l < n; l++) {
                            int count = 1;
                            char prev = map[l][0];
                            for (int m = 1; m < n; m++) {
                                char cur = map[l][m];
                                if (cur == prev) {
                                    count += 1;
                                    result = Math.max(result, count);
                                }else {
                                    prev = cur;
                                    count = 1;
                                }
                            }

                            count = 1;
                            prev = map[0][l];
                            for (int m = 1; m < n; m++) {
                                char cur = map[m][l];
                                if (cur == prev) {
                                    count += 1;
                                    result = Math.max(result, count);
                                }else {
                                    prev = cur;
                                    count = 1;
                                }
                            }


                        }

                        swap(i, j, ni, nj, map);
                    }

                }
            }
        }

        System.out.println(result);
    }

    static void swap(int i, int j, int k, int l, char[][] map) {
        char temp = map[i][j];
        map[i][j] = map[k][l];
        map[k][l] = temp;
    }


}
