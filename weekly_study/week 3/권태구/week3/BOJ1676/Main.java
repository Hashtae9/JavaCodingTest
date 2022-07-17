package week3.BOJ1676;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while(n >= 5){ //5의 배수가 추가될때 마다 0의 개수 증가
            count += n/5;
            n /= 5; //나가기 위한 break;
        }

        System.out.println(count);
    }
}
