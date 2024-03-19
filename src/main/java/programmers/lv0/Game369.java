package programmers.lv0;

import java.util.List;

public class Game369 {
    public static void main(String[] args) {
        System.out.println(solution(29423));

    }
    public static int solution(int order){
        int answer = 0;
        // String str = order + "";
        String[] strArr = String.valueOf(order).split("");
        for(String s: strArr){
            if(s.equals("3")|s.equals("6")|s.equals("9")) answer++;
        }
        return answer;
    }
}
