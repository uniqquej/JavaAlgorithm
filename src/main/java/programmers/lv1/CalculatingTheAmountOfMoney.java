package programmers.lv1;

public class CalculatingTheAmountOfMoney {
    public static void main(String[] args) {
        System.out.println(solution(3,40,4));

    }

    public static long solution(int price, int money, int count) {
        long answer = (long)money;

        for(int i=1; i<=count;i++){
            answer -= price*i;
        }
        if (answer>=0) return 0;
        return Math.abs(answer);
        //return answer>=0 ?0 :-answer;
    }
}
