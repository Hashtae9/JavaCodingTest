package week3.BOJ2004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        int five = fiveCount(a) - fiveCount(b) - fiveCount(a-b);
        int two = twoCount(a) - twoCount(b) - twoCount(a-b);

        System.out.println(Math.min(five, two));
    }

    public static int fiveCount(int n){
        int result = 0;
        while(n>=5){
            result += n/5;
            n /= 5;
        }
        return result;
    }

    public static int twoCount(int n){
        int result = 0;
        while(n>=2){
            result += n/2;
            n /= 2;
        }
        return result;
    }
}
