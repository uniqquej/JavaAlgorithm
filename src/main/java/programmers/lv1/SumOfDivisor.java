package programmers.lv1;

public class SumOfDivisor {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }

    public static int solution(int n){
        if(n==0) return 0;
        int answer = n;

        for(int i=1; i<=n/2; i++){
            if(n%i==0) answer += i;
        }
        return answer;
    }
}
