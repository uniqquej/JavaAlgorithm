package programmers.lv1;

public class Avg {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));

    }

    public static double solution(int[] arr){
        double answer = 0;
        for(int i: arr) answer += i;
        return answer/arr.length;
    }
}
