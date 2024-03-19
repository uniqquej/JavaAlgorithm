package programmers.lv0;

import java.util.Arrays;

public class ConditionOfTriangle {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3}));

    }

    public static int solution(int[] sides){
        Arrays.sort(sides);
        return sides[0]+sides[1]>sides[2] ?1:2;
    }
}
