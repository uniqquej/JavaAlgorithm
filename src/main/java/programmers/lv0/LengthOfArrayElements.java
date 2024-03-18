package programmers.lv0;

import java.util.Arrays;

public class LengthOfArrayElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"We", "are", "the", "world!"})));

    }

    public static int[] solution(String[] strList){
        int[] answer = new int[strList.length];
        int i = 0;
        for(String s: strList){
            answer[i] = s.length();
            i++;
        }
        return answer;

    }
}
