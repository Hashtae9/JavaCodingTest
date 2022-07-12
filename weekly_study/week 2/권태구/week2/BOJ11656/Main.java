package week2.BOJ11656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] answer = new String[str.length()];
        for(int i = 0; i<str.length(); i++){
            answer[i] = str.substring(i, str.length());
        }

        Arrays.sort(answer);
        for(int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
