package programmers.lv0;

public class Ant {
    public static void main(String[] args) {
        System.out.println(solution(999));

    }

    public static int solution(int hp){
         int answer = 0;
         answer += hp/5;
         hp %= 5;

         answer += hp/3;
         hp %=3;

         answer += hp;
         return answer;
    }
}
