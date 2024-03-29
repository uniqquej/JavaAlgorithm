package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class ChangeStringToInt {
    public static void main(String[] args) {
        System.out.println(solution("123"));

    }

    public static int solution(String s){
        int answer = 0;
        boolean sign = true;


        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='-') sign = false;
            else if(s.charAt(i)!='+') {
                answer *= 10;
                answer += s.charAt(i)-'0';
            }
        }
        return sign ?answer :-answer;
    }
}
