package lv0;

public class SharePizza_1 {

    public static void main(String[] args) {
        System.out.println(solution(15));

    }
    public static int solution(int n){
        int answer = n/7;
        if (n%7 != 0) answer += 1;
        return answer;
    }

}

