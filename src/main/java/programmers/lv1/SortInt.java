package programmers.lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortInt {
    public static void main(String[] args) {
        System.out.println(solution(118372));

    }

    public static long solution(long n){
        long answer = 0;
        List<Long> nums = new ArrayList<>();

        while (n>0){
            nums.add(n%10);
            n /= 10;
        }

        nums.sort(Comparator.reverseOrder());

        for(long num: nums){
            answer *= 10;
            answer += (num);
        }
        return answer;
    }
}
