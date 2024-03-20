package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

public class Decryption {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk",4));

    }

    public static String solution(String cipher, int code){
        StringBuilder answer = new StringBuilder();

        for(int i =code-1; i<cipher.length(); i+=code){
            char c = cipher.charAt(i);
            answer.append(c);
        }
        return answer.toString();
    }
}