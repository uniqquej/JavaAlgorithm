package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexing {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] numbers, int num1, int num2){
        int[] answer = new int[num2-num1+1];
        int idx = 0;
        for (int i=num1;i<=num2;i++){
            answer[idx] = numbers[i];
            idx++;

            //1. i를 0으로 만들어 줌
            // answer[i -num1] = numbers[i];
        }
        return answer;

        //2. Arrays method
        // return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
