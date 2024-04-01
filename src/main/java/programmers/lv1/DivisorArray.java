package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DivisorArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10},5)));

    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for(int i : arr){
            if(i%divisor == 0) answer.add(i);
        }
        if(answer.isEmpty()) return new int[]{-1};

        answer.sort(Comparator.naturalOrder());
        return answer.stream().mapToInt(x->x).toArray();
    }

    public static int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(
                x -> x%divisor==0
        ).toArray();

        if(answer.length==0) return new int[]{-1};

        Arrays.sort(answer);
        return answer;

    }
}
