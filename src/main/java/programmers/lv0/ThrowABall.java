package programmers.lv0;

public class ThrowABall {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, 3));
    }
    public static int solution(int[] numbers, int k){
        // k번째 던지는 사람 = k-1번째 받은 사람
        int num = (k-1)*2;

        return numbers[num%numbers.length];

    }
}
