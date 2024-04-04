package programmers.lv1;

public class CountAndSumDivisors {
    public static void main(String[] args) {
        System.out.println(solution(24,27));

    }

    public static int solution(int left, int right){
        int answer = 0;
        for(int num = left; num<=right;num++){
            int sqrt = (int)Math.sqrt(num);

            if(sqrt * sqrt == num) answer -= num;
            //if(num % Math.sqrt(num) ==0) answer -= num;
            else answer += num;
        }
        return answer;
    }
}
