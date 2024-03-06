package programmers.lv0;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, -1, 0}));
    }

    public static int solution(int[] array){
        int[] newArr = Arrays.stream(array).sorted().toArray();
        return newArr[array.length/2];

        /*
        // 기존의 배열 정렬하기
        Arrays.sort(array);
        int answer = array[array.length/2];*/
    }
}
