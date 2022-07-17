package week3.BOJ1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int numberCount = 0;
        for(int i = 0; i<count; i++){
            if(isPrime(Integer.parseInt(str[i]))) numberCount++;
        }

        System.out.println(numberCount);
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
