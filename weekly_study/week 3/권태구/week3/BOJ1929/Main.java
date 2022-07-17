package week3.BOJ1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        for(int i = a; i<=b; i++){
            if(isPrime(i)) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean isPrime(int a){
        if(a<2) return false;
        for(int i = 2; i*i<=a; i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}
