package lv0;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"We", "are", "the", "world!"})));
    }

    public static int[] solution(String[] strList){
        int[] answer = new int[strList.length];
        int i=0;
        for(String str:strList){
            answer[i] = str.length();
            i++;
        }
        return answer;
    }
}
