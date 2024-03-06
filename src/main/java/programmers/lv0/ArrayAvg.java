package programmers.lv0;

public class ArrayAvg {
    public static void main(String[] args) {
        double ans = solution(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(ans);
    }

    public static double solution(int[] numbers) {
        double answer = 0;

        for(int num:numbers){
            answer += num;
        }
        return answer/numbers.length;

        //stream 사용하는 예제!
        //return Arrays.stream(numbers).average().orElse(0);
    }
}
