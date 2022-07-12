package week2.BOJ1918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<str.length(); i++){
            switch (str.charAt(i)){
                case '*' : case '+' : case '-' : case '/' :
                    while(!stack.isEmpty() && priority(stack.peek()) >= priority(str.charAt(i))){
                        sb.append(stack.pop());
                    }
                    stack.push(str.charAt(i));
                    break;
                case '(' :
                    stack.push(str.charAt(i));
                    break;
                case ')' :
                    while(!stack.isEmpty()){
                        if(stack.peek() == '(') {
                            stack.pop();
                            break;
                        }
                        sb.append(stack.pop());
                    }
                    break;
                default:
                    sb.append(str.charAt(i));
                    break;
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    public static int priority(char c){
        if(c == '*' || c == '/') return 2;
        else if(c == '+' || c == '-') return 1;
        else return 0;
    }
}
