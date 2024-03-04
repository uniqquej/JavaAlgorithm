package lv0;

import java.util.Arrays;
import java.util.HashMap;

public class ModeFinder {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2, 2}));
    }

    public static int solution(int[] array){
        Arrays.sort(array);
        int maxNum = array[array.length-1];
        int[] countArr = new int[maxNum+1];
        // int[] countArr = new int[maxNum]으로 맞추고, 답을 i-1로 했더니 런타임 에러 발생 > 반례찾기

        for(int num:array){
            countArr[num]++;
        }

        int temp = countArr[0];
        int answer = 1;

        for(int i=1; i<countArr.length;i++){
            if(temp<countArr[i]){
                temp = countArr[i];
                answer = i;
            }else if(temp==countArr[i]){
                answer = -1;
            }
        }
        return answer;

    }
}
