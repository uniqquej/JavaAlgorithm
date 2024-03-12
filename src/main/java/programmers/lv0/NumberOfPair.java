package programmers.lv0;

public class NumberOfPair {
    public static void main(String[] args) {
        System.out.println(solution(465));
    }
    public static int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                answer++;
                if(n/i==i)
                    return answer*2-1;
                if(n/i<i){
                    answer--;
                    break;
                }
            }
        }
        return answer*2;
    }
}
