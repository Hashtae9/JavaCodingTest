package week2.BOJ10808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];

        String str = br.readLine();

        for(int i = 0; i<str.length(); i++){
            count[str.charAt(i)-'a']++;
        }

        for(int j = 0; j<26; j++){
            if(j==25) sb.append(count[j]);
            else sb.append(count[j]).append(" ");
        }
        System.out.println(sb);
    }
}
