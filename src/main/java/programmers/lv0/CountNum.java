package programmers.lv0;

import java.util.Arrays;

public class CountNum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
    }
    public static int[] solution(int[] numList){
        int[] answer = {0,0};

        for(int num: numList){
            if(num%2==0) answer[0]++;
            else answer[1]++;
        }
        return answer;
    }
}
