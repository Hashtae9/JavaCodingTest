package BOJ10799;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stickStack = new Stack<>();

        String str = br.readLine();

        int stick = 0;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == ')') { //들어올 단어 : )
                stickStack.pop();
                if(str.charAt(i-1)=='(') { //가장 최신 단어 : (
                    stick += stickStack.size();
                }else if(str.charAt(i-1)==')'){
                    stick++;
                }
            }
            else{ // 들어올 단어 : (
                stickStack.push(str.charAt(i));
            }
        }
        System.out.println(stick);
    }

}
