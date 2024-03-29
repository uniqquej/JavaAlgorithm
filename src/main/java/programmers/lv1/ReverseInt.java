package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));

    }
    public static int[] solution(long n) {
        List<Long> answer = new ArrayList<>();
        while (n > 0){
            answer.add(n%10);
            n /= 10;
        }
        return answer.stream().mapToInt(Long::intValue).toArray();

    }
}
