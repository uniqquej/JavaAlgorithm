package programmers.lv0;

public class BacterialGrowth {
    public static void main(String[] args) {
        System.out.println(solution(2,10));

    }

    public static int solution(int n, int t){
        int answer = n;
        for(int i=1; i<=t; i++) answer *=2;
        return answer;
    }
}
