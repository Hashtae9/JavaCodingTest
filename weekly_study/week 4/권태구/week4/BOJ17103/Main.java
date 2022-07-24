package week4.BOJ17103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        //소수는 false 나머진 true
        boolean[] isNotPrime = new boolean[1000001];
        isNotPrime[0] = isNotPrime[1] = true;
        for(int i = 2; i*i <= 1000000; i++){
            if(!isNotPrime[i]){
                for(int j = i + i; j <= 1000000; j += i){
                    isNotPrime[j] = true;
                }
            }
        }

        while(count-- > 0){
            int a = Integer.parseInt(br.readLine());
            int ans = 0;
            for(int i = 2; i <= a/2; i++){
                if(!isNotPrime[i] && !isNotPrime[a-i]) ans++;
            }
            System.out.println(ans);
        }
    }
}
//에라토스테네스의 체
//https://firework-ham.tistory.com/8
//0, 1 제외 후 소수가 되는 수의 배수를 지우면 남은건 소수가 된다는 점을 이용