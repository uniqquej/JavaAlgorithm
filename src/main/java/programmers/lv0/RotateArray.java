package programmers.lv0;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3}, "left")));

    }

    public static int[] solution(int[] numbers, String direction){
        int[] answer = new int[numbers.length];

        if(direction.equals("left")){
            answer[numbers.length-1] = numbers[0];
            for (int i=0;i<numbers.length-1;i++){
                answer[i]=numbers[i+1];
            }
        }else{
            answer[0] = numbers[numbers.length-1];
            for(int i=numbers.length-1; i>0;i--){
                answer[i] = numbers[i-1];
            }
        }
        return answer;
    }
}
