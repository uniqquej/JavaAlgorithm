package programmers.lv0;

import java.util.Arrays;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,8,3})));
    }

    public static int[] solution(int[] array){
        int[] answer = {array[0],0};

        for(int i=1; i<array.length;i++){
            if(array[i]>answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}
