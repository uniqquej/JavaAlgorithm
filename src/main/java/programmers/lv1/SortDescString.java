package programmers.lv1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortDescString {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));

    }

    public static String solution(String s){
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.split("");
        Arrays.sort(strArr);

        for(int i=strArr.length-1; i>=0;i--){
            answer.append(strArr[i]);
        }
        return answer.toString();
    }
}
