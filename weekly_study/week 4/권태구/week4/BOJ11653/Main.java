package week4.BOJ11653;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean[] isNotPrime = new boolean[10000001]; //소수면 false, 소수가 아니면 true
        isNotPrime[0] = isNotPrime[1] = true;
        for(int i = 2; i*i<=10000000; i++){
            if(!isNotPrime[i]){
                for(int j = i+i; j<=10000000; j+=i){
                    isNotPrime[j] = true;
                }
            }
        }

        while(n!=1){
            for(int i = 2; i<10000000; i++){
                if(!isNotPrime[i]){
                    while(n%i == 0){
                        System.out.println(i);
                        n /=i;
                    }
                }
            }
        }
    }
}
