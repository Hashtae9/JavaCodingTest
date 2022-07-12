package week2.BOJ10824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split(" ");
        int b = arr[1].length();
        int d = arr[3].length();
        int[] number = new int[4];
        for(int i = 0; i<4; i++){
            number[i] = Integer.parseInt(arr[i]);
        }

        double result = number[0]*Math.pow(10, b) + number[1] + number[2]*Math.pow(10,d) + number[3];
        System.out.printf("%.0f", result);
    }
}
