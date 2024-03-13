package programmers.lv0;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MakeIt2D {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }

    public static int[][] solution(int[] numList, int n){
        int column = n;
        int row = numList.length / n;

        int[][] answer = new int[row][column];

        int idx = 0;

        for(int i=0; i<row;i++){
            for(int j=0; j<column; j++){
                answer[i][j] = numList[idx];
                idx++;
            }
        }

        /*
        //2중 for문 사용할 필요 없음
        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i];
        }*/
        return answer;
    }
}
