package programmers.lv0;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }
    public static int[] solution(int[] numList){
        int l = numList.length-1;
        int[] answer = new int[numList.length];

        for (int num: numList){
            answer[l] = num;
            l--;
        }
        return answer;
    }
}
