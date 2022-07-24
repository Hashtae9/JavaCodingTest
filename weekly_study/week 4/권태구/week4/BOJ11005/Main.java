package week4.BOJ11005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = scan.nextInt();

        List<Character> list = new ArrayList<>();

        while(n>0){
            if(n%b < 10){
                list.add((char)(n%b+'0')); //10보다 작은 수는 숫자로 표현
            }else{
                list.add((char)(n%b-10+'A')); //10을 넘어가는 숫자는 대문자 알파벳으로 표현
            }
            n /=b;
        }

        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i));
        }
    }
}

//자바 아스키코드
// '0' = 48
// '1' = 49
// '2' = 50
// ...
// '9' = 57

// 'A' = 65

// 'a' = 97