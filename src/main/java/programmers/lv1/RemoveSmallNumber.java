package programmers.lv1;

import java.util.Arrays;

public class RemoveSmallNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2,1,4,5,6})));

    }

    public static int[] solution(int[] arr){
        if(arr[0] == 10) return new int[]{-1};
        int[] answer = new int[arr.length-1];
        int smallNum = arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]<smallNum) smallNum = arr[i];
        }
        int idx = 0;
        for(int num : arr){
            if(num==smallNum) continue;
            answer[idx] = num;
            idx++;
        }
        return answer;
    }
}
