package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Divisor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(25)));
    }
    public static int[] solution(int n){
        List<Integer> answer = new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0) answer.add(i);
        }
        answer.add(n);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
