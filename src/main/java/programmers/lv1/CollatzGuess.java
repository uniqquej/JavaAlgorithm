package programmers.lv1;

public class CollatzGuess {
    public static void main(String[] args) {
        System.out.println(solution(1));

    }

    public static int solution(int num){
        long n = (long)num; // 오버플로우 방지
        int answer = 0;

        while(n!=1){
            if(n%2==0) n /=2;
            else n = n*3 +1;
            
            answer ++;
            if(answer==500) return -1;
        }
        return answer;
    }
}
