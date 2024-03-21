package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChooseAMultipleOfN {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));

    }

    public static int[] solution(int n, int[] numList){
        List<Integer> intList = new ArrayList<>();

        for(int i : numList){
            if(i%n==0) intList.add(i);
        }

        return intList.stream().mapToInt(x->x).toArray();
    }
}
