package programmers.lv1;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(solution(5,3));

    }

    public static int solution(int a, int b){
        int answer = 0;

        int temp = a;
        if(a>b) {
            temp = b;
            b = a;
        }

        for(int i = temp; i <= b; i++ ){
            answer += i;
        }
        return answer;
    }
}
