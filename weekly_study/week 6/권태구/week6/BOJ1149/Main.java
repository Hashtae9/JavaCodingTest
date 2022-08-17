package week6.BOJ1149;

import java.util.Scanner;

public class Main {

    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;

    static int[][] DP;
    static int[][] COST;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        DP = new int[n][3]; // int[집의 개수][색]
        COST = new int[n][3]; //[n번째 집까지의 색칠 비용][1번집 2번집 3번집]

        for(int i = 0; i<n; i++){
            COST[i][RED] = scan.nextInt();
            COST[i][GREEN] = scan.nextInt();
            COST[i][BLUE] = scan.nextInt();
        }

        DP[0][RED] = COST[0][RED];
        DP[0][GREEN] = COST[0][GREEN];
        DP[0][BLUE] = COST[0][BLUE];

        System.out.print(Math.min(Paint_cost(n-1,RED), Math.min(Paint_cost(n-1, GREEN), Paint_cost(n-1, BLUE))));
    }

    static int Paint_cost(int N, int color){
        if(DP[N][color] == 0){

            // color의 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장한다
            if(color == RED) {
                DP[N][RED] = Math.min(Paint_cost(N - 1, GREEN), Paint_cost(N - 1, BLUE)) + COST[N][RED];
            }
            else if(color == GREEN) {
                DP[N][GREEN] = Math.min(Paint_cost(N - 1, RED), Paint_cost(N - 1, BLUE)) + COST[N][GREEN];
            }
            else {
                DP[N][BLUE] = Math.min(Paint_cost(N - 1, RED), Paint_cost(N - 1, GREEN)) + COST[N][BLUE];
            }
        }
        return DP[N][color];
    }
}
